package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter4 extends JFrame implements IDoAction {
	private JLabel lblNum;
	private JButton btnPlus;
	
	public Counter4() {
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
	private void addListeners() { //이벤트 리스너 메서드
		btnPlus.addActionListener(new MyActionListener3(this)); //btn 이벤트 발생시 MyAction객체 생성
	}
	private void showFrame() {		
		setTitle("counter4");
		setSize(300, 400);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void action() {	//이벤트 발생시 할일 정의
		int num = Integer.parseInt(lblNum.getText());
		num++;
		lblNum.setText(String.valueOf(num));
	}
	
	public static void main(String[] args) {
		new Counter4();
	}

}
