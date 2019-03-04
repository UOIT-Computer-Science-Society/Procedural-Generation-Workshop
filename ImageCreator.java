import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/*
* A class that saves a BufferedImage to a file
*/
public class ImageCreator{
  public static void save(BufferedImage image, String fileFormat, String fileName){
    //Checks if the file formate is valid
    if(!fileFormat.equals("png")&&
      !fileFormat.equals("jpg")&&
      !fileFormat.equals("gif")){
     System.err.println("Invalid file format! Valid formats: png, jpg, gif");
     return;
   }
   //Create a new image file and put the BufferedImage into the file
   try{
     File outputFile = new File(fileName +"."+fileFormat);
     ImageIO.write(image, fileFormat, outputFile);
   }catch(IOException e){
     e.printStackTrace();
   }
  }
}
