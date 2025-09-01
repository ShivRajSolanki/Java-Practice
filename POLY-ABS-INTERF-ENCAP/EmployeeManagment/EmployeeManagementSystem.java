/*Employee Management System
● Description: Build an employee management system with the following requirements:
○ Use an abstract class Employee with fields like employeeId, name, and
baseSalary.
○ Provide an abstract method calculateSalary() and a concrete method
displayDetails().
○ Create two subclasses: FullTimeEmployee and PartTimeEmployee,
implementing calculateSalary() based on work hours or fixed salary.
○ Use encapsulation to restrict direct access to fields and provide getter and setter
methods.
○ Create an interface Department with methods like assignDepartment() and
getDepartmentDetails().
○ Ensure polymorphism by processing a list of employees and displaying their
details using the Employee reference */

package EmployeeManagment;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String args[]){
        //array list to store empolyee
ArrayList<Employee> employees = new ArrayList<>();
//create object
FullTimeEmployee emp1 = new FullTimeEmployee(123,"Vivek", 50000, 50000);
//assign department
emp1.assignDepartment("HR");
//adding in list
employees.add(emp1);
PartTimeEmployee emp2 = new PartTimeEmployee(124, "Nikhil", 30000,3,400);
//assign department
emp2.assignDepartment("IT");
//adding in list
employees.add(emp2);
//displaying emp
for(Employee emp : employees){
emp.displayDetails();
System.out.println();
}
}

    }
    
