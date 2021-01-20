package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 20, 314, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//------------------ Row 5 -----------------------
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(20, 95, 70, 70);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(245, 95, 70, 70);
		frame.getContentPane().add(btnDivide);
		
		JButton btnErase = new JButton("<");
		btnErase.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnErase.setBounds(170, 95, 70, 70);
		frame.getContentPane().add(btnErase);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(95, 95, 70, 70);
		frame.getContentPane().add(btnClear);
		
		//------------------ Row 4 -----------------------
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(170, 170, 70, 70);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(95, 170, 70, 70);
		frame.getContentPane().add(btn8);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(20, 170, 70, 70);
		frame.getContentPane().add(btn7);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(245, 170, 70, 70);
		frame.getContentPane().add(btnMultiply);
		
		//------------------ Row 3 -----------------------

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(170, 245, 70, 70);
		frame.getContentPane().add(btn6);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(95, 245, 70, 70);
		frame.getContentPane().add(btn5);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(20, 245, 70, 70);
		frame.getContentPane().add(btn4);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(245, 245, 70, 70);
		frame.getContentPane().add(btnMinus);
		
		//------------------ Row 2 -----------------------

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(170, 320, 70, 70);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(95, 320, 70, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(20, 320, 70, 70);
		frame.getContentPane().add(btn1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(245, 320, 70, 70);
		frame.getContentPane().add(btnPlus);
		
		//------------------ Row 1 -----------------------
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(95, 395, 70, 70);
		frame.getContentPane().add(btn0);
		
		JButton btnComa = new JButton(",");
		btnComa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnComa.setBounds(170, 395, 70, 70);
		frame.getContentPane().add(btnComa);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(245, 395, 70, 70);
		frame.getContentPane().add(btnEqual);
		
		JButton btnNegativePositive = new JButton("±");
		btnNegativePositive.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNegativePositive.setBounds(20, 395, 70, 70);
		frame.getContentPane().add(btnNegativePositive);
	}
}
