import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel pnl = new JPanel(new GridBagLayout());
		JButton b = new JButton("B button ");
		pnl.add(b);
		
	}

}
