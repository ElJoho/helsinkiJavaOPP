import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner reader  = new Scanner (System.in);
       
        System.out.println("Second part, excercise 13:");
        System.out.println("1. Top ten by goals: \n");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.print(" \n \n " );
        System.out.println("2. Top 25 players by penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.print(" \n \n " );
        System.out.println("3. Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.print(" \n \n " );
        System.out.println("4. Philadelphia players:" );
        NHLStatistics.teamStatistics("PHI");
        
        System.out.print(" \n \n " );
        System.out.println("5.Anaheim Ducks:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        /**
        System.out.print(" \n \n \n \n" + "First part, exercise 13: \n" + "Top ten by points \n");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
        **/
    }
}
