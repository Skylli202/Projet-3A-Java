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

import Parc.ParcAutoVoiture;

/**
 * @author Skylli | eg785934
 *
 */
public class MainWindow extends JFrame {
	private JFrame frame;
	

	private ParcAutoVoiture parc1;
	
	private void initNonGUIcomponents() {
		parc1 = new ParcAutoVoiture("MainWindow Parc");
	}
	
	public MainWindow() {
		initNonGUIcomponents();
	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		frame = new JFrame("My App :  Gestion de Parc");
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		JMenuBar menuBar = new JMenuBar();

		JMenu menu = new JMenu("Actions");
		JMenuItem ajoutVoiture = new JMenuItem("Ajouter une voiture");
		JMenuItem retraitVoiture = new JMenuItem("Retirer une voiture");

		ajoutVoiture.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ajoutVoitureActionPerformed(evt);
			}
		});

		menu.add(ajoutVoiture);
		menu.add(retraitVoiture);

		menuBar.add(menu);

		frame.add(menuBar, java.awt.BorderLayout.NORTH);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation((int)(screenSize.getWidth()/2)-(frame.getWidth()/2), ((int) (screenSize.getHeight()/2)-(frame.getHeight()/2)));
		frame.setVisible(true);
	}

	private void ajoutVoitureActionPerformed(java.awt.event.ActionEvent evt) {
		AddCarDlg dlg = new AddCarDlg();
		dlg.setVisible(true);
		
		parc1.ajoutVoiture(dlg.getVoiture());
		
		System.out.println("MainWindow : " + parc1.contains(dlg.getVoiture()));
	}
}
