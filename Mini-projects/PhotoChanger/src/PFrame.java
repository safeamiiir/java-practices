import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PFrame extends JFrame{
	
	//public static String full;

	
	public PFrame() throws IOException {
		
		setSize(800, 800);
		setTitle(" Photo Changer " );
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel southPanel = new JPanel();
		add(southPanel, BorderLayout.SOUTH);
		JButton selectionButton = new JButton("Select");
		selectionButton.setSize(300, 300);
		southPanel.add(selectionButton);
		
		JPanel northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);


		
		setVisible(true);
		

		selectionButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
			    dialog.setMode(FileDialog.LOAD);
			    dialog.setVisible(true);
			    String  directortPath = dialog.getDirectory();
			    String filepath = dialog.getFile();
			    String full = directortPath + filepath;
			   //System.out.println(full);
				File inputFile = new File(full);		
				FileInputStream input;
				try {
					input = new FileInputStream(inputFile);
					BufferedInputStream reader = new BufferedInputStream(input);
					File outPutFile = new File("new.jpg");
					FileOutputStream out = new FileOutputStream(outPutFile);
					BufferedOutputStream writer = new BufferedOutputStream(out);
					
					byte [] buffer = new byte[1024];
					
					while(reader.available() >= 1024){
						reader.read(buffer, 0, 1024);
						writer.write(buffer);
						writer.flush();
						}
					
					buffer = new byte[reader.available()];
					reader.read(buffer, 0, reader.available());
					writer.write(buffer);
					
					writer.close();
					reader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
			  
			}			 
			 
		});
		
		
		
		JPanel center = new JPanel();
		add(center,BorderLayout.CENTER);
		ImageIcon imageIcon = new ImageIcon("new.jpg");
		
		
		JLabel label = new JLabel("",imageIcon, JLabel.CENTER);
		center.add(label,BorderLayout.CENTER);
		
	}
		

		
		

	
}
