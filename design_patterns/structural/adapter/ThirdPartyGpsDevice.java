package design_patterns.structural.adapter;

// Adaptee: third-party SDK class with an incompatible interface.
// Treat this as un-editable vendor code - don't change its shape.
public class ThirdPartyGpsDevice {
    public String fetchCoordinates() {
        return "12.9716,77.5946";
    }
}
