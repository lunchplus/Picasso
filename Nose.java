public class Nose implements FacePart{
    NameGenerator nameGenerator = new NameGenerator();
    String[] noseInfo = nameGenerator.randomize(7, "nose");

    @Override
    public void statusUpdate(){
        System.out.println("Painting the nose...");
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