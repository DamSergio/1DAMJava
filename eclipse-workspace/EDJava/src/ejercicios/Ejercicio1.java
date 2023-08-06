package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField pre;
	private JButton limpiar;
	private JButton ver;
	private JRadioButton bajo;
	private JRadioButton medio;
	private JRadioButton alto;
	private JRadioButton extra;
	private JRadioButton prim;
	private JRadioButton seg;
	private JRadioButton sup;
	private JComboBox tipo;
	private JCheckBox tas;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextArea salida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE DE PRODUCTO");
		lblNewLabel.setBounds(30, 26, 122, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIPO DE PRODUCTO");
		lblNewLabel_1.setBounds(30, 51, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRECIO DEL PRODUCTO");
		lblNewLabel_2.setBounds(30, 76, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		nom = new JTextField();
		nom.setBounds(162, 23, 189, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		tipo = new JComboBox();
		tipo.setModel(new DefaultComboBoxModel(new String[] {"De temporada", "De no temporada"}));
		tipo.setBounds(162, 47, 109, 22);
		contentPane.add(tipo);
		
		tas = new JCheckBox("APLICA TASA");
		tas.setBounds(402, 22, 122, 23);
		contentPane.add(tas);
		
		pre = new JTextField();
		pre.setBounds(162, 73, 86, 20);
		contentPane.add(pre);
		pre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CATEGORIA");
		lblNewLabel_3.setBounds(30, 125, 68, 14);
		contentPane.add(lblNewLabel_3);
		
		extra = new JRadioButton("EXTRA");
		buttonGroup.add(extra);
		extra.setBounds(104, 121, 97, 23);
		contentPane.add(extra);
		ButtonModel ext=extra.getModel();
		
		seg = new JRadioButton("SEGUNDA");
		buttonGroup.add(seg);
		seg.setBounds(221, 121, 97, 23);
		contentPane.add(seg);
		ButtonModel se=seg.getModel();
		
		prim = new JRadioButton("PRIMERA");
		buttonGroup.add(prim);
		prim.setBounds(104, 152, 97, 23);
		contentPane.add(prim);
		ButtonModel pri=prim.getModel();
		
		sup = new JRadioButton("SUPER EXTRA");
		buttonGroup.add(sup);
		sup.setBounds(221, 152, 116, 23);
		contentPane.add(sup);
		ButtonModel su=sup.getModel();
		
		JLabel lblNewLabel_4 = new JLabel("IVA");
		lblNewLabel_4.setBounds(30, 199, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		bajo = new JRadioButton("4%");
		buttonGroup_1.add(bajo);
		bajo.setBounds(104, 195, 59, 23);
		contentPane.add(bajo);
		ButtonModel baj=bajo.getModel();
		
		medio = new JRadioButton("10%");
		buttonGroup_1.add(medio);
		medio.setBounds(176, 195, 59, 23);
		contentPane.add(medio);
		ButtonModel med=medio.getModel();
		
		alto = new JRadioButton("21%");
		buttonGroup_1.add(alto);
		alto.setBounds(247, 195, 59, 23);
		contentPane.add(alto);
		ButtonModel alt=alto.getModel();
		
		ver = new JButton("VER DATOS TECLEADOS");
		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salida.setText("El nombre del producto es: "+nom.getText());
				salida.append("\nEl tipo de producto es: "+tipo.getSelectedItem());
				salida.append("\nEl precio del producto es: "+pre.getText());
				if (tas.isSelected()) {
					salida.append("\nAplicar tasa");
				} else {
					salida.append("\nNo aplicar tasa");
				}
				if (buttonGroup.getSelection()!=null) {
					if (buttonGroup.getSelection().equals(ext)) {
						salida.append("\nCategoria Extra");
					}
					if (buttonGroup.getSelection().equals(se)) {
						salida.append("\nCategoria Segunda");
					}
					if (buttonGroup.getSelection().equals(pri)) {
						salida.append("\nCategoria Primera");
					}
					if (buttonGroup.getSelection().equals(su)) {
						salida.append("\nCategoria Super Extra");
					}
				}
				if (buttonGroup_1.getSelection()!=null) {
					if (buttonGroup_1.getSelection().equals(baj)) {
						salida.append("\nIva 4%");
					}
					if (buttonGroup_1.getSelection().equals(med)) {
						salida.append("\nIva 10%");
					}
					if (buttonGroup_1.getSelection().equals(alt)) {
						salida.append("\nIva 21%");
					}
				}
				
			}
		});
		ver.setBounds(30, 246, 241, 37);
		contentPane.add(ver);
		
		limpiar = new JButton("LIMPIAR DATOS");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salida.setText("");
				nom.setText("");
				pre.setText("");
				tipo.setSelectedIndex(0);
				tas.setSelected(false);
				buttonGroup_1.clearSelection();
				buttonGroup.clearSelection();
			}
		});
		limpiar.setBounds(296, 246, 241, 37);
		contentPane.add(limpiar);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 309, 507, 131);
		contentPane.add(panel);
		panel.setLayout(null);
		
		salida = new JTextArea();
		salida.setEditable(false);
		salida.setBounds(0, 0, 507, 131);
		panel.add(salida);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 507, 131);
		panel.add(scrollPane);
		
	}
}
