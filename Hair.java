public class Hair implements FacePart{
    NameGenerator nameGenerator = new NameGenerator();
    String[] hairInfo = nameGenerator.randomize(6, "hair");

    @Override
    public void statusUpdate(){
        System.out.println("Painting the hair...");
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