import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JList;
import javax.swing.DropMode;

public class Ejemplo1v2 extends JFrame {

	private JPanel contentPane;
	private JTextField cod;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField nom;
	private JLabel lblNewLabel_3;
	private JTextField loc;
	private JComboBox pais;
	private JScrollPane scrollPane;
	private JTextArea salida;
	private JButton ins;
	private JButton limp;
	private JLabel lblNewLabel_4;
	private JRadioButton tecno;
	private JRadioButton apoyo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton personal;
	private JRadioButton gestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1v2 frame = new Ejemplo1v2();
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
	public Ejemplo1v2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		cod = new JTextField();
		cod.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTO");
		
		lblNewLabel_1 = new JLabel("CODIGO DE DEPARTAMENTO");
		
		lblNewLabel_2 = new JLabel("NOMBRE DE DEPARTAMENTO");
		
		nom = new JTextField();
		nom.setColumns(10);
		
		lblNewLabel_3 = new JLabel("LOCALIDAD DEL DEPARTAMENTO");
		
		loc = new JTextField();
		loc.setColumns(10);
		
		
		
		limp = new JButton("LIMPIAR DATOS");
		limp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cod.setText("");
				nom.setText("");
				loc.setText("");
				pais.setSelectedIndex(0);
			}
		});
		
		pais = new JComboBox();
		pais.setMaximumRowCount(5);
		pais.setModel(new DefaultComboBoxModel(new String[] {"España", "Italia", "Francia", "Alemania", "Britanico"}));
		pais.setSelectedIndex(0);
		
		scrollPane = new JScrollPane();
		
		lblNewLabel_4 = new JLabel("PAIS");
		
		gestion = new JRadioButton("GESTION");
		buttonGroup.add(gestion);
		ButtonModel gest=gestion.getModel();
		
		personal = new JRadioButton("PERSONAL");
		buttonGroup.add(personal);
		ButtonModel per=personal.getModel();
		
		apoyo = new JRadioButton("APOYO");
		buttonGroup.add(apoyo);
		ButtonModel apoy=apoyo.getModel();
		
		tecno = new JRadioButton("TECNOLOGICO");
		buttonGroup.add(tecno);
		ButtonModel tec=tecno.getModel();
		
		ins = new JButton("INSERTAR DATOS");
		ins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("El codigo del departamento es: "+cod.getText());
				System.out.println("El nombre del departamento es: "+nom.getText());
				System.out.println("La localidad del departamento es: "+loc.getText());
				System.out.println("El pais del departamento es: "+pais.getSelectedItem());
				System.out.println("El pais del departamento es: "+(pais.getSelectedIndex()+1));
				if (buttonGroup.getSelection()!=null) {
					if (buttonGroup.getSelection().equals(gest)) {
						System.out.println("pulsastes gestion");
					}
					if (buttonGroup.getSelection().equals(per)) {
						System.out.println("pulsastes personal");
					}
					if (buttonGroup.getSelection().equals(apoy)) {
						System.out.println("pulsastes apoyo");
					}
					if (buttonGroup.getSelection().equals(tec)) {
						System.out.println("pulsastes tecnologico");
					}
				}
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("TIPO DE DEPARTAMENTO");
		
		JList list = new JList();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_4))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(nom, Alignment.LEADING)
										.addComponent(loc, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
										.addComponent(pais, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(limp, Alignment.LEADING)
										.addComponent(cod)
										.addComponent(lblNewLabel)))
								.addComponent(ins)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(95)
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5)
								.addComponent(apoyo)
								.addComponent(personal)
								.addComponent(gestion)
								.addComponent(tecno))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(cod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gestion))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(loc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(personal))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_4)
									.addComponent(pais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(apoyo))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tecno))
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(ins)
						.addComponent(limp))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		salida = new JTextArea();
		salida.setEditable(false);
		scrollPane.setViewportView(salida);
		contentPane.setLayout(gl_contentPane);
	}
}
