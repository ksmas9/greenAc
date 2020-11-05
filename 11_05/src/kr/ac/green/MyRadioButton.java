package kr.ac.green;

import java.awt.Color;

import javax.swing.JRadioButton;

public class MyRadioButton extends JRadioButton{
	private Color color;
	
	public MyRadioButton(String text, Color color) {
		super(text);
		setColor(color);
	}
	public MyRadioButton(String text, Color color, boolean selected) {
		super(text, selected);
		setColor(color);
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
