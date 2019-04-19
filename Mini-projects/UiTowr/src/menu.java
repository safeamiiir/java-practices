import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.KeyStore;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class menu extends JFrame{
	public menu() {
		setTitle("JmenuBar");
		JMenuBar menubar = new JMenuBar();
		ImageIcon icon = new ImageIcon("exit.png");
		JMenu file = new JMenu("File");
		//file.setMnemonic(KeyEvent.VK_F);
		JMenuItem fileClose = new JMenuItem("Close" ,icon);
		//fileClose.setMnemonic(KeyEvent.VK_F);
		fileClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N , ActionEvent.ALT_MASK));
		fileClose.setToolTipText("Exit Application" );
		fileClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("It works !");
				System.exit(0);
			}
		});
		file.add(fileClose);
		menubar.add(file);
		setJMenuBar(menubar);
		setSize(250, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
