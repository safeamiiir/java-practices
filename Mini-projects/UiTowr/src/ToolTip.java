import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToolTip extends JFrame {
	private Toolkit toolkit;
	public ToolTip() {
		
		setTitle(" toolTip ");
		setSize(300,200);
		toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize(); 
		setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2 );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		panel.setLayout(null);
		panel.setToolTipText(" a panel container ! " );
		
		JButton button = new  JButton(" Button ");
		button.setBounds(100, 60, 80, 30);
		button.setToolTipText(" A Button Component ! ");
		panel.add(button);
		
	}

}
