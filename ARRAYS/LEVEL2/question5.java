/*Create a program to find the bonus of 10 employees based on their years of service and the
total bonus amount the company Zara has to pay, along with the old and new salary.
Hint =>
a. Zara decides to give a bonus of 5% to employees whose year of service is more than 5
years or 2% if less than 5 years
b. Define a double array to save salary and years of service for each of the 10 employees
c. Also define a double array to save the new salary and the bonus amount as well as
variables to save the total bonus, total old salary, and new salary
d. Define a loop to take input from the user. If salary or year of service is an invalid number
then ask the use to enter again. Note in this case you will have to decrement the index
counter
e. Define another loop to calculate the bonus of 10 employees based on their years of
service. Save the bonus in the array, compute the new salary, and save in the array.
Also, the total bonus and total old and new salary can be calculated in the loop
f. Print the total bonus payout as well as the total old and new salary of all the employees
im */

package LEVEL2;
import java.util.*;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int numEmloyees = 10;
       Double[] salary = new Double[numEmloyees];
       Double[]yearsOfService = new Double[numEmloyees];

       Double []bonus = new Double[numEmloyees];
       Double []newSalary = new Double[numEmloyees];

       Double totalBonus = 0.0;
       Double totalOldSalary = 0.0;
       Double totalNewSalary = 0.0;
       for(int i =0; i<numEmloyees; i++){
        System.out.println("Enter Salry");
        salary[i]= sc.nextDouble();
        System.out.println("Enter year of service");
        yearsOfService[i]= sc.nextDouble();

        //invalid input handling
        if(salary[i]<0 || yearsOfService[i]<0){
            System.out.println("please enter again");
            i--;
        }
    
       }
       for (int i =0; i<numEmloyees; i++){
           if(yearsOfService[i]>5){
             bonus[i] = salary[i]*0.05;       
       }
       else{
        bonus[i] = salary[i]*0.02;
       }
       newSalary[i] = salary[i]+bonus[i];

       totalBonus+=bonus[i];
       totalOldSalary+=salary[i];
       totalNewSalary+=newSalary[i];

      
    }
    System.out.println("Employees bonus details");
    for(int i =0; i <numEmloyees;i++){
        System.out.println("Employee "+i+" Salary "+salary[i]+" year of service "+yearsOfService[i]+" bonus "+bonus[i]+" New salary "+newSalary[i]);
    }
    System.out.println("Total Old Salary "+totalOldSalary+" Total bonus "+totalBonus+" Total new salary "+totalNewSalary);
    sc.close();

    }
}
