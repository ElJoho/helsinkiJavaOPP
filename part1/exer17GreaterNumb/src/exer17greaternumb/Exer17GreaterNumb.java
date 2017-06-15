package exer17greaternumb;
import java.util.Scanner;

/**
 *
 * @author ElJoho
 */
public class Exer17GreaterNumb {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double num1;
        double num2;
        
        System.out.print("Type the first number: ");
        num1 = Double.parseDouble(reader.nextLine());
        System.out.print("Type the second number: ");
        num2 = Double.parseDouble(reader.nextLine());
        
        if( num1 == num2 ){
            System.out.println("The numbers are equal!");
        } else if ( num1 > num2 ){
            System.out.println("Greater number: " + (int)num1);
        } else if ( num1 < num2 ){
            System.out.println("Greater number: " + (int)num2);
        };
    }
    
}
