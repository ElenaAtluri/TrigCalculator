package TrigCalcRadiansOnly;
import java.awt.event.*;

public class TrigCalculatorListener implements ActionListener, MouseListener {

	private TrigCalculatorPanel panel;
	private ButtonPanel buttonPanel; //choose function
	private InputPanel inputPanel; //unit circle
		
	public TrigCalculatorListener(TrigCalculatorPanel panel, ButtonPanel buttonPanel, InputPanel inputPanel) {
		this.panel = panel;
		this.buttonPanel = buttonPanel;
		this.inputPanel = inputPanel;
		panel.addMouseListener(this);
		
		buttonPanel.getSine().addActionListener(this);
		buttonPanel.getCosine().addActionListener(this);
		buttonPanel.getTangent().addActionListener(this);
		buttonPanel.getCosecant().addActionListener(this);
		buttonPanel.getSecant().addActionListener(this);
		buttonPanel.getCotangent().addActionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		panel.requestFocusInWindow();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		panel.requestFocusInWindow();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double x;
		try {
			String xStr = buttonPanel.getValue().getText();
            x = Double.parseDouble(xStr);
		}
		catch (NumberFormatException er) {
			buttonPanel.getValue().setText("Illegal data for x.");
			panel.requestFocusInWindow();
            return;
		}
		
		String function = e.getActionCommand();
		if (function.equals("sin")) {
			buttonPanel.getAnswerLabel().setText("Answer: " + Math.sin(x));
		}
		else if (function.equals("cos")) {
			buttonPanel.getAnswerLabel().setText("Answer: " + Math.cos(x));
		}
		else if (function.equals("tan")) {
			buttonPanel.getAnswerLabel().setText("Answer: " + Math.tan(x));
		}
		else if (function.equals("csc")) {
			buttonPanel.getAnswerLabel().setText("Answer: " + (1/Math.sin(x)));
		}
		else if (function.equals("sec")) {
			buttonPanel.getAnswerLabel().setText("Answer: " + (1/Math.cos(x)));
		}
		else if (function.equals("cot")) {
			buttonPanel.getAnswerLabel().setText("Answer: " + (1/Math.tan(x)));
		}
	}
	

}
