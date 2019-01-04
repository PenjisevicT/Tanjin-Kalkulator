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
		setResizable(false);
		setForeground(Color.LIGHT_GRAY);
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 426);
		setLocationRelativeTo(null);
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
				unosBroja("1", textArea);
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
				unosBroja("2", textArea);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(76, 63, 50, 50);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				unosBroja("3", textArea);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(143, 63, 50, 50);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				unosBroja("4", textArea);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 124, 50, 50);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				unosBroja("5", textArea);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(76, 124, 50, 50);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				unosBroja("6", textArea);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(143, 124, 50, 50);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				unosBroja("7", textArea);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 185, 50, 50);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				unosBroja("8", textArea);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(76, 185, 50, 50);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				unosBroja("9", textArea);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(143, 185, 50, 50);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				unosBroja("0", textArea);
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
	
	public void unosBroja(String broj, JTextArea txtPolje)
	{
		String s = txtPolje.getText();
		
		//Ispod je ovo detaljno objasnjenjo :D
		if (s.matches(".+[+*/-]\\n")) //Specijalan slucaj, kada treba prva cifra drugog broja da se unese, onda je 
		{                             //odmah unosimo jer nema potrebe da proveravamo koliko je dugacak, kada je vec prva :) 
			txtPolje.setText(s + broj);
			return;     //Odmah se vracamo, nema sta dalje da radimo
		}
		
		/*
		 * Treba da proverimo koliko je broj dugacak da bi videli moze li korisnik da unese jos cifara. 
		 * Ideja je sledeca. Znamo da ce eventualno nas izraz da izgleda ovako "34+5". Znaci mi treba da podelimo to na
		 * "34" i "5" da bi mogli da proverimo duzinu svako broja posebno. Delicemo broj string metodom split(). Ona od jednog
		 * stringa napravi niz stringova kada joj kazemo sta joj je granicnik. Na primer "34+5".split("+") nam da niz {"34", "5"}
		 * Posto znamo da nas niz moze da ima jedan (dok korisnik kuca prvi broj) ili dva clana (kada korisnik kuca drugi) moramo
		 * da znamo koji od ta dva broja treutno gledamo.
		 */ 
		
		int clan = 0; //Indeks u nizu. Stavljamo ga odmah na nulu jer ce, u pocetku, dok korisnik kuca prvi broj bude prvi clan 
		             //u nizu. Na primer, na samom startu nemamo nista, "".split("+") ce da kaze a u ja nemam "+" nigde tu, evo tebi
		             //nazad sve, pa nam da { "" }. Onda korisnik kuca 3, dobijemo "3", opet, "3".split("+") bude { "3" }... Sve dokle
		             //korisnik ne otkuca neku operaciju mi imamo samo 1 clan na indeksu 0 i njega gledamo.
		
		int imaDec = 0; //Dodatna stvar. Imamo brojeve sa ostatkom. Ako korisnik moze da ukuca pet cifri znaci "12345" ali i
		                //"123.45". Mora da obratimo paznju na to postoji li . u broju, i ako postoji a hocemo da moze samo da se unese
		                //5 cifri onda moramo da kazemo ok imas tacku, onda 6 karaktera sveukupno. int je, a ne boolean, zato sto
		                //ovako olaksa posao. Posle je samo postavimo na 1 ako ima ., pa onda kazem kucaj dok je manje od 5 + imaDec.
		               //Ako je nema, bude 0, pa idemo do 5, a ako je ima onda smo na 6 :)
		
		//Sada moramo da proverimo da li gledamo prvi ili drugi broj koji korisnik unosi. matches() ce da mi kaze da li se string 
		//koji gledamo poklapa sa onim u zagradama. Taj uvrnuti izraz u zagradama je regex, regular expression. Prica sama za sebe :)
		//Jos o tome na https://en.wikipedia.org/wiki/Regular_expression
		//U kratkim crtama, mozemo da mu objasnimo sta da trazi vrlo vrlo detaljno.
		//Prevod:
		//       s.matches             ("         .+                                   [+*/-]                          \\n               .+")
		//Ako je string s jednak sa:          Pocinje sa bilo sta         pa onda imamo + ili - ili / ili -           pa novi red      pa bilo sta
		
		//Zasto novi red? Pa, nas digitron, kada upisuje operaciju, kada korisnik otkuca "34+5"
		//On to hoce da prikaze kao
		//34+
		//5
		//Pa stavi "34+\n5" i mi to moramo da navedemo ovde 
		
		
		if (s.matches(".+[+*/-]\\n.+"))  //Ako se ovo poklapa znaci da mi gledamo u nesto kao "34+5", samim tim nas intresuje drugi clan
		{                                //tj. 5, pa stavljamo indeks na 1
			clan = 1;
		}
		
		//Jos nam je ostalo da proverimo da li imamo tacku negde u tom broju
		//Prevod:
		//      .+                            \\.                .+
		//  Pocinje sa bilo sta         pa ima tacku        i zavrsava se sa bilo sta
		if (s.split("[+*/-]\\n")[clan].matches(".+\\..+"))
		{
			imaDec = 1;
		}
		
		if (s.split("[+*/-]\\n")[clan].length() < 5 + imaDec)  //Na kraju samo proveravamo jesmo li probili limit od 5 (plus tacka ako je ima)
		{
			txtPolje.setText(s + broj);       //Ako nismo, upisujemo novu cifru, ako jesmo ne desava se ama nista
		}
	}
}
