package calculators;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Design {

	private JFrame frame;
	private JTextField txtDisplay;

	public Design() {

		this.setFrame(new JFrame("Calculator"));
		this.getFrame().setBounds(100, 100, 350, 519);
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getFrame().getContentPane().setLayout(null);
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