package exer18gradespoints;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer18GradesPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double num;
        
        System.out.print("Type a the points [0-60]: ");
        num = Double.parseDouble(reader.nextLine());
        System.out.println();
        
        if( 0 <= num && num <= 29 ){
            System.out.println("Grade: failed");
        } else if ( 29 < num && num <= 34 ){
            System.out.println("Grade: 1");
        } else if ( 34 < num && num <= 39 ){
            System.out.println("Grade: 2");
        } else if ( 39 < num && num <= 44 ){
            System.out.println("Grade: 3");
        } else if ( 44 < num && num <= 49 ){
            System.out.println("Grade: 4");
        } else if ( 49 < num && num <= 60 ){
            System.out.println("Grade: 5");
        } else if ( 0 > num || num > 60 ){
            System.out.println("Your points are not posible.");
        } ;
    }
    
}
