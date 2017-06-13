package exer12sumoftheages;

import java.util.Scanner;

/**
 *
 * @author ElJoho
 */
public class Exer12SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        String name2;
        int age;
        int age2;
  
        System.out.print("Type your name: ");
        name = reader.nextLine();
        System.out.print("Type your age: ");
        age = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        name2 = reader.nextLine();
        System.out.print("Type your age2: ");
        age2 = Integer.parseInt(reader.nextLine());
        
        int totalAge = age + age2;
        String answer = name + " and " + name2 + " are " + totalAge + " years old in total"  ;
        System.out.println(answer);

    }
    
}
