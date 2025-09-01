package EmployeeManagment;

public  abstract class Employee {
    private int employeeID;
    private String name;
    private double baseSalary;

    //Constructor
    public Employee(int emloyeeID,String name, double baseSalary){
        this.employeeID = emloyeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    


    //abstract method
    abstract public double calculateSalary();

    //getters and setters 

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //default method
    public void displayDetails(){
        System.out.println("Name -"+name);
        System.out.println("Base salary "+baseSalary);
        System.out.println("emloyeeID "+ employeeID);

    }

    

    
}
