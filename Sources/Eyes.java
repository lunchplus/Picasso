/**
 * <p> This class is an implementation of Face </p>
 */
public class Eyes implements Face{
    NameGenerator nameGenerator = new NameGenerator();

    // eyesInfo = [number prefix, filename]
    String[] eyesInfo = nameGenerator.randomize(5, "eyes");

    @Override
    public void statusUpdate(){
        System.out.println("\tPainting the eyes...");
    }

    @Override
    public String getFileNum(){
        return eyesInfo[0];
    }

    @Override
    public String getFileName(){
        return eyesInfo[1];
    }

}