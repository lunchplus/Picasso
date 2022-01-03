import java.util.Random;

/**
 * <p> This class generates a file name. </p>
 */
public class NameGenerator {
    private Random rng;

    /**
     * Generates a file name using a random integer (prefix)
     * and a label (suffix) joined by an underscore.
     * 
     * @param range This specifies the upper bound for the random 
     * number prefix
     * @param label This specifies the string suffix
     * @return String[] This returns a string
     * array [prefix, filename].
     */
    public String[] randomize(int range, String label){
        rng = new Random();
        String prefix = String.valueOf(rng.nextInt(range));
        
        String[] info = {prefix, prefix + "_" + label};
        return info;
    }
}
