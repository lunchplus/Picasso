// APPLICABILITY: Allow easy and organized object creation/implementation.

/**
* This interface sets the preset methods
* for the processing of files of different face parts.
*/
public interface FacePart {

    /**
   * This method outputs the current stage
   * in the character generation process
   * 
   * @return Nothing.
   */
    void statusUpdate();

    /**
   * This method is used to get the <b>randomized</b>
   * file name for the lineart of a given face part
   * 
   * @return String This returns the file name.
   */
    String getFileName();

    /**
    * This method returns the number prefix
    * of the file used for the given face part.
    * 
    * @return String This returns the file number 
    * for the respective face parts.
    */
    String getFileNum();


}
