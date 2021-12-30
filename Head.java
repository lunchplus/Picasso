public class Head implements FacePart{
    NameGenerator nameGenerator = new NameGenerator();
    String[] headInfo = nameGenerator.randomize(3, "head");

    @Override
    public void statusUpdate(){
        System.out.println("Painting the head...");
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