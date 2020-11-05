package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyActionListener2 implements ActionListener {
	private Counter3 counter;
	
	public MyActionListener2(Counter3 counter) {
		this.counter = counter;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		counter.buttonPressed();
	}	
}
public class Counter3 extends JFrame {
	private JLabel lblNum;
	private JButton btnPlus;
	
	public Counter3() {
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	
	private void init() {
		lblNum = new JLabel("0", JLabel.CENTER);
		lblNum.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
		
		btnPlus = new JButton("Plus");
	}

	private void setDisplay() {
		add(lblNum, BorderLayout.CENTER);
		add(btnPlus, BorderLayout.SOUTH);
	}

	private void addListeners() {
		ActionListener listener = new MyActionListener2(this);
		btnPlus.addActionListener(listener);
	}
	
	private void showFrame() {		
		setTitle("counter3");
		setSize(300, 400);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void buttonPressed() {
		 int num = Integer.parseInt(lblNum.getText());
		 num++;
		 lblNum.setText(String.valueOf(num));
	}
	
	public static void main(String[] args) {
		new Counter3();
	}
}





