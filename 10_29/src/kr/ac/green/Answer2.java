package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Answer2 extends JFrame {

	private JLabel lblInfo;
	private JTextField tfInput;
	private JTextField tfOutput;
	private JButton btnCalc;

	public Answer2() {
		init();
		setDisplay();
		showFrame();
	}

	private void init() {
		lblInfo = new JLabel("거리를 마일 단위로 입력하시오.");
		tfInput = new JTextField(10);
		btnCalc = new JButton("변환");
		tfOutput = new JTextField(15);
		tfOutput.setEditable(false);
		tfOutput.setBackground(Color.WHITE);
		tfOutput.setBorder(new LineBorder(Color.GRAY,1)); //테두리 굵기, 색 설정하기
//		setBorder(new EmptyBorder(5,10,15,20)) 가로세로위아래 넓이 여백주기
		
	}

	private void setDisplay() {
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(lblInfo);
		pnlNorth.add(tfInput);
		pnlNorth.setBorder(new EmptyBorder(10,10,0,10)); //가로세로위아래 여백주기

		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCalc);

		JPanel pnlSouth = new JPanel();
		pnlSouth.add(tfOutput);
		Insets insets = new Insets(10,20,0,20);
		pnlSouth.setBorder(new EmptyBorder(insets));
		
		add(pnlNorth, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
	}

	private void showFrame() {
		setTitle("마일을 킬로미터로 변환");
		pack();
		setLocation(500, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Answer2();
	}
}