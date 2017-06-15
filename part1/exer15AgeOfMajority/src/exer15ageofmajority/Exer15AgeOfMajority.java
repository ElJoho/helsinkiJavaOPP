package exer15ageofmajority;
import java.util.Scanner;

/**
 *
 * @author ElJoho
 */
public class Exer15AgeOfMajority {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       double age ;
       
       System.out.print("How old are you?: ");
       age = Double.parseDouble(reader.nextLine());
       System.out.print("\n");
       if( age < 18){
           System.out.println("You have not reached the age of majority yet!");
       } else if ( 18 >= 0) {
           System.out.println("You have reached the age of majority!");
       };
    
    }
    
}
