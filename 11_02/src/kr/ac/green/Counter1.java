package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter1 extends JFrame implements ActionListener {
	private JLabel lblNum;
	private JButton btnPlus;
	
	public Counter1() {
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
	// eventListener, eventSource 연결
	private void addListeners() {
		btnPlus.addActionListener( this );
	}
	
	private void showFrame() {		
		setTitle("counter1");
		setSize(300, 400);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 버튼 눌러졌을 때 할 일
		// 1. lblNum 값을 가져온다(String)
		String strNum = lblNum.getText();	
		// 2. String -> int
		int num = Integer.parseInt(strNum);
		// 3. 증가
		num++;
		// 4. int -> String
		strNum = String.valueOf(num);
		// 5. 4의 결과를 lblNum에 설정한다.
		lblNum.setText(strNum);
	}
	
	public static void main(String[] args) {
		new Counter1();
	}
}




