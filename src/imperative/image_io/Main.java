package src.imperative.image_io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;

public class Main {
    
    public static void main(String[] args){
        final int image_width = 256;
        final int image_height = 256;

        BufferedImage img = new BufferedImage(image_width, image_height, BufferedImage.TYPE_INT_RGB );

        for (int j = image_height - 1; j >= 0; j--) {
            for (int i = 0; i < image_width; i++) {
                float r = (float) i / (image_width - 1);
                float g = (float) j / (image_height - 1);
                float b = (float) 0.25;
                img.setRGB(i, (image_height - 1 - j), new Color(r,g,b).getRGB());
            }
        }
          
        try {
            ImageIO.write(img, "jpg", new File("imageio/image.jpg"));
        }catch (IOException e) { 
            e.printStackTrace();
        }
    }
}
