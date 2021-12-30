public class Mouth implements FacePart{
    NameGenerator nameGenerator = new NameGenerator();
    String[] mouthInfo = nameGenerator.randomize(6, "mouth");

    @Override
    public void statusUpdate(){
        System.out.println("Painting the mouth...");
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