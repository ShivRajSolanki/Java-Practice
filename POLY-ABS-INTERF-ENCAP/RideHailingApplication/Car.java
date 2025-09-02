package RideHailingApplication;

public class Car extends Vehicle implements GPS {
    private String currentLocation;
    // Constructor
public Car(String vehicleId, String driverName, double ratePerKm) {
super(vehicleId, driverName, ratePerKm);
this.currentLocation = "Unknown"; // Initial location
}
@Override
public double calculateFare(double Distance) {
return getRatePerKm() * Distance; // Calculate fare based on rate per km
}
@Override
public String getCurrentLocation() {
return currentLocation; // Return the current location
}
@Override
public void updateLocation(String location) {
this.currentLocation = location; // Update the current location
}
}
    

