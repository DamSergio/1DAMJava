package klejrdnbgkjrsdbgnjkdf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField nombrecamp;
	private JTextField paiscamp;
	private JButton limp;
	private JButton insert;
	private JRadioButton cosa;
	private JRadioButton hombre;
	private JRadioButton mujer;
	private JCheckBox recom;
	private JComboBox lineacamp;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblValorant;
	private JLabel lblNewLabel_2;
	private JTextField nombreva;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField paisva;
	private JRadioButton hombreva;
	private JRadioButton mujerva;
	private JComboBox ulti;
	private JScrollPane scrollPane_1;
	private JTextArea salidava;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton insertar;
	private JButton btnLimpiar;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 767, 438);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("LoL", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("League Of Legends (LoL)");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(198, 11, 373, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del campeon:");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_1.setBounds(30, 67, 150, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pais del campeon:");
		lblNewLabel_1_1.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(30, 114, 150, 26);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Linea:");
		lblNewLabel_1_2.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(30, 162, 150, 26);
		panel.add(lblNewLabel_1_2);
		
		hombre = new JRadioButton("Hombre");
		hombre.setFont(new Font("Consolas", Font.BOLD, 11));
		buttonGroup.add(hombre);
		hombre.setBounds(402, 69, 109, 23);
		panel.add(hombre);
		ButtonModel onvre=hombre.getModel();
		
		cosa = new JRadioButton("Cosa");
		cosa.setFont(new Font("Consolas", Font.BOLD, 11));
		buttonGroup.add(cosa);
		cosa.setBounds(402, 116, 109, 23);
		panel.add(cosa);
		ButtonModel coso=cosa.getModel();
		
		recom = new JCheckBox("Lo recomiendas?");
		recom.setFont(new Font("Consolas", Font.BOLD, 11));
		recom.setBounds(549, 116, 127, 23);
		panel.add(recom);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 251, 742, 148);
		panel.add(scrollPane);
		
		JTextArea salidalol = new JTextArea();
		salidalol.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
		scrollPane.setViewportView(salidalol);
		
		mujer = new JRadioButton("Mujer");
		mujer.setFont(new Font("Consolas", Font.BOLD, 11));
		buttonGroup.add(mujer);
		mujer.setBounds(549, 69, 109, 23);
		panel.add(mujer);
		ButtonModel muger=mujer.getModel();
		
		nombrecamp = new JTextField();
		nombrecamp.setBackground(Color.CYAN);
		nombrecamp.setBounds(159, 70, 109, 20);
		panel.add(nombrecamp);
		nombrecamp.setColumns(10);
		
		paiscamp = new JTextField();
		paiscamp.setBackground(Color.CYAN);
		paiscamp.setColumns(10);
		paiscamp.setBounds(159, 117, 109, 20);
		panel.add(paiscamp);
		
		lineacamp = new JComboBox();
		lineacamp.setModel(new DefaultComboBoxModel(new String[] {"TOP", "JUNGLA", "MID", "ADC", "SUPP"}));
		lineacamp.setBounds(159, 164, 109, 22);
		panel.add(lineacamp);
		
		insert = new JButton("INSERTAR");
		insert.setFont(new Font("Consolas", Font.BOLD, 11));
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salidalol.setText("El nombre del campeon es: "+nombrecamp.getText());
				salidalol.append("\nEl pais del campeon es: "+paiscamp.getText());
				salidalol.append("\nLa linea del campeon es: "+lineacamp.getSelectedItem());
				if (buttonGroup.getSelection()!=null) {
					if (buttonGroup.getSelection().equals(onvre)) {
						salidalol.append("\nEl campeon es hombre");
					}
					if (buttonGroup.getSelection().equals(muger)) {
						salidalol.append("\nLa campeona es mujer");
					}
					if (buttonGroup.getSelection().equals(coso)) {
						salidalol.append("\nEl campeon es de genero no binario");
					}
				}
				if(recom.isSelected()) {
					salidalol.append("\nRecomiendas el campeon");
				} else {
					salidalol.append("\nNo recomiendas el campeon");
				}
			}
		});
		insert.setBounds(402, 217, 109, 23);
		panel.add(insert);
		
		limp = new JButton("LIMPIAR");
		limp.setFont(new Font("Consolas", Font.BOLD, 11));
		limp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombrecamp.setText("");
				paiscamp.setText("");
				lineacamp.setSelectedIndex(0);
				buttonGroup.clearSelection();
				recom.setSelected(false);
				salidalol.setText("");
			}
		});
		limp.setBounds(549, 217, 109, 23);
		panel.add(limp);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Valorant", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblValorant = new JLabel("Valorant");
		lblValorant.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorant.setForeground(Color.RED);
		lblValorant.setFont(new Font("Consolas", Font.BOLD, 23));
		lblValorant.setBackground(Color.BLACK);
		lblValorant.setBounds(181, 11, 373, 36);
		panel_1.add(lblValorant);
		
		lblNewLabel_2 = new JLabel("Nombre del agente:");
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 64, 150, 26);
		panel_1.add(lblNewLabel_2);
		
		nombreva = new JTextField();
		nombreva.setBounds(191, 65, 112, 20);
		panel_1.add(nombreva);
		nombreva.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Pais del agente:");
		lblNewLabel_3.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 110, 150, 26);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Tipo de ulti del agente:");
		lblNewLabel_4.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_4.setBounds(420, 59, 150, 26);
		panel_1.add(lblNewLabel_4);
		
		paisva = new JTextField();
		paisva.setBounds(191, 111, 112, 20);
		panel_1.add(paisva);
		paisva.setColumns(10);
		
		hombreva = new JRadioButton("Hombre");
		buttonGroup_1.add(hombreva);
		hombreva.setBounds(420, 110, 109, 23);
		panel_1.add(hombreva);
		ButtonModel onvreva=hombreva.getModel();
		
		mujerva = new JRadioButton("Mujer");
		buttonGroup_1.add(mujerva);
		mujerva.setBounds(600, 110, 109, 23);
		panel_1.add(mujerva);
		ButtonModel mugerva=mujerva.getModel();
		
		ulti = new JComboBox();
		ulti.setModel(new DefaultComboBoxModel(new String[] {"Utilidad", "Area", "Kill"}));
		ulti.setBounds(600, 64, 109, 22);
		panel_1.add(ulti);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 214, 742, 185);
		panel_1.add(scrollPane_1);
		
		salidava = new JTextArea();
		scrollPane_1.setViewportView(salidava);
		
		insertar = new JButton("INSERTAR");
		insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salidava.setText("El nombre del agente es: "+nombreva.getText());
				salidava.append("\nEl pais del agente es: "+paisva.getText());
				salidava.append("\nEl tipo de ulti del agente es: "+ulti.getSelectedItem());
				if (buttonGroup_1.getSelection()!=null) {
					if (buttonGroup_1.getSelection().equals(onvreva)) {
						salidava.append("\nEl agente es hombre");
					}
					if (buttonGroup_1.getSelection().equals(mugerva)) {
						salidava.append("\nEl agente es mujer");
					}
				}
			}
		});
		insertar.setBounds(10, 180, 98, 23);
		panel_1.add(insertar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombreva.setText("");
				paisva.setText("");
				ulti.setSelectedIndex(0);
				buttonGroup_1.clearSelection();
				salidava.setText("");
			}
		});
		btnLimpiar.setBounds(663, 180, 89, 23);
		panel_1.add(btnLimpiar);
	}
}
