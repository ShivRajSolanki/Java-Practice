/*Create a program to find the mean height of players present in a football team.
Hint =>
a. The formula to calculate the mean is: mean = sum of all elements / number of elements
b. Create a double array named heights of size 11 and get input values from the user.
c. Find the sum of all the elements present in the array.
d. Divide the sum by 11 to find the mean height and print the mean height of the football
team
 */
import java.util.*;
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double [] heights = new Double[11];
        Double total = 0.0;


        for(int i =0; i<heights.length; i++){
            heights[i] = sc.nextDouble();
        }
        for(double n:heights){
          total+=n;
        }
        System.out.println("Mean height of the player is "+total/heights.length);
         sc.close();
    }
    
}
