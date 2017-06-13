package exer5secondsyear;

/**
 *
 * @author ElJoho
 */
public class Exer5SecondsYear {

    public static void main(String[] args) {
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int secInYear = days * hours * minutes * seconds; 
        
        System.out.println("There are " + secInYear + " seconds in a year" );
    }
    
}
