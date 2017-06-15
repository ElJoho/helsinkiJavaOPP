package exer16evenodd;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer16EvenOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int intNumber;
        double dNumber;
        double evenOddD;
        int evenOddN;
        
        System.out.print("Type a number: ");
        dNumber = Double.parseDouble(reader.nextLine());
        intNumber = (int) dNumber;
        System.out.println();
        
        evenOddD = (dNumber/2);
        evenOddN = (int) evenOddD;
        if( 0 != (dNumber-intNumber)){
            System.out.println("Number " + dNumber + " is not even or odd.");
        } else if( 0 != (evenOddD - evenOddN)){
            System.out.println("Number " + (int)dNumber + " is even.");
        } else if( 0 == (evenOddD - evenOddN)){
            System.out.println("Number " + (int)dNumber + " is odd.");
        };
        
    }
    
}
