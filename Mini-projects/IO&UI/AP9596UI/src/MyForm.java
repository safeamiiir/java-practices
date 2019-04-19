import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javafx.stage.FileChooser;

import javax.swing.*;

import com.sun.glass.events.KeyEvent;


public class MyForm extends JFrame{

	JPanel topPanel, leftPanel, centerPanel;
	JButton northButton1, northButton2;
	JRadioButton redRB, blueRB, greenRB;
	JComboBox combo;
	JTextField text;
	JTextField text2;
	JLabel label;
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("File");
	JMenuItem menuItem = new JMenuItem("Open");
	
	
	public MyForm() {
		// TODO Auto-generated constructor stub
		
		this.setLayout(new BorderLayout());
		topPanel = new JPanel();
		
		northButton1 = new JButton("first");
		northButton2 = new JButton("second");
		
		topPanel.add(northButton1);
		topPanel.add(northButton2);
		
		
		redRB = new JRadioButton("RED");
		blueRB = new JRadioButton("BLUE");
		greenRB = new JRadioButton("GREEN");
		
		blueRB.setSelected(true);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(redRB);
		bg.add(blueRB);
		bg.add(greenRB);
		
		combo = new JComboBox();
		combo.addItem("first");
		combo.addItem("second");
		
		text = new JTextField(5);
		text.setSize(10, 30);
		
		GridLayout gridLayout = new GridLayout(20, 1);
		
		text2 = new JTextField(3);
		
		label = new JLabel("label");
		
		leftPanel = new JPanel();
		leftPanel.setBackground(Color.red);
		
		BoxLayout boxLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
		//leftPanel.setLayout(boxLayout);
		
		leftPanel.setLayout(gridLayout);

		leftPanel.add(redRB);
		leftPanel.add(blueRB);
		leftPanel.add(greenRB);
		
		leftPanel.add(combo);
		
		leftPanel.add(text);
		
		leftPanel.add(label);
		
		leftPanel.add(text2);
		
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(leftPanel, BorderLayout.WEST);

		this.add(topPanel, BorderLayout.NORTH);
		
		centerPanel = new JPanel();
		
		final FileDialog fd = new FileDialog(this);
		final JFileChooser fc = new JFileChooser();
		
		menuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//fd.setVisible(true);
				
				//System.out.println(fd.getDirectory());
				fc.show(true);
			}
		});
		
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
		menu.add(menuItem);
		menuBar.add(menu);
		
		JMenu subMenu = new JMenu("select one item");
		subMenu.add(new JMenuItem("aa"));
		subMenu.add(new JMenuItem("bb"));
		
		menu.add(subMenu);
		
		this.setJMenuBar(menuBar);
	
		
		this.setSize(600, 800);
		this.setVisible(true);
		
		this.addWindowListener(new WindowListener() {
			
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
		});
	}
}
