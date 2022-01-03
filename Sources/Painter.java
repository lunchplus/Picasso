
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.imageio.ImageIO;

import java.io.IOException;
import java.io.File;

/**
 * <p> This class uses Graphics2D to superimpose randomly 
 * selected files in deliberate order
 * and saves the rendered image with a unique file name. </p>
 */
public class Painter{
    // initialize variables for images
    private BufferedImage skin;
    private BufferedImage ears;
    private BufferedImage head;
    private BufferedImage hair;
    private BufferedImage eyes;
    private BufferedImage mouth;
    private BufferedImage nose;
    private BufferedImage canvas;

    // initialize variables for drawing and displaying the <i>painting</i>. 
    private JLabel painting;
    private JFrame frame;
    private Graphics2D brush;
    
    private StringBuilder fileName;
    private String directory;

    private RaceFacade raceFacade;
    private FaceFacade faceFacade;

    /**
     * Generates a Painter object with the instructions
     * on rendering and saving the <i>painting</i>.
    */
    public Painter(){
        // retrieve the race and output the expected painting
        raceFacade = new RaceFacade();
        raceFacade.getStatus();

        // create a facade for the face parts
        faceFacade = new FaceFacade();

        // setup the frame
        frame = new JFrame("Randomized Character");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initialize the frame with its size and color space (alpha + RGB)
        canvas = new BufferedImage(1500,1500, BufferedImage.TYPE_INT_ARGB);

        try{
            // load the file names into the initialized containers
            skin = ImageIO.read(getClass().getClassLoader().getResource(raceFacade.getColorFile() + ".png"));
            ears = ImageIO.read(getClass().getClassLoader().getResource(raceFacade.getEarFile() + ".png"));
            head = ImageIO.read(getClass().getClassLoader().getResource(faceFacade.getHead() + ".png"));
            hair = ImageIO.read(getClass().getClassLoader().getResource(faceFacade.getHair() + ".png"));
            eyes = ImageIO.read(getClass().getClassLoader().getResource(faceFacade.getEyes() + ".png"));      
            mouth = ImageIO.read(getClass().getClassLoader().getResource(faceFacade.getMouth() + ".png"));
            nose = ImageIO.read(getClass().getClassLoader().getResource(faceFacade.getNose() + ".png"));

            // allow drawing on the frame
            brush = canvas.createGraphics();

            // superimpose the selected images (order is important!)
            brush.drawImage(skin, 0, 0, null);
            brush.drawImage(ears, 0, 0, null);
            brush.drawImage(head, 0, 0, null);
            brush.drawImage(hair, 0, 0, null);
            brush.drawImage(eyes, 0, 0, null);
            brush.drawImage(mouth, 0, 0, null);
            brush.drawImage(nose, 0, 0, null);

            // dispose to save resources
            brush.dispose();

            // frame the painting
            painting = new JLabel();
            painting.setIcon(new ImageIcon(canvas));
            frame.add(painting);

            // generate a unique file name based on their file numbers
            fileName = new StringBuilder(raceFacade.getRaceName() + '_');
            fileName.append(faceFacade.getHeadNum());
            fileName.append(faceFacade.getHairNum());
            fileName.append(faceFacade.getEyesNum());
            fileName.append(faceFacade.getMouthNum());
            fileName.append(faceFacade.getNoseNum());

            directory = "Desktop";
            // save the image to the directory
            try{
                ImageIO.write(canvas, "PNG", new File(System.getProperty("user.home") + "\\" + directory + "\\" + fileName + ".png"));
            
            // catch any incorrect directory input
            } catch (IOException e) {
                e.printStackTrace();
            }

            // print success prompt
            System.out.println("\n\tPicasso has finished painting " + fileName + " and saved it on your " + directory + " folder.");
        
        // catch invalid file names
        } catch (IOException e) {
            e.printStackTrace();
        }

        // size and display the frame
        frame.pack();
        frame.setVisible(true);
    } 
}
