// APPLICABILITY: To obscure lengthy and redundant process of generating file names
// and to simplify the method calling in the Painting (client) class. 

/**
* This LineFacade class provides a collective interface
* for the status output and the provision of file names 
* and file numbers of the general face parts 
* (i.e. sans the ears).
*
* @author  Lloyd Dela Cruz
* @version 1.0
* @since   2021-12
*/
public class LineFacade {
    private FacePart head;
    private FacePart hair;
    private FacePart eyes;
    private FacePart mouth;
    private FacePart nose;
    

    // constructor; assign FacePart's to intuitive variables
    public LineFacade(){
        head = new Head();
        hair = new Hair();
        eyes = new Eyes();
        mouth = new Mouth();
        nose = new Nose();    
    }

    /**
    * This method uses the <b>Head</b> implementation of 
    * interface <b>Face</b>. It prints the current process
    * and returns the file name.
    * 
    * @return String This returns the file name for head.
    */
    public String getHead(){
        head.statusUpdate();
        return head.getFileName();
    }

    /**
    * This method returns the number prefix
    * of the file used for the head.
    * 
    * @return String This returns the file number for head.
    */
    public String getHeadNum(){
        return head.getFileNum();
    }

    /**
    * This method uses the <b>Hair</b> implementation of 
    * interface <b>Face</b>. It prints the current process
    * and returns the file name.
    * 
    * @return String This returns the file name for hair.
    */
    public String getHair(){
        hair.statusUpdate();
        return hair.getFileName();
    }

    /**
    * This method returns the number prefix
    * of the file used for the hair.
    * 
    * @return String This returns the file number for hair.
    */    
    public String getHairNum(){
        return hair.getFileNum();
    }

    /**
    * This method uses the <b>Eyes</b> implementation of 
    * interface <b>Face</b>. It prints the current process
    * and returns the file name.
    * 
    * @return String This returns the file name for eyes.
    */
    public String getEyes(){
        eyes.statusUpdate();
        return eyes.getFileName();
    }

    /**
    * This method returns the number prefix
    * of the file used for the eyes.
    * 
    * @return String This returns the file number for eyes.
    */
    public String getEyesNum(){
        return eyes.getFileNum();
    }

    /**
    * This method uses the <b>Mouth</b> implementation of 
    * interface <b>Face</b>. It prints the current process
    * and returns the file name.
    * 
    * @return String This returns the file name for mouth
    */
    public String getMouth(){
        mouth.statusUpdate();
        return mouth.getFileName();
    }

    /**
    * This method returns the number prefix
    * of the file used for the mouth.
    * 
    * @return String This returns the file number for mouth.
    */
    public String getMouthdNum(){
        return mouth.getFileNum();
    }

    /**
    * This method uses the <b>Nose</b> implementation of 
    * interface <b>Face</b>. It prints the current process
    * and returns the file name.
    * 
    * @return String This returns the file name for nose.
    */
    public String getNose(){
        nose.statusUpdate();
        return nose.getFileName();
    }

    /**
    * This method returns the number prefix
    * of the file used for the nose.
    * 
    * @return String This returns the file number for nose.
    */
    public String getNoseNum(){
        return nose.getFileNum();
    }
}
