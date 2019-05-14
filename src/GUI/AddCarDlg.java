package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Vehicule.Voiture;

public class AddCarDlg extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private Voiture v;
	private JTextField marqueField;
	private JTextField modeleField;
	private JTextField immatField;
	private JTextField premImmatField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddCarDlg dialog = new AddCarDlg();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddCarDlg() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(4, 2, 0, 0));
		{
			JLabel marqueLabel = new JLabel("Marque :");
			contentPanel.add(marqueLabel);
		}
		{
			marqueField = new JTextField();
			contentPanel.add(marqueField);
			marqueField.setColumns(10);
		}
		{
			JLabel modeleLabel = new JLabel("Modèle :");
			contentPanel.add(modeleLabel);
		}
		{
			modeleField = new JTextField();
			contentPanel.add(modeleField);
			modeleField.setColumns(10);
		}
		{
			JLabel immatLabel = new JLabel("Immatriculation :");
			contentPanel.add(immatLabel);
		}
		{
			immatField = new JTextField();
			contentPanel.add(immatField);
			immatField.setColumns(10);
		}
		{
			JLabel premImmatLabel = new JLabel("Première Immat. \n yyyy-MM-dd");
			contentPanel.add(premImmatLabel);
		}
		{
			premImmatField = new JTextField();
			premImmatField.setColumns(10);
			contentPanel.add(premImmatField);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						okButtonAction();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cancelButtonAction();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public Voiture getVoiture() {
		return v;
	}
	
	private void okButtonAction() {
    	String marque = marqueField.getText();
    	String modele = modeleField.getText();
    	String immat = immatField.getText();
    	LocalDate premCircul = LocalDate.parse(premImmatField.getText()); 
    	
    	v = new Voiture(marque, modele, immat, premCircul);
		
		this.setVisible(false);
        dispose();
	}
	
	private void cancelButtonAction() {
		this.setVisible(false);
        dispose();
	}

}
