// APPLICABILITY: To create a comprehensive interface for user-input and
// file name generations.

/**
* This RaceFacade class provides a comprehensive interface for
* user-speficifaction and randomized selection of the 
* respective color file.
*
* @author  Lloyd Dela Cruz
* @version 1.0
* @since   2021-12
*/
public class RaceFacade {
    NameGenerator nameGenerator = new NameGenerator();
    RacePicker racePicker = new RacePicker();

    // ask the user to specify the race
    RaceTemplate raceTemplate = racePicker.getRace();
    // generate a randomized file name for the color
    String[] colorInfo = nameGenerator.randomize(3, raceTemplate.raceColor());

    /**
    * This method requests for an output of the
    * current process.
    * 
    * @return Nothing.
    */
    public void getStatus(){
        raceTemplate.statusUpdate();
    }

    /**
    * This method uses the returns the generated file
    * name for the color of the user-chosen race.
    * 
    * @return String This returns the file name for color.
    */
    public String getColorFile(){
        return colorInfo[1];
    }

    /**
    * This method returns the number prefix
    * of the file used for the color.
    * 
    * @return String This returns the file number for color.
    */
    public String getColorNum(){
        return colorInfo[0];
    }

    /**
    * This method generates a file name using the raceName()
    * attribute of user-chosen race. Then it the returns the generated 
    * file name for the ears.
    * 
    * @return String This returns the file name for ears.
    */
    public String getEarFile(){
        System.out.println("Painting the ears...");
        return raceTemplate.raceName() + "_ears";
    }

    /**
    * This method is used for the file name generation.
    * 
    * @return String This returns the name of the race.
    */
    public String getRaceName(){
        return raceTemplate.raceName();
    }
}
