package kr.ac.green;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MySelf extends JFrame{
	
	public MySelf(){
				
		JPanel pnlNorth = new JPanel(); // �ǳ� ��ü ����
		pnlNorth.add(new JLabel("����� �Է�")); // ������Է� ���̺�
		
		JTextField tf = new JTextField(20); //�ؽ�Ʈ�ڽ� ��ü����
		tf.setText("�ȳ��ϼ���"); //�ؽ�Ʈ�ڽ��� ������
		pnlNorth.add(tf);  //�ؽ�Ʈ �ڽ� ����
		
		JButton b1 = new JButton("�Է¹�ư");//��ư��ü����
		pnlNorth.add(b1); //��ư �����ϱ�
		
		add(pnlNorth, BorderLayout.NORTH); //��ܿ� pnlNorth����
		
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
