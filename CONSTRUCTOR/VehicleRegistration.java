/*Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
● Instance Variables: ownerName, vehicleType.
● Class Variable: registrationFee (fixed for all vehicles).
● Methods:
○ An instance method displayVehicleDetails() to display owner and vehicle
details.
○ A class method updateRegistrationFee() to change the registration fee */

class Vehicle{
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;
    // constructor
    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    public void  displayVehicleDetails(){
        System.out.println("Owner name = "+ ownerName);
        System.out.println("vehicleType = "+vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    public static void updateRegistrationFee(double registrationFee){
        registrationFee = registrationFee;

    }

}

public class VehicleRegistration{

    public static void main(String args[]){
      Vehicle vehicle1 = new Vehicle("Shivraj", "Car");
      Vehicle vehicle2 = new Vehicle("Riya", "Motorcycle");

           System.out.println("Intial Details");
            vehicle1.displayVehicleDetails();
            System.out.println("--------------------------");
            vehicle2.displayVehicleDetails();

            Vehicle.updateRegistrationFee(2500);
            System.out.println("After Updatation the details are ");
            vehicle1.displayVehicleDetails();
            System.out.println("-----------------------------");
            vehicle2.displayVehicleDetails();

    }

}
