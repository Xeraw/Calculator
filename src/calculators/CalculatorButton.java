package calculators;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorButton {

	static JButton[] numberButton = new JButton[10];
	static JButton[] functionButton = new JButton[10];
	static JButton addButton, multButton, clearButton, deleteButton, percentButton;
	static JButton equalButton, divideButton, minusButton, signButton, dotButton;

	private CalculatorDesign design;

	public CalculatorButton(CalculatorDesign designParam) {
		this.design = designParam;

	}
	/**
	 * Create button number from 0 to 9and place them in frame.
	 */

	public void createNumberButton() {

		for (int i = 0; i < 10; i++) {
			JButton numberButton = new JButton(String.valueOf(i));
			numberButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			design.getFrame().getContentPane().add(numberButton);
			addNumberButtonListerner(numberButton, String.valueOf(i));
			if (i == 0)
				numberButton.setBounds(95, 395, 70, 70);
			if (i == 1 || i == 4 || i == 7)
				numberButton.setBounds(20, 345 - i * 25, 70, 70);
			if (i == 2 || i == 5 || i == 8)
				numberButton.setBounds(95, 345 - (i - 1) * 25, 70, 70);
			if (i == 3 || i == 6 || i == 9)
				numberButton.setBounds(170, 345 - (i - 2) * 25, 70, 70);
		}

	}
	private void addNumberButtonListerner(JButton numberButton, final String test) {

		numberButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				design.getTxtDisplay().setText(design.getTxtDisplay().getText().concat(test));

			}
		});

	}
private void addFunctionButtonListerner(final JButton functionButton) {
		
	functionButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (functionButton.getText() == "%" || functionButton.getText() == "+" ||
				functionButton.getText() == "-" || functionButton.getText() == "/" || functionButton.getText() == "X") {
			
			double firstNumber = Double.parseDouble(design.getTxtDisplay().getText());
			String operation = functionButton.getText();
			design.getTxtDisplay().setText("");
		//	System.out.println(firstNumber + " " + operation);

			if (functionButton.getText() == ".") {
				
			}
			}
			
		}
	});

}
	/**
	 * Create button and place in frame
	 */
	public void createFunctionButton() {

		addButton = new JButton("+");
		multButton = new JButton("X");
		clearButton = new JButton("C");
		deleteButton = new JButton("<");
		divideButton = new JButton("/");
		equalButton = new JButton("=");
		minusButton = new JButton("-");
		signButton = new JButton("±");
		percentButton = new JButton("%");
		dotButton = new JButton(".");

		functionButton[0] = percentButton;
		functionButton[1] = clearButton;
		functionButton[2] = deleteButton;
		functionButton[3] = divideButton;
		functionButton[4] = equalButton;
		functionButton[5] = addButton;
		functionButton[6] = minusButton;
		functionButton[7] = multButton;
		functionButton[8] = signButton;
		functionButton[9] = dotButton;

		for (int i = 0; i < 10; i++) {
			functionButton[i].setFont(new Font("Tahoma", Font.BOLD, 20));
			design.getFrame().getContentPane().add(functionButton[i]);

			addFunctionButtonListerner(functionButton[i]);

			if (i < 4)
				functionButton[i].setBounds(20 + i * 75, 95, 70, 70);
			if (i > 3 && i < 8)
				functionButton[i].setBounds(245, 395 - (i - 4) * 75, 70, 70);
			if (i == 8 || i == 9)
				functionButton[i].setBounds(20 + (i - 8) * 150, 395, 70, 70);

		}
	}

}
