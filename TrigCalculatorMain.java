package TrigCalcRadiansOnly;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TrigCalculatorMain {

	public static void main(String[] args) {
		JFrame window = new JFrame("Trig Calculator");
		TrigCalculatorPanel content = new TrigCalculatorPanel();
		window.setContentPane(content);
		TrigCalculatorListener listener = new TrigCalculatorListener(content, content.getButtonPanel(), content.getInputPanel());
		
		window.setSize(700,550);
		window.setLocation(100,100);
		window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		window.setVisible(true);

	}
}
