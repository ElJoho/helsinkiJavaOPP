package exer8adder;
import java.util.Scanner;

/**
 *
 * @author ElJoho
 */
public class Exer8Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
  
        System.out.print("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        number = number + Integer.parseInt(reader.nextLine());
        System.out.println("Sum of numbers: " + number);
    }
    
}
