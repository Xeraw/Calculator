package calculators;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button {

	private Design design;
	private double firstNumber = 0;
	private double secondNumber;
	private double result = 0;
	private String operation;
	private String[][] buttonName = { { "%", "C", "<", "/" }, { "7", "8", "9", "X" }, { "4", "5", "6", "-" },
			{ "1", "2", "3", "+" }, { "±", "0", ".", "=" } };

	public Button(Design designParam) {
		this.design = designParam;

	}

	public void createButton() {

		for (int i = 0; i < buttonName.length; i++) {

			for (int j = 0; j < buttonName[j].length; j++) {

				JButton buttons = new JButton(buttonName[i][j]);
				buttons.setFont(new Font("Tahoma", Font.BOLD, 20));
				buttons.setBounds(20 + j * 75, 95 + i * 75, 70, 70);
				addButtonFunction(buttons, String.valueOf(buttonName[i][j]));
				design.getFrame().getContentPane().add(buttons);

			}
		}
	}

	/**
	 * Check is the String is a number
	 * 
	 * @param strNum
	 * @return
	 */
	private boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	/**
	 * Add the button's function
	 * 
	 * @param buttons
	 * @param value   value of the array [i][j]
	 */
	private void addButtonFunction(final JButton buttons, final String value) {

		if (isNumeric(value)) {

			addNumericButtonActionListener(buttons, value);

		}
		if (buttons.getText() == "%" || buttons.getText() == "+" || buttons.getText() == "-" || buttons.getText() == "/"
				|| buttons.getText() == "X") {

			addOperationButtonActionListener(buttons);

		} else {
			switch (value) {
			case "C":
				addCButtonActionListener(buttons);
				break;
			case "<":
				addDelButtonActionListener(buttons);
				break;
			case "±":
				addPosNegButtonActionListener(buttons);
				break;
			case ".":
				addDotButtonActionListener(buttons);
				break;
			case "=":
				addEqualButtonActionListener(buttons);
				break;
			}
		}
	}

	private void addCButtonActionListener(JButton buttons) {
		buttons.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				design.getTxtDisplay().setText("");
				firstNumber = 0;
				secondNumber = 0;
			}
		});
	}

	private void addEqualButtonActionListener(JButton buttons) {
		buttons.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (!design.getTxtDisplay().getText().equals("")) {
					secondNumber = Double.parseDouble(design.getTxtDisplay().getText());
				}
				switch (operation) {
				case "+":
					result = firstNumber + secondNumber;
					break;
				case "X":
					result = firstNumber * secondNumber;
					break;
				case "-":
					result = firstNumber - secondNumber;
					break;
				case "%":
					result = firstNumber / 100;
					break;
				case "/":
					result = firstNumber / secondNumber;
				
					break;
				default:
					return;
				}
				firstNumber = result;
				displayResult();

			}
		});
	}

	private void addNumericButtonActionListener(JButton buttons, final String value) {

		buttons.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				design.getTxtDisplay().setText(design.getTxtDisplay().getText().concat(value));

			}
		});
	}

	private void addOperationButtonActionListener(final JButton buttons) {
		buttons.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(design.getTxtDisplay().getText());
				operation = buttons.getText();
				design.getTxtDisplay().setText("");
			}
		});
	}

	private void addPosNegButtonActionListener(final JButton buttons) {
		buttons.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(design.getTxtDisplay().getText());
				ops *= (-1);
				design.getTxtDisplay().setText(String.valueOf(ops));
			}
		});
	}

	private void addDotButtonActionListener(final JButton buttons) {
		buttons.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String enterNumber = design.getTxtDisplay().getText();

				if (enterNumber.contains(".")) {
					return;

				} else {
					enterNumber += ".";
					design.getTxtDisplay().setText(enterNumber);
				}
			}
		});
	}

	private void addDelButtonActionListener(final JButton buttons) {
		buttons.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String erase = null;

				if (design.getTxtDisplay().getText().length() > 0) {

					StringBuilder text = new StringBuilder(design.getTxtDisplay().getText());
					text.deleteCharAt(design.getTxtDisplay().getText().length() - 1);
					erase = text.toString();
					design.getTxtDisplay().setText(erase);
				}
			}
		});
	}

	private void displayResult() {
		String answer;
		answer = String.format("%.2f", result);
		design.getTxtDisplay().setText(answer.replace(",", "."));
	}

}
