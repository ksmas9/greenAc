package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * MyActionListener 를 구현하고 Counter2와 연동시키시오.
 */
class MyActionListener1 implements ActionListener {
	private Counter2 counter;
	
	public MyActionListener1(Counter2 counter) {
		this.counter = counter;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel lblNum = counter.getLblNum();
		
		String strNum = lblNum.getText();	
		int num = Integer.parseInt(strNum);
		num++;
		strNum = String.valueOf(num);
		lblNum.setText(strNum);
	}
}

public class Counter2 extends JFrame {
	private JLabel lblNum;

	private JButton btnPlus;
	
	public Counter2() {
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	public JLabel getLblNum() {
		return lblNum;
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
		ActionListener listener = new MyActionListener1(this);
		btnPlus.addActionListener(listener);
	}
	
	private void showFrame() {		
		setTitle("counter2");
		setSize(300, 400);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Counter2();
	}
}
