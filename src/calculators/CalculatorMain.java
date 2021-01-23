package calculators;

public class CalculatorMain {

	public static void main(String[] args) {
		
		CalculatorDesign design = new CalculatorDesign();
		CalculatorButton button = new CalculatorButton(design);
		button.createNumberButton();
		button.createFunctionButton();
	}

}
