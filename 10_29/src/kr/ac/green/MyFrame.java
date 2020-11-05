package kr.ac.green;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame {

	public MyFrame() {
		// setLayout(new GridLayout(0,1));
		Font f1 = new Font("�ü�", Font.BOLD, 15);

		JLabel l1 = new JLabel("�ڹ����ڿ� ���Ű��� ȯ���մϴ�. ���ڸ� ������.");
		l1.setFont(f1);
		l1.setVerticalTextPosition(l1.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);

		JPanel p1 = new JPanel(new GridLayout(1, 3));
		JButton b1 = new JButton("�޺�����");
		JButton b2 = new JButton("������������");
		JButton b3 = new JButton("�Ұ������");

		p1.add(b1);
		p1.add(b2);
		p1.add(b3);

		ButtonGroup bg = new ButtonGroup();
		JRadioButton rbtn1 = new JRadioButton("A");
		JRadioButton rbtn2 = new JRadioButton("B");
		JRadioButton rbtn3 = new JRadioButton("C");
		JRadioButton rbtn4 = new JRadioButton("D");

		bg.add(rbtn1);
		bg.add(rbtn2);
		bg.add(rbtn3);
		bg.add(rbtn4);

		add(p1, BorderLayout.SOUTH);
		add(l1, BorderLayout.NORTH);

		pack();
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
