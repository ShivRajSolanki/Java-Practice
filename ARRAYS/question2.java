/*Write a program to take user input for 5 numbers and check whether a number is positive,
negative, or zero. Further for positive numbers check if the number is even or odd. Finally
compare the first and last elements of the array and display if they equal, greater or less
Hint =>
a. Define an integer array of 5 elements and get user input to store in the array.
b. Loop through the array using the length If the number is positive, check for even or odd
numbers and print accordingly
c. If the number is negative, print negative. Else if the number is zero, print zero.
d. Finally compare the first and last element of the array and display if they equal, greater
or less */
import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
        for(int i =0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();

        }
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]>0){
                System.out.println(numbers[i]+" Number is postive");
            }
            else if(numbers[i]<0){
                System.out.println(numbers[i]+" Number is negetive");
            }
            else{
                System.out.println(numbers[i]+"number is zero");
            }
        }
        if(numbers[0]>numbers[numbers.length-1]){
            System.out.println("first element is greater than last");
        }
         if(numbers[0]<numbers[numbers.length-1]){
            System.out.println("first element is less than last");
        }
         else{
            System.out.println("first element is equal to last");
        }
        sc.close();
    }
    
}
