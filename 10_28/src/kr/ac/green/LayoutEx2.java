package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * JPanel -> ��ġ�� �������� �����ϴ� Container
 * �г��� �г��� ������ ����.�׷��� �׾ȿ� ��ư�� ���ڱ���.
 */
public class LayoutEx2 extends JFrame {
	public LayoutEx2() {
		
		JButton btn1 = new JButton("A");
		JButton btn2 = new JButton("B");
		JButton btn3 = new JButton("C");
		
		// JPanel : default FlowLayout
		JPanel pnlCenter = new JPanel(); //�гθ������
		pnlCenter.add(btn1);
		pnlCenter.add(btn2);
		pnlCenter.add(btn3); //��ư�� �гο� ����־���
		
		add(pnlCenter, BorderLayout.CENTER); //�г��� ���������ӿ� �־���
		JPanel pnlWest = new JPanel();	//�г� ���ʲ� �������
		pnlWest.setLayout(new GridLayout(0, 1)); //�׸��� ���̾ƿ� �������
		pnlWest.add(new JButton("A")); //��ư ���� �гο� ����ְ�
		pnlWest.add(new JButton("B"));
		pnlWest.add(new JButton("chokey.jpag"));
		 
		add(pnlWest, BorderLayout.WEST); //�г��� ���̰�
		
		JButton btn4 = new JButton("���");
		add(btn4, BorderLayout.NORTH);
		
		
		//���ϴ� �������̾ƿ� ����
		setTitle("LayoutEx2");
		setSize(400, 100);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutEx2();
	}
}

