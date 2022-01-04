/**
 * <p> This abstract class provides a template for the
 * attributes of each race subclass and generates
 * the respective progress. </p>
 */
public abstract class Race{
    /**
     * This abstract method is the template for the
     * name of the subclass races
     * 
     * @return String This returns the lower-case name of the race.
     */
    abstract String getRaceName();

    /**
     * This abstract method is the template for the
     * color of the subclass races
     * 
     * @return String This returns the lower-case color of the race.
     */
    abstract String getRaceColor();

   /**
    * Outputs the expected painting
    * Race attributes.
    */
    public final void statusUpdate(){
        System.out.println("\n\tPicasso is painting a " + getRaceColor() + "-skinned " + getRaceName() + "...");
    }
}
