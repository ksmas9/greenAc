package kr.ac.green;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz2 extends JFrame {
	private JLabel l1;
	private JButton b1;
	private JTextField tf1;
	private JTextField tf2;

	public Quiz2() {
		init();
		setDisplay();
		showFrame();
	}

	// 컴포넌트 초기화
	private void init() {
		l1 = new JLabel("거리를 마일단위로 입력하세요.", JLabel.CENTER);
		tf1 = new JTextField(5);
		tf2 = new JTextField(30);
		
//		String getText = tf1.getText(); // tf의 텍스트 가져오기
//		String getNumber = String.valueOf(tf1); //인트값으로받기 
//		int num1 = Integer.parseInt(getNumber); //문자열값 정수로 반환받기
	}

	// 배치
	private void setDisplay() {
		JPanel pnlNorth = new JPanel();

		pnlNorth.add(l1);
		pnlNorth.add(tf1);
		add(pnlNorth, BorderLayout.NORTH);
		// North
		JButton b1 = new JButton("변환");
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(b1);
		// Center
		add(pnlCenter, BorderLayout.CENTER);
		// South
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(tf2);
		add(pnlSouth, BorderLayout.SOUTH);
	}

	private void showFrame() {
		setTitle("마일을 킬로미터로 변환");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz2();
	}
}