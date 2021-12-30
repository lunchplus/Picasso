import java.util.Random;

/**
* This class generates a file name
*
* @author  Lloyd Dela cruz
* @version 1.0
* @since   2021-12
*/
public class NameGenerator {

    /**
    * This method uses a randomized number 
    * and appends (as prefix) to the label
    * to generate a formatted file name.
    * 
    * @return String[] This returns a string
    * array [randomized prefix, filename].
    */
    public String[] randomize(int range, String label){
        Random rng = new Random();
        String prefix = String.valueOf(rng.nextInt(range));
        
        String[] info = {prefix, prefix + "_" + label};
        return info;
    }
}
