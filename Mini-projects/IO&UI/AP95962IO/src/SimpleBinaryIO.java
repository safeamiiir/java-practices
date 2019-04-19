import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import javax.imageio.ImageIO;



public class SimpleBinaryIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File inputFile = new File("intellij.dmg");		
		FileInputStream input = new FileInputStream(inputFile);
		BufferedInputStream reader = new BufferedInputStream(input);
		
		
		File outputFile = new File("newIntellij.dmg");		
		FileOutputStream output = new FileOutputStream(outputFile);
		BufferedOutputStream writer = new BufferedOutputStream(output);
		
		byte buffer[] = new byte[8192];
		int b;
		java.util.Date date = new Date();
		System.out.println(date.toString());
		
		while(reader.available()>=8192)
		{
			//b = input.read();
			reader.read(buffer, 0, 8192);
			//output.write(b);
			//output.flush();
			writer.write(buffer);
			writer.flush();
		}
		
		buffer = new byte[reader.available()];
		reader.read(buffer, 0, reader.available());
		writer.write(buffer);
		
		date = new Date();
		System.out.println(date.toString());
		
		//input.close();
		//output.close();
		
		reader.close();
		writer.close();
		//input.read(buffer, 0, 1024);
		//System.out.println(buffer);
		
		
		

		
		

	}

}
