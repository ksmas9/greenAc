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

	// ������Ʈ �ʱ�ȭ
	private void init() {
		l1 = new JLabel("�Ÿ��� ���ϴ����� �Է��ϼ���.", JLabel.CENTER);
		tf1 = new JTextField(5);
		tf2 = new JTextField(30);
		
//		String getText = tf1.getText(); // tf�� �ؽ�Ʈ ��������
//		String getNumber = String.valueOf(tf1); //��Ʈ�����ιޱ� 
//		int num1 = Integer.parseInt(getNumber); //���ڿ��� ������ ��ȯ�ޱ�
	}

	// ��ġ
	private void setDisplay() {
		JPanel pnlNorth = new JPanel();

		pnlNorth.add(l1);
		pnlNorth.add(tf1);
		add(pnlNorth, BorderLayout.NORTH);
		// North
		JButton b1 = new JButton("��ȯ");
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
		setTitle("������ ų�ι��ͷ� ��ȯ");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz2();
	}
}