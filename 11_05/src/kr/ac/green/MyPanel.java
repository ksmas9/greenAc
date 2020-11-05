package kr.ac.green;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MyPanel extends JPanel {
	public static final int TEXT = 0;
	public static final int PASSWORD = 1;
	private static final Dimension LABEL_SIZE = new Dimension(70, 25);
	private static final Dimension FIELD_SIZE = new Dimension(110, 20);
	private JLabel lbl;
	private JTextComponent input;
	public MyPanel(String text, int kind) {
		lbl = new JLabel(text, JLabel.LEFT);
		lbl.setPreferredSize(LABEL_SIZE);
		if(kind == TEXT) {
			input = new JTextField();
		} else {
			input = new JPasswordField();
		}
		input.setPreferredSize(FIELD_SIZE);
		
		add(lbl);
		add(input);
	}
	
	public void setText(String text) {
		input.setText(text);
	}
	public String getText() {
		if(input instanceof JPasswordField) {
			JPasswordField pf = (JPasswordField)input;
			return String.valueOf(pf.getPassword());
		} else {
			return input.getText();
		}
	}
	public boolean isEmpty() {
		return input.getText().trim().length() == 0 ? true : false;
	}
}







