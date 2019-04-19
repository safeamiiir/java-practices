import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CenterOnScreen extends JFrame {
	public CenterOnScreen() {
		setSize(300,200);
		setTitle(" Center On Screen" );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
	}
}
