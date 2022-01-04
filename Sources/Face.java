/**
 * <p> This interface sets the preset methods
 * for the processing of files of different face parts. </p>
 */
public interface Face {

	/**
     * Retrieves the current progress
     */
    void statusUpdate();

    /**
     * Retrieves the filename number of the Face object.
     * 
     * @return String This returns the number prefix
     * for the respective FacePart
     */
    String getFileNum();

    /**
     * Retrieves the randomized filename of the Face object.
     * 
     * @return String This returns the filename.
     */
    String getFileName();



}
