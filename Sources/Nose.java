/**
 * <p> This class is an implementation of Face </p>
 */
public class Nose implements Face{
    NameGenerator nameGenerator = new NameGenerator();

    // noseInfo = [file number, file name]
    String[] noseInfo = nameGenerator.randomize(7, "nose");

    @Override
    public void statusUpdate(){
        System.out.println("\tPainting the nose...");
    }

    @Override
    public String getFileNum(){
        return noseInfo[0];
    }

    @Override
    public String getFileName(){
        return noseInfo[1];
    }
}