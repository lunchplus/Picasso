/**
 * <p> This class is an implementation of Face </p>
 */
public class Hair implements Face{
    NameGenerator nameGenerator = new NameGenerator();

    // hairInfo = [file number, file name]
    String[] hairInfo = nameGenerator.randomize(6, "hair");

    @Override
    public void statusUpdate(){
        System.out.println("\tPainting the hair...");
    }
    
    @Override
    public String getFileNum(){
        return hairInfo[0];
    }

    @Override
    public String getFileName(){
        return hairInfo[1];
    }
}