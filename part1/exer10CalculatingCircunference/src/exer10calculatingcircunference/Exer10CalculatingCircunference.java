package exer10calculatingcircunference;

import java.util.Scanner;

/**
 *
 * @author ElJoho
 */
public class Exer10CalculatingCircunference {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double number;
        
        System.out.print("Type the radius: ");
        number = Double.parseDouble(reader.nextLine());
        System.out.println("Circunference of the circle: " +  2 * Math.PI * number);
    }
    
}
