package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageLabelEx extends JFrame {
	public ImageLabelEx() {
		JLabel lbl = new JLabel();
		// lbl.setIcon(new ImageIcon("chokey.jpg"));
		Image img = Toolkit.getDefaultToolkit().getImage("chokey.jpg");
		Image newImage = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		
		lbl.setIcon(new ImageIcon(newImage));
		lbl.setText("√›ø¿≈∞");
		//LEFT, RIGHT, CENTER
		lbl.setHorizontalTextPosition(JLabel.CENTER);
		//LEFT, RIGHT, CENTER
		Font font = new Font("±√º≠", Font.ITALIC | Font.BOLD, 40);
		lbl.setForeground(Color.PINK);
		lbl.setFont(font);		
		
		
		add(lbl, BorderLayout.CENTER);

		setTitle("√›ø¿≈∞");
//		setLocation(300, 300);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImageLabelEx();
	}
}
