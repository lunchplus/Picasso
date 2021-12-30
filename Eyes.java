public class Eyes implements FacePart{
    NameGenerator nameGenerator = new NameGenerator();
    String[] eyesInfo = nameGenerator.randomize(5, "eyes");

    @Override
    public void statusUpdate(){
        System.out.println("Painting the eyes...");
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