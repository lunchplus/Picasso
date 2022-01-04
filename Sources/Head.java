/**
 * <p> This class is an implementation of Face </p>
 */
public class Head implements Face{
    NameGenerator nameGenerator = new NameGenerator();

    // headInfo = [number prefix, filename]
    String[] headInfo = nameGenerator.randomize(3, "head");

    @Override
    public void statusUpdate(){
        System.out.println("\tPainting the head...");
    }
    
    @Override
    public String getFileNum(){
        return headInfo[0];
    }

    @Override
    public String getFileName(){
        return headInfo[1];
    }
}