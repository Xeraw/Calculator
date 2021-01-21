package calculators;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorDesign {

	private static JFrame frame;
	private static JTextField txtDisplay;


	
	/**
	 * Initialize the contents of the frame.
	 */
	public static void initialize() {

		setFrame(new JFrame("Calculator"));
		getFrame().setBounds(100, 100, 350, 519);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().setVisible(true);

		setTxtDisplay(new JTextField());
		getTxtDisplay().setFont(new Font("Tahoma", Font.BOLD, 14));
		getTxtDisplay().setHorizontalAlignment(SwingConstants.RIGHT);
		getTxtDisplay().setBounds(10, 20, 314, 58);
		getFrame().getContentPane().add(getTxtDisplay());
		getTxtDisplay().setColumns(10);
		getTxtDisplay().setEditable(false);

	}

	
	/**
	 * @return the frame
	 */
	public static JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public static void setFrame(JFrame frame) {
		CalculatorDesign.frame = frame;
	}


	/**
	 * @return the txtDisplay
	 */
	public static JTextField getTxtDisplay() {
		return txtDisplay;
	}


	/**
	 * @param txtDisplay the txtDisplay to set
	 */
	public static void setTxtDisplay(JTextField txtDisplay) {
		CalculatorDesign.txtDisplay = txtDisplay;
	}

}
