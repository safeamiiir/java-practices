import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
public class SimpleTextIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("sample.txt");
		
		/*
		FileWriter output = new FileWriter(file, true);
		BufferedWriter writer = new BufferedWriter(output);
		for(int i=0; i<10; i++)
		{
			//writer.write("hello world!\n");
			
			writer.append("AP sample!\n");
			writer.flush();
		}
		writer.close();
		*/
		
		FileReader reader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(reader);
		int count = 0;
		/*while(bReader.ready())
		{
			//char ch = (char) bReader.read();
			String line = bReader.readLine();
			if(line.startsWith("new"))
			{
				System.out.println(line);
				count ++;

			}
		}
		System.out.println("count = "+ count);
		*/
		
		while(reader.ready())
		{
			String line = bReader.readLine();
			System.out.println(line);

		}
		bReader.close();
		reader.close();
		
		/*
		 
		 
		 		BufferedImage image = ImageIO.read(file);
		BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
		int m = image.getHeight();
		int n = image.getWidth();
		
		
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				int rgb = image.getRGB(j, i);
				
				
		        int r = (rgb >> 16) & 0xFF;
		        int g = (rgb >> 8) & 0xFF;
		        int b = (rgb & 0xFF);

		        int grayLevel = (r + g + b) / 3;
		        int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel; 
				newImage.setRGB(j, i, gray);
				
			}
		}
		

		File file2 = new File("image.jpg");
		ImageIO.write(newImage, "jpg", file2);
		 */
		
	}

}
