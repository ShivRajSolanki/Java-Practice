package RideHailingApplication;

public class Auto extends Vehicle implements GPS {
     private String currentLocation;
    public Auto(String vehicleId, String driverName, double ratePerKm) {
  super(vehicleId, driverName, ratePerKm);
  this.currentLocation = "Unknown"; // Initial location
}
@Override
public double calculateFare(double distance) {
return getRatePerKm() * distance; // Calculate fare based on rate per km
}
@Override
public String getCurrentLocation() {
return currentLocation; // Return the current location
}
public void updateLocation(String location){
    this.currentLocation= location;
}
    
}
