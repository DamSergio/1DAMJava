import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo1 extends JFrame {

	private JPanel contentPane;
	private JButton insertar;
	private JButton borrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 frame = new Ejemplo1();
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
	public Ejemplo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{124, 141, 46, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{14, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTO");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 1;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo de departamento");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JTextField cod = new JTextField();
		GridBagConstraints gbc_cod = new GridBagConstraints();
		gbc_cod.insets = new Insets(0, 0, 5, 5);
		gbc_cod.fill = GridBagConstraints.HORIZONTAL;
		gbc_cod.gridx = 2;
		gbc_cod.gridy = 2;
		contentPane.add(cod, gbc_cod);
		cod.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de departamento");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JTextField nombre = new JTextField();
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombre.gridx = 2;
		gbc_nombre.gridy = 3;
		contentPane.add(nombre, gbc_nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad departamento");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.BASELINE_TRAILING;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JTextField lugar = new JTextField();
		GridBagConstraints gbc_lugar = new GridBagConstraints();
		gbc_lugar.insets = new Insets(0, 0, 5, 5);
		gbc_lugar.fill = GridBagConstraints.HORIZONTAL;
		gbc_lugar.gridx = 2;
		gbc_lugar.gridy = 4;
		contentPane.add(lugar, gbc_lugar);
		lugar.setColumns(10);
		
		insertar = new JButton("Insertar datos");
		insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("El codigo del departamento es: "+cod.getText());
				System.out.println("El nombre del departamento es: "+nombre.getText());
				System.out.println("La localidad del departamento es: "+lugar.getText());
			}
		});
		GridBagConstraints gbc_insertar = new GridBagConstraints();
		gbc_insertar.insets = new Insets(0, 0, 0, 5);
		gbc_insertar.gridx = 0;
		gbc_insertar.gridy = 7;
		contentPane.add(insertar, gbc_insertar);
		
		borrar = new JButton("Limpiar datos");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cod.setText("");
				nombre.setText("");
				lugar.setText("");
			}
		});
		GridBagConstraints gbc_borrar = new GridBagConstraints();
		gbc_borrar.insets = new Insets(0, 0, 0, 5);
		gbc_borrar.gridx = 2;
		gbc_borrar.gridy = 7;
		contentPane.add(borrar, gbc_borrar);
	}

}
