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
	double firstNumber;
	double secondNumber;
	double result;
	String operation;
	private JFrame frame;
	private JTextField txtDisplay;

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

		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 20, 314, 58);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);

		// ------------------ Row 5 -----------------------

		final JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				operation = btnPercent.getText();
				txtDisplay.setText(" ");
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(20, 95, 70, 70);
		frame.getContentPane().add(btnPercent);

		final JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				operation = btnDivide.getText();
				txtDisplay.setText(" ");
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(245, 95, 70, 70);
		frame.getContentPane().add(btnDivide);

		final JButton btnErase = new JButton("<");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String erase = null;

				// Stringbuilder permet de manipuler des strings en insérant ou delete à des
				// endroits spécifiques (commence à 0))

				if (txtDisplay.getText().length() > 0) {
					StringBuilder text = new StringBuilder(txtDisplay.getText());
					text.deleteCharAt(txtDisplay.getText().length() - 1);
					erase = text.toString();
					txtDisplay.setText(erase);
				}
			}
		});
		btnErase.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnErase.setBounds(170, 95, 70, 70);
		frame.getContentPane().add(btnErase);

		final JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
				firstNumber = 0;
				secondNumber = 0;
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(95, 95, 70, 70);
		frame.getContentPane().add(btnClear);

		// ------------------ Row 4 -----------------------




		final JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				operation = btnMultiply.getText();
				txtDisplay.setText(" ");
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(245, 170, 70, 70);
		frame.getContentPane().add(btnMultiply);

		// ------------------ Row 3 -----------------------

		
		final JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				operation = btnMinus.getText();
				txtDisplay.setText(" ");
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(245, 245, 70, 70);
		frame.getContentPane().add(btnMinus);

		// ------------------ Row 2 -----------------------




		final JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				operation = btnPlus.getText();
				txtDisplay.setText(" ");
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(245, 320, 70, 70);
		frame.getContentPane().add(btnPlus);

		// ------------------ Row 1 -----------------------

		

		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = txtDisplay.getText();
				if (enterNumber.contains("."))
					return;
				else {
					enterNumber += btnDot.getText();
					txtDisplay.setText(enterNumber);
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(170, 395, 70, 70);
		frame.getContentPane().add(btnDot);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer = null;
				if (!txtDisplay.getText().equals(" ")) {
					   secondNumber = Double.parseDouble(txtDisplay.getText());
					}
				switch (operation) {
				case "+":
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer.replace(",", "."));
					break;
				case "X":
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer.replace(",", "."));
					break;
				case "-":
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer.replace(",", "."));
					break;
				case "%":
					result = firstNumber / 100;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer.replace(",", "."));
					break;
				case "/":
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer.replace(",", "."));
					break;
				default:
					return;
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(245, 395, 70, 70);
		frame.getContentPane().add(btnEqual);

		final JButton btnNegativePositive = new JButton("±");
		btnNegativePositive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(txtDisplay.getText());
				ops *= (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNegativePositive.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNegativePositive.setBounds(20, 395, 70, 70);
		frame.getContentPane().add(btnNegativePositive);
	}
}
