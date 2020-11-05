package kr.ac.green;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame1 extends JFrame {
	public MyFrame1() {

		JButton btn = new JButton("이건 버튼"); // 버튼 객체 생성
		add(btn); // 버튼
		
		JButton btn2 = new JButton("버튼2");
		add(btn2); // 버튼
		setTitle("MyFrame"); // 타이틀이름
		setSize(400, 300); // 크기
		setLocation(300, 100); // 위치
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 끄는거
		setVisible(true); // 보이게
	}

	public static void main(String[] args) {

		new MyFrame1();

	}
}

// 컴포넌트 구성요소
// 컨테이너 다른 컴포넌트들을 부착 시킬수있는 컴포넌트 ex) JFrame base container