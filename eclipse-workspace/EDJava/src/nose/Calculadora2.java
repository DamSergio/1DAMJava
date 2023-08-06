package nose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculadora2 extends JFrame {

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b8;
	private JButton b9;
	private JButton bmas;
	private JButton bmenos;
	private JButton bmul;
	private JButton b0;
	private JButton bigu;
	private JButton bdiv;
	private JTextArea textArea;
	private JButton b7;
	private JButton bdel;
	
	private ArrayList<Double> numeros=new ArrayList<>();
	private ArrayList<String> simbolos=new ArrayList<>();
	private double numero=0;
	private double ans=0;
	private JButton bdelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora2 frame = new Calculadora2();
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
	public Calculadora2() {
		float n1=0, n2=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
				numero*=10;
				numero+=7;
			}
		});
		b7.setBounds(10, 124, 50, 48);
		contentPane.add(b7);
		
		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
				numero*=10;
				numero+=4;
			}
		});
		b4.setBounds(10, 211, 50, 48);
		contentPane.add(b4);
		
		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
				numero*=10;
				numero+=5;
			}
		});
		b5.setBounds(97, 211, 50, 48);
		contentPane.add(b5);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("1");
				numero*=10;
				numero+=1;
			}
		});
		b1.setBounds(10, 298, 50, 48);
		contentPane.add(b1);
		
		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
				numero*=10;
				numero+=8;
			}
		});
		b8.setBounds(97, 124, 50, 48);
		contentPane.add(b8);
		
		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
				numero*=10;
				numero+=6;
			}
		});
		b6.setBounds(184, 211, 50, 48);
		contentPane.add(b6);
		
		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
				numero*=10;
				numero+=3;
			}
		});
		b3.setBounds(184, 298, 50, 48);
		contentPane.add(b3);
		
		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
				numero*=10;
			}
		});
		b0.setBounds(97, 385, 50, 48);
		contentPane.add(b0);
		
		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
				numero*=10;
				numero+=2;
			}
		});
		b2.setBounds(97, 298, 50, 48);
		contentPane.add(b2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 311, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 311, 48);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		bigu = new JButton("=");
		bigu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("=");
				numeros.add(numero);
				ans+=numeros.get(0);
				for (int i=1; i<numeros.size(); i++) {
					if (simbolos.size()>0) {
						switch (simbolos.get(i-1)) {
						case "+":
							ans+=numeros.get(i);
							break;
						case "-":
							ans-=numeros.get(i);
							break;
						case "*":
							ans*=numeros.get(i);
							break;
						case "/":
							ans/=numeros.get(i);
							break;
						}
					}
				}
				numeros.removeAll(numeros);
				simbolos.removeAll(simbolos);
				numero=0;
				String imp=ans+"";
				textArea.append(imp);
			}
		});
		bigu.setBounds(184, 385, 50, 48);
		contentPane.add(bigu);
		
		bmas = new JButton("+");
		bmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("+");
				simbolos.add("+");
				numeros.add(numero);
				numero=0;
			}
		});
		bmas.setBounds(271, 124, 50, 48);
		contentPane.add(bmas);
		
		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
				numero*=10;
				numero+=9;
			}
		});
		b9.setBounds(184, 124, 50, 48);
		contentPane.add(b9);
		
		bmenos = new JButton("-");
		bmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("-");
				simbolos.add("-");
				numeros.add(numero);
				numero=0;
				
			}
		});
		bmenos.setBounds(271, 211, 50, 48);
		contentPane.add(bmenos);
		
		bmul = new JButton("*");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("*");
				simbolos.add("*");
				numeros.add(numero);
				numero=0;
				
			}
		});
		bmul.setBounds(271, 298, 50, 48);
		contentPane.add(bmul);
		
		bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("/");
				simbolos.add("/");
				numeros.add(numero);
				numero=0;
			}
		});
		bdiv.setBounds(271, 385, 50, 48);
		contentPane.add(bdiv);
		
		bdel = new JButton("CL");
		bdel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		bdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				numeros.removeAll(numeros);
				ans=0;
				numero=0;
			}
		});
		bdel.setBounds(10, 384, 50, 49);
		contentPane.add(bdel);
	}
}
