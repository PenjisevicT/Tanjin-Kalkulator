package kalkulatorGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KalkulatorGUI extends JFrame {

	private JPanel contentPane;
	private double x;
	private double y;
	private String znak;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkulatorGUI frame = new KalkulatorGUI();
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
	public KalkulatorGUI() {
		setForeground(Color.LIGHT_GRAY);
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.LIGHT_GRAY);
		scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
		scrollPane.setBounds(0, 0, 362, 52);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textArea.setForeground(Color.BLACK);
		textArea.setCaretColor(Color.WHITE);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBackground(Color.WHITE);
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String s = textArea.getText();
				textArea.setText(s + "1");
			}
		});
		buttonGroup.add(btn1);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(10, 63, 50, 50);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = textArea.getText();
				textArea.setText(s + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(76, 63, 50, 50);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = textArea.getText();
				textArea.setText(s + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(143, 63, 50, 50);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s = textArea.getText();
				textArea.setText(s + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 124, 50, 50);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = textArea.getText();
				textArea.setText(s + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(76, 124, 50, 50);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = textArea.getText();
				textArea.setText(s + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(143, 124, 50, 50);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = textArea.getText();
				textArea.setText(s + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 185, 50, 50);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s = textArea.getText();
				textArea.setText(s + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(76, 185, 50, 50);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = textArea.getText();
				textArea.setText(s + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(143, 185, 50, 50);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s = textArea.getText();
				textArea.setText(s + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 248, 116, 50);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s = textArea.getText();
				textArea.setText(s + ".");
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(143, 248, 50, 50);
		contentPane.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String b = textArea.getText();
				int d = b.length();
				int i = b.indexOf(znak);
				String c = b.substring(i+1,d);
				y= Double.parseDouble(c);
				switch (znak)
				{
					case "+":
						double zbir = x+y;
						textArea.setText(""+zbir);
						break;
					case "-":
						double razlika = x-y;
						textArea.setText(""+razlika);
						break;
					case "*":
						double proizvod = x*y;
						textArea.setText(""+proizvod);
						break;
					case "/":
						if (y == 0)
						{
							textArea.setText("ERR");
						} else
						{
							double kolicnik = x/y;
							textArea.setText(""+kolicnik);
						}
						break;
						
						
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEqual.setBounds(10, 315, 276, 50);
		contentPane.add(btnEqual);
		
		JButton btnDvs = new JButton("/");
		btnDvs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String a = textArea.getText();
				znak = "/";
				x = Double.parseDouble(a);
				textArea.setText(a + "/\n");
			}
		});
		btnDvs.setBackground(Color.ORANGE);
		btnDvs.setSelected(true);
		btnDvs.setForeground(Color.BLACK);
		btnDvs.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDvs.setBounds(236, 63, 50, 50);
		contentPane.add(btnDvs);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String a = textArea.getText();
				znak = "*";
				x = Double.parseDouble(a);
				textArea.setText(a + "*\n");
			}
		});
		btnMul.setBackground(Color.ORANGE);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(236, 124, 50, 50);
		contentPane.add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String a = textArea.getText();
				znak = "-";
				x = Double.parseDouble(a);
				textArea.setText(a + "-\n");
			}
		});
		btnSub.setBackground(Color.ORANGE);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(236, 185, 50, 50);
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String a = textArea.getText();
				znak = "+";
				x = Double.parseDouble(a);
				textArea.setText(a + "+\n");
			}
		});
		btnAdd.setBackground(Color.ORANGE);
		btnAdd.setBorderPainted(false);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(236, 248, 50, 50);
		contentPane.add(btnAdd);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				znak = "";
				textArea.setText("");
				x=0;
				y=0;
			}
		});
		btnC.setBackground(Color.RED);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(296, 63, 50, 50);
		contentPane.add(btnC);
	}
}
