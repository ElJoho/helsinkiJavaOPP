package exer11biggernumber;

import java.util.Scanner;

/**
 *
 * @author ElJoho
 */
public class Exer11BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int number2;
        String answer = "The bigger numberof two numbers given was: " ;
  
        System.out.print("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        number2 = Integer.parseInt(reader.nextLine());
        
        if( number == number2){
            System.out.println(answer + "none, the wo numbers are equal");
        } else if ( number > number2){
            System.out.println(answer + number);
        } else {
            System.out.println(answer + number2);
        }
    }
    
}
