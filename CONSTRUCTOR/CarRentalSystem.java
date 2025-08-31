/*Car Rental System: Create a CarRental class with attributes customerName,
carModel, and rentalDays. Add constructors to initialize the rental details and
calculate total cost. */

class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    static double rentPerDay = 500;

   public CarRental(String customerName, String carModel, int rentalDays){
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
    }
    public double totalCost(){
        double cost = rentPerDay * rentalDays;
        return cost;

    }

    public void display (){
        System.out.println("Customer name = "+ customerName);
        System.out.println("carModel "+ carModel);
        System.out.println("rentalDays "+ rentalDays);
        System.out.println("Total cost "+totalCost());
    }
}
public class CarRentalSystem {
   public static void main(String args[]){
    CarRental car1 = new CarRental("Shivraj", "TATA Nexon", 5);
      car1.display();
   } 
}
