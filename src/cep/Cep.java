package cep;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class Cep extends JFrame {

	private JPanel contentPane;
	private JTextField textCep;
	private JTextField textEndereco;
	private JTextField textBairro;
	private JTextField textCidade;
	private JComboBox cbboUf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cep() {
		setTitle("Buscar CEP");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEP:");
		lblNewLabel.setBounds(35, 60, 45, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setBounds(10, 97, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		textCep = new JTextField();
		textCep.setBounds(73, 57, 126, 20);
		contentPane.add(textCep);
		textCep.setColumns(10);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(73, 94, 312, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro:");
		lblNewLabel_2.setBounds(27, 133, 53, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade:");
		lblNewLabel_3.setBounds(21, 171, 59, 14);
		contentPane.add(lblNewLabel_3);
		
		textBairro = new JTextField();
		textBairro.setBounds(73, 130, 312, 20);
		contentPane.add(textBairro);
		textBairro.setColumns(10);
		
		textCidade = new JTextField();
		textCidade.setBounds(73, 168, 218, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UF:");
		lblNewLabel_4.setBounds(305, 171, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		cbboUf = new JComboBox();
		cbboUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cbboUf.setBounds(334, 167, 51, 22);
		contentPane.add(cbboUf);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(35, 215, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(214, 56, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnSobre = new JButton("");
		btnSobre.setToolTipText("Sobre");
		btnSobre.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorder(null);
		btnSobre.setBackground(SystemColor.control);
		btnSobre.setBounds(334, 11, 48, 48);
		contentPane.add(btnSobre);
	}
}
