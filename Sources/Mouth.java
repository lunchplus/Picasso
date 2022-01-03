/**
 * <p> This class is an implementation of Face </p>
 */
public class Mouth implements Face{
    NameGenerator nameGenerator = new NameGenerator();

    // mouthInfo = [file number, file name]
    String[] mouthInfo = nameGenerator.randomize(6, "mouth");

    @Override
    public void statusUpdate(){
        System.out.println("\tPainting the mouth...");
    }
    
    @Override
    public String getFileNum(){
        return mouthInfo[0];
    }

    @Override
    public String getFileName(){
        return mouthInfo[1];
    }
}