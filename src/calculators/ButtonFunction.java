package calculators;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFunction implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == CalculatorButton.numberButton[i]) {
				CalculatorDesign.getTxtDisplay().setText(CalculatorDesign.getTxtDisplay().getText().concat(String.valueOf(i)));
			}
		}
			
	}

	
}
