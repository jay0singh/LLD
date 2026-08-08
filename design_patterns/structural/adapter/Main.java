package design_patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        ThirdPartyGpsDevice device = new ThirdPartyGpsDevice();
        GpsTracker tracker = new ThirdPartyGpsAdapter(device);

        Location location = tracker.getCurrentLocation();
        System.out.println("Lat: " + location.getLatitude() + ", Lng: " + location.getLongitude());
    }
}
