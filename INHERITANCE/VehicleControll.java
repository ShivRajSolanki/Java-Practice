/*Vehicle Management System with Hybrid Inheritance
○ Description: Model a vehicle system where Vehicle is the superclass and
ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a
Refuelable interface implemented by PetrolVehicle.
○ Tasks:
■ Define a superclass Vehicle with attributes like maxSpeed and model.
■ Create an interface Refuelable with a method refuel().
■ Define subclasses ElectricVehicle and PetrolVehicle.
PetrolVehicle should implement Refuelable, while
ElectricVehicle include a charge() method.
○ Goal: Use hybrid inheritance by having PetrolVehicle implement both
Vehicle and Refuelable, demonstrating how Java interfaces allow adding
multiple behaviors. */

class Vehicle{
 int maxSpeed;
 String model;
            public Vehicle(int maxSpeed,String model){
                this.maxSpeed = maxSpeed;
                this.model = model;
            }
            public void displayDetails(){
                System.out.println("Model "+model);
                System.out.println("maxSpeed "+ maxSpeed +" Km/H");
            }


}
interface Refuelable{
    public void refuel();
}
class ElectricVehicle extends Vehicle{
      private int batteryCapacity;

    public ElectricVehicle(int maxSpeed,String model, int batteryCapacity){
        super(maxSpeed, model);
        this.batteryCapacity=batteryCapacity;
    }
    public void charge(){
        System.out.println("Charging");
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("battery capacity "+batteryCapacity);
    }

}
class PetrolVehicle extends Vehicle implements Refuelable{
    private int fuelCapacity;
    public PetrolVehicle(int maxSpeed, String model,int fuelCapacity){
        super(maxSpeed,model);
        this.fuelCapacity = fuelCapacity;
    }
    public void refuel(){
        System.out.println("refueling");
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("fuel capacity "+ fuelCapacity+"liters");
    }
}

public class VehicleControll {
    public static void main(String args[]){
        ElectricVehicle obj1 = new ElectricVehicle(200,"Hummer Ev", 500);
        PetrolVehicle obj2 = new PetrolVehicle(300, "Rolls Royce", 60);

        System.out.println("Electric vehicle details");
        obj1.charge();
        obj1.displayDetails();

        System.out.println("--------------------------------");

        System.out.println("Petrol vehicle details");
        obj2.refuel();
        obj2.displayDetails();

    }
}
