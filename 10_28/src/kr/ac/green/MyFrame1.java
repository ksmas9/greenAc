package kr.ac.green;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame1 extends JFrame {
	public MyFrame1() {

		JButton btn = new JButton("�̰� ��ư"); // ��ư ��ü ����
		add(btn); // ��ư
		
		JButton btn2 = new JButton("��ư2");
		add(btn2); // ��ư
		setTitle("MyFrame"); // Ÿ��Ʋ�̸�
		setSize(400, 300); // ũ��
		setLocation(300, 100); // ��ġ
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ���°�
		setVisible(true); // ���̰�
	}

	public static void main(String[] args) {

		new MyFrame1();

	}
}

// ������Ʈ �������
// �����̳� �ٸ� ������Ʈ���� ���� ��ų���ִ� ������Ʈ ex) JFrame base container