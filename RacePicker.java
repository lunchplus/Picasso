import java.util.Scanner;

/**
* <h1> Ask the user to choose a race </h1>
* This class provides a collective interface
* for the randomized selection of files 
* for the respective face parts.
*
* @author  Lloyd Dela Cruz
* @version 1.0
* @since   2021-12
*/
public class RacePicker {
    public RaceTemplate getRace(){
        Scanner sc = new Scanner(System.in);
        String raceChoice;
        
        // loop until a valid input
        while (true){
            System.out.println("\n\tWhat would you like me to draw?");
            System.out.println("\t1. HUMAN");
            System.out.println("\t2. ORC");
            System.out.println("\t3. GOBLIN");
            
            raceChoice = sc.nextLine();

            if (raceChoice.equalsIgnoreCase("1")){
                sc.close();
                return new Human();

            } else if (raceChoice.equalsIgnoreCase("2")){
                sc.close();
                return new Orc();

            } else if (raceChoice.equalsIgnoreCase("3")){
                sc.close();
                return new Goblin();

            } else {
                System.out.println("Oops, I did not quite get that. Kindly try again.");
                continue;
            }
        }
    }
}
