/**
 * 
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * @author Skylli | eg785934
 *
 */
public class MainWindow {
	private JFrame frame;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public MainWindow() {
		frame = new JFrame("My App");
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Actions");
		JMenuItem ajoutVoiture = new JMenuItem("Ajouter une voiture");
		JMenuItem retraitVoiture = new JMenuItem("Retirer une voiture");
		
		menu.add(ajoutVoiture);
		menu.add(retraitVoiture);
		
		menuBar.add(menu);
		
		frame.add(menuBar, java.awt.BorderLayout.NORTH);
			
		frame.setResizable(false);
		frame.setLocation((int)(screenSize.getWidth()/2)-(frame.getWidth()/2), ((int) (screenSize.getHeight()/2)-(frame.getHeight()/2)));
		frame.setVisible(true);
	}
}
