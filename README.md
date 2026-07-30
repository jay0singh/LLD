# LLD Practice — Food Delivery Platform

Practicing LLD/machine coding concepts one at a time, all modeled on a single
Food Delivery domain (`Restaurant`, `DeliveryPartner`, `Order`, `Customer`).
Each section below covers one concept: the problem it solved and how the
code in this repo achieves it.

---

## 1. Composition vs Inheritance
`fundamentals/composition_vs_inheritance/`

**Problem:** Delivery partners use different vehicles (Bike, MotorBike,
Scooter), each with different speed/capacity. Partners must be able to
switch vehicles between shifts, and new vehicle types must be addable
without touching existing code.

**Inheritance version** (`inheritance/`)
- `DeliveryVehicle` is the base class; `Bike`, `MotorBike`, `Scooter` extend
  it and set distinct `speed`/`weight` via `super(...)`.
- `DeliveryPartner` does **not** extend a vehicle type — it holds a
  `DeliveryVehicle` reference, injected via constructor and reassignable via
  `assignVehicle()`.
- `eta()` calls `vehicle.timeTaken(dist)` polymorphically.

**Composition version** (`composition/`)
- Vehicle "type" is modeled as pure data — a single `DeliveryVehicle` class
  configured with different `speed`/`weight` values, no subclassing at all.
- `DeliveryPartner` holds a `DeliveryVehicle` reference (constructor-injected,
  swappable via `assignVehicle(DeliveryVehicle)`).

**Takeaway:** Both approaches handle "add a new vehicle type" equally well
(Open/Closed via a new subclass, or via new constructor arguments).
Where they differ is runtime flexibility — composition allows a partner's
vehicle reference to be reassigned freely; a class hierarchy is fixed at
construction. The exercise avoided `DeliveryPartner extends Vehicle`
specifically because "is-a" didn't hold and it would have broken vehicle
switching entirely.

---

## 2. Interfaces vs Abstract Classes
`fundamentals/interface_vs_abstract/`

**Problem:** Every vehicle must report speed/capacity (universal contract).
Only fuel/battery-powered vehicles (MotorBike) share fuel-tracking state and
a default `refuel()` implementation; a plain `Bike` (bicycle) has no such
concept at all.

- `interface_/Report.java` — pure contract, no state:
  `reportSpeed()`, `reportMaxWeight()`.
- `abstract_/Refuel.java` — abstract class `implements Report`, holds shared
  state (`fuel`, `cost`) and a shared implemented `refuel()` method, with one
  genuine variation point left abstract (`fuelType()`).
- `abstract_/MotorBike.java` — fuel-powered, extends `Refuel`, supplies
  `fuelType()`, inherits `refuel()` for free.
- `abstract_/Bike.java` — bicycle, implements `Report` directly, bypasses
  `Refuel` entirely since it shares no implementation with it.

**Takeaway:** Interface = "must expose this behavior" (pure contract, no
state). Abstract class = "these specific types share this behavior *and*
this state, but not all implementers do."

---

## 3. Association vs Aggregation vs Composition
`fundamentals/association_aggregation_composition/`

**Problem:** Model three different strengths of relationship correctly.

- **`Customer` ↔ `Order` — Association.** `Order.orderedBy(Customer)` stores
  the reference (`this.customer = customer`) as persistent state, but
  neither object owns the other's lifecycle — an `Order` still exists if the
  `Customer` account is later deleted.
- **`Order` ↔ `OrderItem` — Composition.** `Order` is the *only* thing that
  ever constructs an `OrderItem` (`setOrderItems(List<String> dishes)` takes
  raw dish names and builds `OrderItem`s internally — it never accepts
  pre-built `OrderItem` objects from outside). This keeps items from being
  shared or outliving their order.
- **`Restaurant` ↔ `Menu` — Aggregation.** `Menu` is built externally and
  injected into `Restaurant`'s constructor, and can be swapped later via
  `setMenu()`. A `Menu` can exist and be constructed independently of any
  particular `Restaurant`.

**Takeaway:** The relationship type is determined by **who creates/owns the
object and whether it can exist independently** — not by cardinality
(one vs many) and not by whether raw data crosses a method boundary.

---

## 4. SOLID — Single Responsibility Principle
`solid/srp/`

**Problem:** `Order` was at risk of doing too much — computing bills,
persisting itself, and sending notifications — making unrelated changes
(e.g. new tax rules, adding SMS) risk breaking each other.

- `Order` — holds order data only (`items`, `customer`, `total`).
- `Total` — the only class that computes the bill amount.
- `SaveOrder` — the only class responsible for persistence (stubbed).
- `Notification` — the only class responsible for composing/sending a
  message; it reads an **already-computed** `order.getTotal()` rather than
  calling `Total` itself, so it has no dependency on how billing works.
- `main.java` — a coordinator with no responsibility of its own beyond
  sequencing: `takeOrder` → `getFinalAmount` → `save` → `sendNotification`.

**Takeaway:** SRP doesn't mean classes can't call each other — it means each
class should have one reason to change. The key design decision was pulling
orchestration *out* of any specialist class (it was tempting to bolt it onto
`SaveOrder` or `Notification`) and into a dedicated coordinator that owns
*only* the sequencing.

---

## 5. SOLID — Open/Closed Principle
`solid/ocp/`, wired into `solid/srp/Total.java`

**Problem:** New discount/promotion types (flat %, BOGO, coupon,
first-order-only) get added regularly. Adding one shouldn't require editing
the code that already computes totals for existing discount types.

- `Discount` — interface with one method, `getDiscount(Order order)`.
- `BOGO`, `FlatPercentage` — concrete promotion types implementing it.
- `Order` holds a `Discount` reference (`setDiscount`/`getDiscount`).
- `Total.getFinalAmount()` calls `order.getDiscount().getDiscount(order)`
  polymorphically — **no `if`/`switch` on discount type anywhere inside
  `Total`.**

**Takeaway:** OCP is the goal ("open for extension, closed for
modification"); polymorphism via a shared interface is the mechanism.
Proof it's satisfied: adding a new promotion type (e.g.
`FirstOrderOnlyDiscount`) requires writing exactly one new class — `Total`'s
source is never touched.
