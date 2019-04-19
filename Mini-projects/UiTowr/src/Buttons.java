import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons extends JFrame {
	private Toolkit toolkit;
	public Buttons() {
		setTitle(" Buttons" );
		setSize(300,200);
		toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel= new JPanel();
		getContentPane().add(panel);
	    panel.setLayout(null);
		
		JButton beep = new JButton("Beep");
		beep.setBounds(150, 60, 80, 30);
		beep.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				toolkit.beep();
			}
		});
		
		JButton close = new JButton(" close ");
		close.setBounds(50, 60, 80, 30);
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		panel.add(beep);
		panel.add(close);
		
		
	}
}
