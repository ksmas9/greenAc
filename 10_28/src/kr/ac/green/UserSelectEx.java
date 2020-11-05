package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class UserSelectEx extends JFrame{
	
	public UserSelectEx(){
		// 복수선택
		JCheckBox cb1 = new JCheckBox("A",true); //생성할때 선택여부, 복수개 체크가능
		cb1.setToolTipText("이거는 선택지A입니다."); //선택지아래 글씨	
		JCheckBox cb2 = new JCheckBox("B");
		JCheckBox cb3 = new JCheckBox("C");
		JCheckBox cb4 = new JCheckBox("D");		
	
//		alt+shift+t-> n : rename
		JPanel pnlWest = new JPanel(new GridLayout(0,1)); //레이아웃 매니저 생성자 가지고있음
		pnlWest.add(cb1);
		pnlWest.add(cb2);
		pnlWest.add(cb3);
		pnlWest.add(cb4);
		
		add(pnlWest, BorderLayout.NORTH);

//
//		
//		
//		
		JRadioButton rbtn1 = new JRadioButton("A");
		JRadioButton rbtn2 = new JRadioButton("B");
		JRadioButton rbtn3 = new JRadioButton("C");
		JRadioButton rbtn4 = new JRadioButton("D", true);
		
		JPanel pnlEast = new JPanel(new GridLayout(0,1)); //한개만 선택가능
		pnlEast.add(rbtn1);
		pnlEast.add(rbtn2);
		pnlEast.add(rbtn3);
		pnlEast.add(rbtn4);
		
		add(pnlEast, BorderLayout.EAST);  
		
		rbtn4.setEnabled(false); //비활성화
		ButtonGroup bg = new ButtonGroup(); //한세트로 묶어서 한개만 선택가능하게 만들기.
		bg.add(rbtn1);
		bg.add(rbtn2);
		bg.add(rbtn3);
		bg.add(rbtn4);
		
		setTitle("타이틀");
		setSize(500,200);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	
	}
	
	public static void main(String[] args) {
		new UserSelectEx();
	}
}
