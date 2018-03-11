package TrigCalcRadiansOnly;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class TrigCalculatorPanel extends JPanel {
	
	private InputPanel inputPanel = new InputPanel(); //unit circle
	private ButtonPanel buttonPanel = new ButtonPanel(); //calculator

	public TrigCalculatorPanel() {
		this.setLayout(new BorderLayout());
		this.add(inputPanel, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}

	public InputPanel getInputPanel() {
		return inputPanel;
	}

	public void setInputPanel(InputPanel inputPanel) {
		this.inputPanel = inputPanel;
	}

	public ButtonPanel getButtonPanel() {
		return buttonPanel;
	}

	public void setButtonPanel(ButtonPanel buttonPanel) {
		this.buttonPanel = buttonPanel;
	}

	
}
