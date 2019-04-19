import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;
public class Test {

	static JLabel picture = new JLabel();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	  
		JFrame frame = new JFrame();
		WindowListener wListener = new WindowListener() {
			
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		frame.addWindowListener(wListener);
		BorderLayout bLayout = new BorderLayout();
		frame.setLayout(bLayout);
		
		JPanel northPanel = new JPanel();
		
		FlowLayout fLoyout = new FlowLayout(FlowLayout.LEFT);
		northPanel.setLayout(fLoyout);
		
		JButton northButton1 = new JButton("left");
		
		
		northButton1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(SwingUtilities.isRightMouseButton(e))
				{
					System.out.println("Mouse Right Clicked");
				}
			}
		});
		
		
		
		
		
		
		
		JButton northButton2 = new JButton("right");
		
		northPanel.add(northButton1);
		northPanel.add(northButton2);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout());
		
		JButton nextButton = new JButton();
		JButton backButton = new JButton();
		JButton playButton = new JButton();
		
		southPanel.add(backButton);
		File file = new File("images/back.png");
		BufferedImage image = ImageIO.read(file);
		backButton.setIcon(new ImageIcon(image));
		
		file = new File("images/next.png");
		image = ImageIO.read(file);
		nextButton.setIcon(new ImageIcon(image));
		

		file = new File("images/play.png");
		image = ImageIO.read(file);
		playButton.setIcon(new ImageIcon(image));
		final JLabel picture = new JLabel();

		playButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				TimerTask tTask = new TimerTask() {
					
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("in thread");
						int rand = (int)(Math.random() * 4)  + 1;
						
						File file = new File("images/background" + rand + ".jpg");
						BufferedImage image;
						try {
							image = ImageIO.read(file);
							picture.setIcon(new ImageIcon(image));

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
			
				Timer timer = new Timer();
				timer.scheduleAtFixedRate(tTask, 2000, 3000);
			
			}
		});
		
		
		southPanel.add(playButton);
		southPanel.add(nextButton);
		
		
		//JTextField centerText = new JTextField();
		
		
/*
		file = new File("images/background1.jpg");
		image = ImageIO.read(file);
		picture.setIcon(new ImageIcon(image));
	*/	
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(picture, BorderLayout.CENTER);
		frame.add(southPanel, BorderLayout.SOUTH);
		
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		
		JMenuItem openMenu = new JMenuItem("Open");
		file = new File("images/next.png");
		image = ImageIO.read(file);
		openMenu.setIcon(new ImageIcon(image));
		
		JMenuItem exitMenu = new JMenuItem("Exit");
		
		JMenuItem copyMenu = new JMenuItem("Copy");
		JMenuItem pasteMenu = new JMenuItem("Paste");
		
		fileMenu.add(openMenu);
		fileMenu.add(exitMenu);
		
		editMenu.add(copyMenu);
		editMenu.add(pasteMenu);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		frame.setJMenuBar(menuBar);

		
		frame.setSize(600, 800);
		frame.setVisible(true);
		
		
	}

}
