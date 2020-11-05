package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//버튼안에 아이콘 넣기

public class Button extends JFrame{
	public Button(){
				
		JButton btn = new JButton(); //버튼 객체생성
		
		Font f1 = new Font("F1",Font.BOLD,30); //폰트 객체생성
		btn.setForeground(Color.PINK); //폰트색상
		btn.setFont(f1);	 //폰트 적용
		
		btn.setText("Chokey"); //버튼에 글자 만들기
		
		ImageIcon icon = new ImageIcon("ch1.jpg"); //이미지 객체 만들기
		btn.setIcon(icon); //아이콘에 이미지 객체 넣기
		
		btn.setRolloverIcon(new ImageIcon("ch2.jpg")); // 커서 갖다대면 나올사진
		btn.setPressedIcon(new ImageIcon("ch3.jpg"));// 클릭중에 나올사진
		
		btn.setHorizontalTextPosition(JButton.CENTER); //종으로 글자 위치
		btn.setVerticalTextPosition(JButton.BOTTOM);  //횡으로 글자위치
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

