package TrigCalcRadiansOnly;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class ButtonPanel extends JPanel {

	private JTextField value; 
	private double answer;
	private JLabel valueLabel;
	private JLabel answerLabel;

	private JButton sine;
	private JButton cosine; 
	private JButton tangent;
	private JButton cosecant;
	private JButton secant;
	private JButton cotangent;

	public ButtonPanel() {		
		this.setLayout(new GridLayout(2, 1));
		JPanel topPanel = new JPanel(); 
		topPanel.setLayout(new GridLayout(1, 7));

		JPanel valuePanel = new JPanel();
		JTextField hello = new JTextField();
		value = new JTextField(150);
		topPanel.add(new JLabel("Value: "));
		topPanel.add(value);

		sine = new JButton("sin");
		cosine = new JButton("cos");
		tangent = new JButton("tan");
		cosecant = new JButton("csc");
		secant = new JButton("sec");
		cotangent = new JButton("cot");

		JPanel answerPanel = new JPanel();
		if (topPanel.hasFocus()) {
			answerPanel.setBackground(Color.CYAN);
		}
		answerLabel = new JLabel("Answer: " + answer);
		answerPanel.add(answerLabel);

		topPanel.add(valuePanel);
		topPanel.add(sine);
		topPanel.add(cosine);
		topPanel.add(tangent);
		topPanel.add(cosecant);
		topPanel.add(secant);
		topPanel.add(cotangent);

		this.add(topPanel);
		this.add(answerPanel);

	}

	public JTextField getValue() {
		return value;
	}

	public void setValue(JTextField value) {
		this.value = value;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}

	public JLabel getValueLabel() {
		return valueLabel;
	}

	public void setValueLabel(JLabel valueLabel) {
		this.valueLabel = valueLabel;
	}

	public JButton getSine() {
		return sine;
	}

	public void setSine(JButton sine) {
		this.sine = sine;
	}

	public JButton getCosine() {
		return cosine;
	}

	public void setCosine(JButton cosine) {
		this.cosine = cosine;
	}

	public JButton getTangent() {
		return tangent;
	}

	public void setTangent(JButton tangent) {
		this.tangent = tangent;
	}

	public JButton getCosecant() {
		return cosecant;
	}

	public void setCosecant(JButton cosecant) {
		this.cosecant = cosecant;
	}

	public JButton getSecant() {
		return secant;
	}

	public void setSecant(JButton secant) {
		this.secant = secant;
	}

	public JButton getCotangent() {
		return cotangent;
	}

	public void setCotangent(JButton cotangent) {
		this.cotangent = cotangent;
	}

	public JLabel getAnswerLabel() {
		return answerLabel;
	}

	public void setAnswerLabel(JLabel answerLabel) {
		this.answerLabel = answerLabel;
	}

	

}
