import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class GrayScale {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File input = new File("background1.jpg");
		BufferedImage image = ImageIO.read(input);
		int m = image.getHeight();
		int n = image.getWidth();
		
		BufferedImage grayImage = new BufferedImage(n, m, BufferedImage.TYPE_INT_RGB);
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				int rgb = image.getRGB(j, i);
				
				int r = (rgb >> 16) & 0xFF;
				int g = (rgb >> 8 ) & 0xFF;
				int b = (rgb & 0xFF);
				
				int grayLevel = (r+g+b)/3;
				int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel;
			
				grayImage.setRGB(j, i, gray);
			}
		}
		
		File output = new File("grayImage.jpg");
		ImageIO.write(grayImage, "jpg", output);
	}

}
