
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.imageio.ImageIO;

import java.io.IOException;
import java.io.File;

/**
* This Painting class contains the general instructions
* for the process of painting the character
* concept
*
* @author  Lloyd Dela Cruz
* @version 1.0
* @since   2021-12
*/
public class Painting{
    // intiailize the "containers" for image inputs
    BufferedImage skin;
    BufferedImage ears;
    BufferedImage head;
    BufferedImage hair;
    BufferedImage eyes;
    BufferedImage mouth;
    BufferedImage nose;

    /**
    * This Painting class <b>constructor</b>
    * superimposes the randomly selected files
    * in deliberate layers and saves the
    * rendered image in the Desktop folder
    * each with their unique file names.
    */
    public Painting(){
        RaceFacade raceFacade = new RaceFacade();
        LineFacade lineFacade = new LineFacade();
        String fileName;

        raceFacade.getStatus();

        // create new frame with title
        JFrame preview = new JFrame("Randomized Character");
        // set the default action after closing frame window
        preview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // intialize the canvas with its size and color space (alpha + RGB)
        BufferedImage conceptSketch = new BufferedImage(1500,1500, BufferedImage.TYPE_INT_ARGB);

        try{
            // load the file names into the intialized containers
            skin = ImageIO.read(getClass().getClassLoader().getResource(raceFacade.getColorFile() + ".png"));
            ears = ImageIO.read(getClass().getClassLoader().getResource(raceFacade.getEarFile() + ".png"));
            head = ImageIO.read(getClass().getClassLoader().getResource(lineFacade.getHead() + ".png"));
            hair = ImageIO.read(getClass().getClassLoader().getResource(lineFacade.getHair() + ".png"));
            eyes = ImageIO.read(getClass().getClassLoader().getResource(lineFacade.getEyes() + ".png"));      
            mouth = ImageIO.read(getClass().getClassLoader().getResource(lineFacade.getMouth() + ".png"));
            nose = ImageIO.read(getClass().getClassLoader().getResource(lineFacade.getNose() + ".png"));

            // allow drawing on the canvas
            Graphics2D pen = conceptSketch.createGraphics();

            // supoerimpose the selected images (order is important)
            pen.drawImage(skin, 0, 0, null);
            pen.drawImage(ears, 0, 0, null);
            pen.drawImage(head, 0, 0, null);
            pen.drawImage(hair, 0, 0, null);
            pen.drawImage(eyes, 0, 0, null);
            pen.drawImage(mouth, 0, 0, null);
            pen.drawImage(nose, 0, 0, null);

            // dispose to save resources
            pen.dispose();

            // create a framed preview of the concept sketch
            JLabel sketch = new JLabel();
            sketch.setIcon(new ImageIcon(conceptSketch));
            preview.add(sketch);

            // generate a unique file name based on their file numbers
            fileName = raceFacade.getRaceName() + "_" + lineFacade.getHeadNum() + lineFacade.getHairNum()
            + lineFacade.getEyesNum() + lineFacade.getMouthdNum() + lineFacade.getNoseNum();

            // save the image to the desired directory
            try{
                ImageIO.write(conceptSketch, "PNG", new File("C:\\Users\\lemon\\Desktop\\" + fileName + ".png"));
            
            // catch any incorrect directory input
            } catch (IOException e) {
                e.printStackTrace();
            }

            // print success prompt
            System.out.println("I have finished painting " + fileName + "! I also saved it on your Desktop.");
        
        // catch invalid file names
        } catch (IOException e) {
            e.printStackTrace();
        }

        // size and display the frame preview
        preview.pack();
        preview.setVisible(true);
    } 
}
