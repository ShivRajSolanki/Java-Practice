package EmployeeManagment;

public class FullTimeEmployee extends Employee implements Department {
  private double fixedSalary;
private String department;
//constructor
FullTimeEmployee(int employeeID, String name, double baseSalary, double
fixedSalary){
super(employeeID,name,baseSalary);
this.fixedSalary = fixedSalary;
}
//assigning department
@Override
public void assignDepartment(String departmentName) {
this.department = departmentName;
}
//getting departmemt
@Override
public String getDepartmentDetails(){
    return "Department: " + department;
} 
// Implement calculateSalary
@Override
public double calculateSalary(){
return fixedSalary;
}
//overriding display Details
@Override
public void displayDetails(){
super.displayDetails();
System.out.println("Fixed Salary: " + fixedSalary);
System.out.println("Total Salary: " + calculateSalary());
}
} 
