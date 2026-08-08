package design_patterns.structural.adapter;

public class ThirdPartyGpsAdapter implements GpsTracker {

    private final ThirdPartyGpsDevice adaptee;
    
    public ThirdPartyGpsAdapter(ThirdPartyGpsDevice adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public Location getCurrentLocation() {

        String location = adaptee.fetchCoordinates();
        String[] coordindates = location.split(",");
        double latitude = Double.parseDouble(coordindates[0]);
        double longitude = Double.parseDouble(coordindates[1]);
        return new Location(latitude, longitude);
    }

}
