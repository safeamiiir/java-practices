import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

public class HowYou {
	public static void main(String[] args){
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(400, 400);
		mainFrame.setTitle("Just Write");
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		//GridLayout layout = new  ;
		//mainFrame.setLayout(layout);
		
		JPanel panel = new JPanel();
		
		
		JTextField txt = new JTextField();
		
		mainFrame.add(txt);
		
		
		txt.setBackground(Color.BLUE);
		txt.setForeground(Color.GREEN);
		txt.setText(" Write You Strories here :) ");
		
		JButton clear = new JButton("Clear");
		JButton selectAll = new JButton("Select All");
		JButton Close = new JButton("Close") ;
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
			}
		});
		mainFrame.add(clear);
		
		selectAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.selectAll();
			}
		});
		mainFrame.add(selectAll);
		
		Close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mainFrame.add(Close);
		
		//File bg = new File("play.png");

		mainFrame.setVisible(true);
	}
}
