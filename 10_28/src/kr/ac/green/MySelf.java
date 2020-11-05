package kr.ac.green;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MySelf extends JFrame{
	
	public MySelf(){
				
		JPanel pnlNorth = new JPanel(); // 판낼 객체 생성
		pnlNorth.add(new JLabel("사용자 입력")); // 사용자입력 레이블
		
		JTextField tf = new JTextField(20); //텍스트박스 객체생성
		tf.setText("안녕하세요"); //텍스트박스에 넣을말
		pnlNorth.add(tf);  //텍스트 박스 부착
		
		JButton b1 = new JButton("입력버튼");//버튼객체생성
		pnlNorth.add(b1); //버튼 부착하기
		
		add(pnlNorth, BorderLayout.NORTH); //상단에 pnlNorth부착
		
		JPanel pnlCenter = new JPanel();
		
		
		setTitle("Program");
		setSize(500,500);
		setLocation(700,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MySelf();
	}
}
