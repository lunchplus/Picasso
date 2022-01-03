import java.util.Scanner;

/**
 * <p> This class provides the terminal interface
 * where the user can select the race
 * of the character to be painted. </p>
 */
public class RaceSelector {
    private Scanner sc = new Scanner(System.in);
    private String raceChoice;
    
    /**
     * This method requests the user for the race to be painted.
     * 
     * @return RaceTemplate This returns a RaceTemplate object
     * based on the user-choice.
     */
    public Race getRace(){
        System.out.println("\n\tWhat race would you like to be painted?");
        System.out.println("\t1. HUMAN");
        System.out.println("\t2. ORC");
        System.out.println("\t3. GOBLIN");
        System.out.print("\n\tEnter the integer: ");

        // loop until a valid input
        while (true){

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
                System.out.print("\tPlease enter a valid option: ");
                continue;
            }
        }
    }
}
