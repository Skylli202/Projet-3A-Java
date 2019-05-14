package garbage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Parc.ParcAutoVoiture;
import Vehicule.Voiture;

public class TestDlg extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ParcAutoVoiture parc = new ParcAutoVoiture("Test Dlg Parc");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			TestDlg dialog = new TestDlg();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TestDlg() {
		Voiture voiture1 = new Voiture("BMW", "M3", "EE-001-EE", LocalDate.parse("2018-01-01"));
		Voiture voiture2 = new Voiture("Volvo", "xc70", "AA-002-AA", LocalDate.parse("2018-01-01"));
		Voiture voiture3 = new Voiture("Renault", "Twingo", "EE-003-EE", LocalDate.parse("2018-01-01"));
		parc.ajoutVoiture(voiture1);
		parc.ajoutVoiture(voiture2);
		parc.ajoutVoiture(voiture3);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JList list = new JList(new Vector<Voiture>(parc.getArray()));
			contentPanel.add(list);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnAjouterUneVoiture = new JButton("Ajouter une voiture");
				btnAjouterUneVoiture.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						addCar();
					}
				});
				btnAjouterUneVoiture.setHorizontalAlignment(SwingConstants.LEFT);
				buttonPane.add(btnAjouterUneVoiture);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void addCar() {
		parc.ajoutVoiture(new Voiture());
		System.out.println("Default voiture added");
		
		
	}

}
