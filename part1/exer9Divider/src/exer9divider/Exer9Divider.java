package exer9divider;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer9Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int number2;
  
        System.out.print("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Division: " + number + " / " + number2 + " = " + number/number2 );
    }
    
}
