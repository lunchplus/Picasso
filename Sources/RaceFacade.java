/**
 * <p> This class provides an interface for
 * the user to select the race. Then, it
 * generates the corresponding Race
 * object. </p>
 */
public class RaceFacade {
    private NameGenerator nameGenerator;
    private RaceSelector raceSelector;
    private Race race;
    private String[] colorInfo;

    /**
     * Generates an object of RaceFacade
     * that has an array containing the information
     * of race color.
     */
    public RaceFacade(){
        nameGenerator = new NameGenerator();
        raceSelector = new RaceSelector();
        race = raceSelector.getRace();
        colorInfo = nameGenerator.randomize(3, race.getRaceColor());
    }

    /**
     * Retrieves the current progress.
     */
    public void getStatus(){
        race.statusUpdate();
    }

    /**
     * Retrieves the color filename of the Race object.
     * 
     * @return String This returns the filename for color.
     */
    public String getColorFile(){
        return colorInfo[1];
    }

    /**
     * Retrieves the color number prefix of the Race object.
     * 
     * @return String This returns the number prefix for color.
     */
    public String getColorNum(){
        return colorInfo[0];
    }

    /**
     * Generates and retrieves the Ears filename of the Race object 
     * 
     * @return String This returns the filename for ears.
     */
    public String getEarFile(){
        System.out.println("\tPainting the ears...");
        return race.getRaceName() + "_ears";
    }

    /**
     * Retrieves the name attribute of the Race object
     * for the filename prefix of the final painting.
     * 
     * @return String This returns the lower-case 
     * name of the Race object
     */
    public String getRacePrefix(){
        return race.getRaceName();
    }
}
