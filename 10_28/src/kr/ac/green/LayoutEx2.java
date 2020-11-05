package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * JPanel -> 배치를 목적으로 존재하는 Container
 * 패널이 패널을 가질수 있음.그럼또 그안에 버튼이 들어가겠구요.
 */
public class LayoutEx2 extends JFrame {
	public LayoutEx2() {
		
		JButton btn1 = new JButton("A");
		JButton btn2 = new JButton("B");
		JButton btn3 = new JButton("C");
		
		// JPanel : default FlowLayout
		JPanel pnlCenter = new JPanel(); //패널만들엇고
		pnlCenter.add(btn1);
		pnlCenter.add(btn2);
		pnlCenter.add(btn3); //버튼을 패널에 집어넣었꼬
		
		add(pnlCenter, BorderLayout.CENTER); //패널을 제이프레임에 넣었고
		JPanel pnlWest = new JPanel();	//패널 왼쪽꺼 만들엇고
		pnlWest.setLayout(new GridLayout(0, 1)); //그리드 레이아웃 만들엇고
		pnlWest.add(new JButton("A")); //버튼 세개 패널에 집어넣고
		pnlWest.add(new JButton("B"));
		pnlWest.add(new JButton("chokey.jpag"));
		 
		add(pnlWest, BorderLayout.WEST); //패널을 붙이고
		
		JButton btn4 = new JButton("상단");
		add(btn4, BorderLayout.NORTH);
		
		
		//이하는 보더레이아웃 정의
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

