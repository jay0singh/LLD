package design_patterns.structural.adapter;

// Target: the interface DeliveryPartner's code already expects.
public interface GpsTracker {
    Location getCurrentLocation();
}
