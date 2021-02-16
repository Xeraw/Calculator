package calculators;

public class Calculator {

	public static void main(String[] args) {
		
			Design design = new Design();
			Button bouton = new Button(design);
			bouton.createButton();
			design.getFrame().setVisible(true);

			
		}


	}


