package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Quiz3 extends JFrame {

	private JLabel lblInfo1;
	private JLabel lblInfo2;
	private JTextField tfInput1;
	private JTextField tfInput2;
	private JTextField tfOutput;
	private JButton btnCalc;

	public Quiz3() {
		init();
		setDisplay();
		showFrame();
	}

	private void init() {
		lblInfo1 = new JLabel("원금을 입력하시오");
		lblInfo2 = new JLabel("이자율을 입력하시오");

		tfInput1 = new JTextField(5);
		tfInput2 = new JTextField(5);
		btnCalc = new JButton("변환");
		tfOutput = new JTextField(15);
	}

	private void setDisplay() {

		JPanel pnlNorthBig = new JPanel(new GridLayout(2, 2));
		JPanel pnlNorthMid1 = new JPanel(new GridLayout(0, 2));
		JPanel pnlNorthMid2 = new JPanel(new GridLayout(0, 2));
		JPanel pnlNorth1 = new JPanel();
		JPanel pnlNorth2 = new JPanel();
		JPanel pnlNorth3 = new JPanel();
		JPanel pnlNorth4 = new JPanel();

		// tfOutput.setBorder(new LineBorder(Color.GRAY,20)); //테두리 굵기, 색 설정하기
		// setBorder(new EmptyBorder(5,10,15,20)) 가로세로위아래 넓이 여백주기

		pnlNorth1.add(lblInfo1);
		pnlNorth2.add(tfInput1);
		pnlNorth3.add(lblInfo2);
		pnlNorth4.add(tfInput2);

		pnlNorthMid1.add(pnlNorth1);
		pnlNorthMid1.add(pnlNorth2);

		pnlNorthMid2.add(pnlNorth3);
		pnlNorthMid2.add(pnlNorth4);

		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCalc);

		pnlNorthBig.add(pnlNorthMid1);
		pnlNorthBig.add(pnlNorthMid2);
		add(pnlNorthBig, BorderLayout.NORTH);

		add(pnlCenter, BorderLayout.CENTER);
	
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(tfOutput);
		add(pnlSouth, BorderLayout.SOUTH);
	}

	private void showFrame() {
		setTitle("이자계산기");
		pack();
		setLocation(500, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz3();
	}
}