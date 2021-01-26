package calculators;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button {

	private Design design;
	private double firstNumber = 0;
	private double secondNumber = 0;
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
				design.getFrame().getContentPane().add(buttons);
				createButtonFunction(buttons, String.valueOf(buttonName[i][j]));

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
	private void createButtonFunction(final JButton buttons, final String value) {

		buttons.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (isNumeric(buttons.getText()))
					design.getTxtDisplay().setText(design.getTxtDisplay().getText().concat(value));
				if (!isNumeric(buttons.getText()))

					if (buttons.getText() == "%" || buttons.getText() == "+" || buttons.getText() == "-"
							|| buttons.getText() == "/" || buttons.getText() == "X") {

						firstNumber = Double.parseDouble(design.getTxtDisplay().getText());
						operation = buttons.getText();
						design.getTxtDisplay().setText("");
					}

				switch (buttons.getText()) {
				case "C":
					design.getTxtDisplay().setText("");
					firstNumber = 0;
					secondNumber = 0;
					break;
				case "<":
					String erase = null;

					if (design.getTxtDisplay().getText().length() > 0) {

						StringBuilder text = new StringBuilder(design.getTxtDisplay().getText());
						text.deleteCharAt(design.getTxtDisplay().getText().length() - 1);
						erase = text.toString();
						design.getTxtDisplay().setText(erase);
					}
					break;

				case "±":
					double ops = Double.parseDouble(design.getTxtDisplay().getText());
					ops *= (-1);
					design.getTxtDisplay().setText(String.valueOf(ops));
					break;

				case ".":
					String enterNumber = design.getTxtDisplay().getText();

					if (enterNumber.contains(".")) {
						return;

					} else {
						enterNumber += ".";
						design.getTxtDisplay().setText(enterNumber);
					}
					break;
				case "=":
					String answer = null;
					if (!design.getTxtDisplay().getText().equals("")) {
						secondNumber = Double.parseDouble(design.getTxtDisplay().getText());
					}
					switch (operation) {
					case "+":
						result = firstNumber + secondNumber;
						answer = String.format("%.2f", result);
						design.getTxtDisplay().setText(answer.replace(",", "."));
						break;
					case "X":
						result = firstNumber * secondNumber;
						answer = String.format("%.2f", result);
						design.getTxtDisplay().setText(answer.replace(",", "."));
						break;
					case "-":
						result = firstNumber - secondNumber;
						answer = String.format("%.2f", result);
						design.getTxtDisplay().setText(answer.replace(",", "."));
						break;
					case "%":
						result = firstNumber / 100;
						answer = String.format("%.2f", result);
						design.getTxtDisplay().setText(answer.replace(",", "."));
						break;
					case "/":
						result = firstNumber / secondNumber;
						answer = String.format("%.2f", result);
						design.getTxtDisplay().setText(answer.replace(",", "."));
						break;
					default:
						return;
					}
					break;

				}

			}

		});
	}
}
