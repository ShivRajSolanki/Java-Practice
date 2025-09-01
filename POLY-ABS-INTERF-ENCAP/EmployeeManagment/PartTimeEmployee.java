package EmployeeManagment;

public class PartTimeEmployee extends Employee implements Department {
    
    private double workHour;
private double hourlyRate;
private String department;
//constuctor
PartTimeEmployee(int employeeID, String name, double baseSalary, double
workHour, double hourlyRate )
{
super(employeeID,name,baseSalary);
this.workHour = workHour;
this.hourlyRate = hourlyRate;
}
//assigning department
@Override
public void assignDepartment(String departmentName) {
this.department = departmentName;
}
//getting department
@Override
public String getDepartmentDetails() {
return "Department: " + department;
}
//calculating salary
@Override
public double calculateSalary(){
return workHour*hourlyRate;
}
//display details
@Override
public void displayDetails(){
super.displayDetails();
System.out.println("Hours Worked: " + workHour);
System.out.println("Hourly Rate: " + hourlyRate);
System.out.println("Total Salary: " + calculateSalary());
}
}



