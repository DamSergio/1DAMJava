package nose;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField apellido;
	private JComboBox edadBox;
	private JRadioButton mujer;
	private JRadioButton hombre;
	private JRadioButton lgtb;
	private JPanel panel;
	private JCheckBox checkBailarin;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JRadioButton msm;
	private JRadioButton llamada;
	private JCheckBox hoy;
	private JTextField telefono;
	private JTextField correo;
	private JPanel panel_1;
	private JButton borrar2;
	private JButton enviar2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario frame = new formulario();
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
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 306);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("Ventana 1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formulario");
		lblNewLabel.setForeground(new Color(128, 128, 0));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 28));
		lblNewLabel.setBounds(122, 11, 176, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 63, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(10, 96, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setBounds(10, 121, 46, 14);
		panel.add(lblNewLabel_3);
		
		nombre = new JTextField();
		nombre.setForeground(new Color(0, 0, 0));
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nombre.setBounds(67, 60, 86, 20);
		panel.add(nombre);
		nombre.setColumns(10);
		
		apellido = new JTextField();
		apellido.setBounds(66, 93, 86, 20);
		panel.add(apellido);
		apellido.setColumns(10);
		
		edadBox = new JComboBox();
		edadBox.setModel(new DefaultComboBoxModel(new String[] {"18", "19", "20", "21"}));
		edadBox.setBounds(66, 117, 60, 22);
		panel.add(edadBox);
		
		mujer = new JRadioButton("Mujer");
		buttonGroup.add(mujer);
		mujer.setBounds(200, 59, 109, 23);
		panel.add(mujer);
		ButtonModel muger=mujer.getModel();
		
		hombre = new JRadioButton("Hombre");
		buttonGroup.add(hombre);
		hombre.setBounds(200, 92, 109, 23);
		panel.add(hombre);
		ButtonModel omvre=hombre.getModel();
		
		lgtb = new JRadioButton("LGTB+");
		buttonGroup.add(lgtb);
		lgtb.setBounds(200, 121, 109, 23);
		panel.add(lgtb);
		ButtonModel lgtv=lgtb.getModel();
		
		checkBailarin = new JCheckBox("Bailarin");
		checkBailarin.setBounds(312, 92, 97, 23);
		panel.add(checkBailarin);
		
		JButton enviar = new JButton("Enviar");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(("")+nombre.getText());
				textArea.append(("\n"+apellido.getText()));
				textArea.append(("\n")+edadBox.getSelectedItem());
				
				if(checkBailarin.isSelected()) {
					textArea.append("\n Es bailarin");
				}else {
					textArea.append("\n No es bailarin");
				}
				
				if(buttonGroup.getSelection()!=null) {
					if(buttonGroup.getSelection()==muger) {
						textArea.append("\n Mujer");
					}
					if(buttonGroup.getSelection()==omvre) {
						textArea.append("\n Hombre");
					}
					if(buttonGroup.getSelection()==lgtv) {
						textArea.append("\n LGTB");
					}
					
				}
				
				
			}
		});
		enviar.setBounds(76, 158, 89, 23);
		panel.add(enviar);
		
		
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(419, 212, -397, 69);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setBounds(32, 187, 365, 80);
		panel.add(textArea);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Ventana 2", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblNewLabel_4 = new JLabel("Pagina de Contacto");
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.BOLD, 16));
		lblNewLabel_4.setForeground(new Color(128, 128, 0));
		lblNewLabel_4.setBounds(118, 11, 156, 25);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Telfono");
		lblNewLabel_5.setBounds(10, 47, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Correo");
		lblNewLabel_6.setBounds(10, 87, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		msm = new JRadioButton("MSM");
		buttonGroup.add(msm);
		msm.setBounds(199, 43, 109, 23);
		panel_1.add(msm);
		ButtonModel mensaje=msm.getModel();
		
		
		llamada = new JRadioButton("Llamada");
		buttonGroup.add(llamada);
		llamada.setBounds(199, 83, 109, 23);
		panel_1.add(llamada);
		ButtonModel yamada=llamada.getModel();
		
		hoy = new JCheckBox("Hoy?");
		hoy.setBounds(134, 109, 97, 23);
		panel_1.add(hoy);
		
		telefono = new JTextField();
		telefono.setForeground(new Color(128, 128, 0));
		telefono.setBounds(66, 44, 86, 20);
		panel_1.add(telefono);
		telefono.setColumns(10);
		
		correo = new JTextField();
		correo.setForeground(new Color(0, 0, 0));
		correo.setBounds(66, 84, 127, 20);
		panel_1.add(correo);
		correo.setColumns(10);
		
		borrar2 = new JButton("Borrar");
		borrar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("");
				telefono.setText("");
				buttonGroup.clearSelection();
				hoy.setSelected(false);
				
			}
		});
		borrar2.setBounds(304, 83, 89, 23);
		panel_1.add(borrar2);
		
		enviar2 = new JButton("Enviar");
		enviar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText((" ")+telefono.getText());
				textArea_1.append(("\n")+correo.getText());
				 
				if(hoy.isSelected()) {
					textArea_1.append("\n Para hoy");
				}else {
					textArea_1.append("\n otro dia");
				}
				 
				if(buttonGroup.getSelection()!=null) {
					if(buttonGroup.getSelection()==mensaje) {
						textArea_1.append("\n Mensaje");
					}
				}if(buttonGroup.getSelection()==yamada) {
					textArea_1.append("\n llamada");
				}
				
				
			}
		});
		JButton btnNewButton_1 = new JButton("Borrar datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				nombre.setText("");
				apellido.setText("");
				edadBox.setSelectedIndex(0);
				checkBailarin.setSelected(false);
				buttonGroup.clearSelection();
			}
		});
		btnNewButton_1.setBounds(209, 158, 89, 23);
		panel.add(btnNewButton_1);
		enviar2.setBounds(304, 43, 89, 23);
		panel_1.add(enviar2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 154, 383, 84);
		panel_1.add(scrollPane_1);
		
		textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
	}
}
