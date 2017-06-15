package exer14apositivenumber;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer14APositiveNumber {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       double number ;
       
       System.out.print("Type a number: ");
       number = Double.parseDouble(reader.nextLine());
       System.out.print("\n");
       if( number < 0){
           System.out.println("The number is negative.");
       } else if ( number > 0) {
           System.out.println("The number is positive.");
       } else{
           System.out.println("The number is 0.");
       };
       
    }
    
}
