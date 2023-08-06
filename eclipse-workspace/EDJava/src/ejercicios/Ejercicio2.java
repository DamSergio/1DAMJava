package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField cod;
	private JTextField nom;
	private JTextField loc;
	private JTextArea salida1;
	private JButton ver;
	private JButton limpiar;
	private JComboBox pais;
	private JTextField cod2;
	private JTextField nom2;
	private JTextField grat;
	private JButton ver2;
	private JTextArea salida2;
	private JButton limpiar2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setTitle("Gestion de Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 616, 447);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Insertar departamento", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTO");
		lblNewLabel.setBounds(212, 11, 160, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CODIGO DE DEPARTAMENTO");
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(61, 70, 165, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NOMBRE DE DEPARTAMENTO");
		lblNewLabel_1_1.setBounds(61, 108, 165, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("LOCALIDAD DE DEPARTAMENTO");
		lblNewLabel_1_1_1.setBounds(61, 145, 165, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("LOCALIDAD DE DEPARTAMENTO");
		lblNewLabel_1_1_1_1.setBounds(61, 184, 165, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		cod = new JTextField();
		cod.setBackground(Color.RED);
		cod.setBounds(286, 67, 178, 20);
		panel.add(cod);
		cod.setColumns(10);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(286, 105, 178, 20);
		panel.add(nom);
		
		loc = new JTextField();
		loc.setColumns(10);
		loc.setBounds(286, 142, 178, 20);
		panel.add(loc);
		
		pais = new JComboBox();
		pais.setModel(new DefaultComboBoxModel(new String[] {"España", "Alemania", "Francia"}));
		pais.setBounds(286, 180, 178, 22);
		panel.add(pais);
		
		ver = new JButton("VER DATOS");
		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salida1.setText("El codigo de departamento es: "+cod.getText());
				salida1.append("\nEl nombre de departamento es: "+nom.getText());
				salida1.append("\nLocalidad del departamento es: "+loc.getText());
				salida1.append("\nEl pais de departamento es: "+pais.getSelectedItem());
			}
		});
		ver.setBounds(61, 240, 165, 23);
		panel.add(ver);
		
		limpiar = new JButton("LIMPIAR DATOS");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salida1.setText("");
				cod.setText("");
				nom.setText("");
				loc.setText("");
				pais.setSelectedIndex(0);
			}
		});
		limpiar.setBounds(401, 240, 160, 23);
		panel.add(limpiar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 274, 591, 134);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		salida1 = new JTextArea();
		salida1.setEditable(false);
		salida1.setBounds(0, 0, 591, 134);
		panel_2.add(salida1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("insertar oficinas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("INSERCCION DE OFICINA");
		lblNewLabel_2.setBounds(234, 21, 151, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(89, 269, 442, 139);
		panel_1.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		salida2 = new JTextArea();
		salida2.setEditable(false);
		salida2.setBounds(0, 0, 442, 139);
		panel_3_1.add(salida2);
		
		ver2 = new JButton("VER DATOS");
		ver2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salida2.setText("Codigo: "+cod2.getText());
				salida2.append("\nNombre: "+nom2.getText());
				salida2.append("\nGratificacion: "+grat.getText());
			}
		});
		ver2.setBounds(89, 207, 157, 23);
		panel_1.add(ver2);
		
		limpiar2 = new JButton("LIMPIAR DATOS");
		limpiar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cod2.setText("");
				nom2.setText("");
				grat.setText("");
				salida2.setText("");
			}
		});
		limpiar2.setBounds(374, 207, 157, 23);
		panel_1.add(limpiar2);
		
		JLabel lblNewLabel_3 = new JLabel("CODIGO");
		lblNewLabel_3.setBounds(139, 68, 107, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("NOMBRE");
		lblNewLabel_3_1.setBounds(139, 110, 107, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("GRATIFICACION");
		lblNewLabel_3_2.setBounds(139, 154, 107, 14);
		panel_1.add(lblNewLabel_3_2);
		
		cod2 = new JTextField();
		cod2.setBounds(374, 65, 132, 20);
		panel_1.add(cod2);
		cod2.setColumns(10);
		
		nom2 = new JTextField();
		nom2.setColumns(10);
		nom2.setBounds(374, 107, 132, 20);
		panel_1.add(nom2);
		
		grat = new JTextField();
		grat.setColumns(10);
		grat.setBounds(374, 151, 132, 20);
		panel_1.add(grat);
	}
}
