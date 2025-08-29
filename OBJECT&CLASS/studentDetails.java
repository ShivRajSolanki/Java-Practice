/*Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and
marks. Add two methods:
● To calculate the grade based on the marks.
● To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as
attributes. Methods are used to calculate the grade and provide a way to display all
information.*/
class Student{
    String name;
    int rollNumber;
    int marks;
    public Student(String name,int rollNumber,int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }
    public char grade(int marks){
        
        if(marks>=90){
           return 'A';
        }
        else if(marks>=80){
            return 'B';
        }
        else if(marks>=70){
            return 'C';
        }
        else{
            return 'D';
        }
    }
    public void displayDetails(){
        System.out.println("Name = "+name+" rollNumber = "+rollNumber+" marks = "+marks+" grade = "+grade(marks));
    }
}
public class studentDetails {
    public static void main(String args[]){
        Student st1 = new Student("Shivraj",175,92);
         Student st2 = new Student("Riya",146,79);

         st1.displayDetails();
         st2.displayDetails();

    }
    
}
