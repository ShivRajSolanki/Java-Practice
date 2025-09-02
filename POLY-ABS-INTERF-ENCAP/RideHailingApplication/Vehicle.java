package RideHailingApplication;

public abstract class Vehicle {
    private String driverName;
    private String vehicleId;
    private double ratePerKm;

    public Vehicle(String driverName, String vehicleId, double ratePerKm){
        this.driverName = driverName;
        this.vehicleId = vehicleId;
        this.ratePerKm = ratePerKm;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double Distance);


    public String getVehicleDetails(){
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km:" + ratePerKm;
    }

    
    
}
