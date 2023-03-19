package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - ver 1.0");
		lblNewLabel.setBounds(46, 53, 268, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author Caio Araujo");
		lblNewLabel_1.setBounds(46, 85, 172, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Web Service:");
		lblNewLabel_2.setBounds(43, 122, 108, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("republicavirtural.com.br");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setBounds(126, 122, 242, 14);
		getContentPane().add(lblNewLabel_3);
		
		JButton btnGitHub = new JButton("");
		btnGitHub.setBackground(SystemColor.control);
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setToolTipText("Projeto");
		btnGitHub.setBorder(null);
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGitHub.setBounds(37, 190, 48, 48);
		getContentPane().add(btnGitHub);

	}

}
