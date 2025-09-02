package RideHailingApplication;

public class Bike extends Vehicle implements GPS {

    private String currentLocation;
// Constructor
   public Bike(String vehicleId, String driverName, double ratePerKm) {
   super(vehicleId, driverName, ratePerKm);
   this.currentLocation = "Unknown";
   }

     public double calculateFare(double Distance){
        return getRatePerKm()*Distance;
     }

     public String getCurrentLocation(){
        return currentLocation;
     }
     public void updateLocation(String location){
        this.currentLocation= location;
     }

     
}
