package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//��ư�ȿ� ������ �ֱ�

public class Button extends JFrame{
	public Button(){
				
		JButton btn = new JButton(); //��ư ��ü����
		
		Font f1 = new Font("F1",Font.BOLD,30); //��Ʈ ��ü����
		btn.setForeground(Color.PINK); //��Ʈ����
		btn.setFont(f1);	 //��Ʈ ����
		
		btn.setText("Chokey"); //��ư�� ���� �����
		
		ImageIcon icon = new ImageIcon("ch1.jpg"); //�̹��� ��ü �����
		btn.setIcon(icon); //�����ܿ� �̹��� ��ü �ֱ�
		
		btn.setRolloverIcon(new ImageIcon("ch2.jpg")); // Ŀ�� ���ٴ�� ���û���
		btn.setPressedIcon(new ImageIcon("ch3.jpg"));// Ŭ���߿� ���û���
		
		btn.setHorizontalTextPosition(JButton.CENTER); //������ ���� ��ġ
		btn.setVerticalTextPosition(JButton.BOTTOM);  //Ⱦ���� ������ġ
		add(btn, BorderLayout.CENTER);
		
		setTitle("CCCCCCCCCCHHHHHHHHHHHHOOOOOOOOOOOKKKKKKKKKKKEEEEEEEEEEEYYYYYYYYYYY");    
		setSize(200,300);
		pack();
		setLocation(1000,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Button();
		
	}
}

