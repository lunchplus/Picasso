/**
 * <p> This class provides a collective interface
 * for the status output and the provision of file names 
 * and file numbers of the general face parts. </p>
 */
public class FaceFacade {
    private Face head;
    private Face hair;
    private Face eyes;
    private Face mouth;
    private Face nose;
    
    
    /**
     * Generates a FaceFacade object with variables set to respective Face
     */
    public FaceFacade(){
        head = new Head();
        hair = new Hair();
        eyes = new Eyes();
        mouth = new Mouth();
        nose = new Nose();    
    }

    /**
     * This method uses the <b>Head</b> implementation of 
     * interface <b>Face</b>. It prints the current process
     * and returns the filename.
     * 
     * @return String This returns the filename for head.
     */
    public String getHead(){
        head.statusUpdate();
        return head.getFileName();
    }

    /**
     * This method returns the number prefix
     * of the file used for the head.
     * 
     * @return String This returns the number prefix for head.
     */
    public String getHeadNum(){
        return head.getFileNum();
    }

    /**
     * This method uses the <b>Hair</b> implementation of 
     * interface <b>Face</b>. It prints the current process
     * and returns the filename.
     * 
     * @return String This returns the filename for hair.
     */
    public String getHair(){
        hair.statusUpdate();
        return hair.getFileName();
    }

    /**
     * This method returns the number prefix
     * of the file used for the hair.
     * 
     * @return String This returns the number prefix for hair.
     */    
    public String getHairNum(){
        return hair.getFileNum();
    }

    /**
     * This method uses the <b>Eyes</b> implementation of 
     * interface <b>Face</b>. It prints the current process
     * and returns the filename.
     * 
     * @return String This returns the filename for eyes.
     */
    public String getEyes(){
        eyes.statusUpdate();
        return eyes.getFileName();
    }

    /**
     * This method returns the number prefix
     * of the file used for the eyes.
     * 
     * @return String This returns the number prefix for eyes.
     */
    public String getEyesNum(){
        return eyes.getFileNum();
    }

    /**
     * This method uses the <b>Mouth</b> implementation of 
     * interface <b>Face</b>. It prints the current process
     * and returns the filename.
     * 
     * @return String This returns the filename for mouth
     */
    public String getMouth(){
        mouth.statusUpdate();
        return mouth.getFileName();
    }

    /**
     * This method returns the number prefix
     * of the file used for the mouth.
     * 
     * @return String This returns the number prefix for mouth.
     */
    public String getMouthNum(){
        return mouth.getFileNum();
    }

    /**
     * This method uses the <b>Nose</b> implementation of 
     * interface <b>Face</b>. It prints the current process
     * and returns the filename.
     * 
     * @return String This returns the filename for nose.
     */
    public String getNose(){
        nose.statusUpdate();
        return nose.getFileName();
    }

    /**
     * This method returns the number prefix
     * of the file used for the nose.
     * 
     * @return String This returns the number prefix for nose.
     */
    public String getNoseNum(){
        return nose.getFileNum();
    }
}
