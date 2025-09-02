package RideHailingApplication;

public class RideHailingApplicationController {
    // Method to calculate and display fare for a ride
public static void calculateFareForRide(Vehicle vehicle, double distance) {
// Polymorphism: Calculate fare for different types of vehicles
System.out.println(vehicle.getVehicleDetails());
System.out.println("Fare for " + vehicle.getDriverName() + ": " +
vehicle.calculateFare(distance));
}
public static void main(String[] args) {


    // Create vehicle objects
Vehicle car = new Car("C001", "Raj", 10); // Rate per Km: 10
Vehicle bike = new Bike("B001", "Vijay", 5); // Rate per Km: 5
Vehicle auto = new Auto("A001", "Kunal", 7); // Rate per Km: 7


// Update locations for each vehicle
((GPS) car).updateLocation("Bhopal");
((GPS) bike).updateLocation("Vidisha");
((GPS) auto).updateLocation("Sehore");


// Calculate and display fare for each vehicle
calculateFareForRide(car, 15); // Distance: 15 km
calculateFareForRide(bike, 20); // Distance: 20 km
calculateFareForRide(auto, 10); // Distance: 10 km


// Display current locations of each vehicle
System.out.println("Car current location: " + ((GPS)
car).getCurrentLocation());
System.out.println("Bike current location: " + ((GPS)
bike).getCurrentLocation());
System.out.println("Auto current location: " + ((GPS)
auto).getCurrentLocation());
}
}

