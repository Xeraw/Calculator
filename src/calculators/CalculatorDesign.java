package calculators;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorDesign {
	
	private JFrame frame;
	private JTextField txtDisplay;
	
	public CalculatorDesign () {
		
		this.setFrame(new JFrame("Calculator"));
		this.getFrame().setBounds(100, 100, 350, 519);
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getFrame().getContentPane().setLayout(null);
		this.getFrame().setVisible(true);

		this.setTxtDisplay(new JTextField());
		this.getTxtDisplay().setFont(new Font("Tahoma", Font.BOLD, 14));
		this.getTxtDisplay().setHorizontalAlignment(SwingConstants.RIGHT);
		this.getTxtDisplay().setBounds(10, 20, 314, 58);
		this.getFrame().getContentPane().add(getTxtDisplay());
		this.getTxtDisplay().setColumns(10);
		this.getTxtDisplay().setEditable(false);
		
	}
	
public CalculatorDesign (int x, int y) {
		
		this.setFrame(new JFrame("Calculator"));
		this.getFrame().setBounds(100, 100, x, y);
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getFrame().getContentPane().setLayout(null);
		this.getFrame().setVisible(true);

		this.setTxtDisplay(new JTextField());
		this.getTxtDisplay().setFont(new Font("Tahoma", Font.BOLD, 14));
		this.getTxtDisplay().setHorizontalAlignment(SwingConstants.RIGHT);
		this.getTxtDisplay().setBounds(10, 20, 314, 58);
		this.getFrame().getContentPane().add(getTxtDisplay());
		this.getTxtDisplay().setColumns(10);
		this.getTxtDisplay().setEditable(false);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTxtDisplay() {
		return txtDisplay;
	}

	public void setTxtDisplay(JTextField txtDisplay) {
		this.txtDisplay = txtDisplay;
	}






}
