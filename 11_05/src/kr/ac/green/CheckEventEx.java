package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CheckEventEx extends JFrame{
	public CheckEventEx() {
		JRadioButton rbtnWhite = new MyRadioButton("White", Color.WHITE);
		JRadioButton rbtnRed = new MyRadioButton("Red", Color.RED);
		JRadioButton rbtnBlack = new MyRadioButton("Black", Color.BLACK);

		ButtonGroup group = new ButtonGroup();
		group.add(rbtnWhite);
		group.add(rbtnRed);
		group.add(rbtnBlack);
				
		JLabel lblMain = new JLabel();
		lblMain.setOpaque(true);
		lblMain.setBackground(Color.WHITE);
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(rbtnWhite);
		pnlNorth.add(rbtnRed);
		pnlNorth.add(rbtnBlack);
		pnlNorth.setBackground(Color.WHITE);
		
		add(pnlNorth, BorderLayout.NORTH);
		add(lblMain, BorderLayout.CENTER);
		
//		ActionListener listener = new ActionListener() {			
//			@Override
//			public void actionPerformed(ActionEvent ae) {
//				JRadioButton btn = (JRadioButton)ae.getSource(); 
				//라디오버튼으로 ae를 형변환해서 소스 받아오기
//				System.out.println(btn.getText());
//			}
//		};
//		rbtnWhite.addActionListener(listener);
//		rbtnRed.addActionListener(listener);
//		rbtnBlack.addActionListener(listener);
		
		ItemListener listener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if(state == ItemEvent.SELECTED){ //선택할때, DESELECTED 선택 해제될때,
//					JRadioButton rbtn = (JRadioButton)e.getSource();
//					String strColor = rbtn.getText();
					MyRadioButton rbtn = (MyRadioButton)e.getSource();
					
					lblMain.setBackground(rbtn.getColor());		
					rbtnWhite.setBackground(rbtn.getColor());
					rbtnBlack.setBackground(rbtn.getColor());
					rbtnRed.setBackground(rbtn.getColor());
					pnlNorth.setBackground(rbtn.getColor());
//					Color background = Color.WHITE;
//					if(strColor.equals("Red")){
//						background = Color.RED;
//					}else if(strColor.equals("Black")){
//						background = Color.BLACK;
//					}
//					lblMain.setBackground(background);
//					System.out.println(((JRadioButton)e.getSource()).getText());
				}else{
					
				}
//				System.out.println(((JRadioButton)e.getSource()).getText()
//				);빨간색에서 체크해제, 흰색으로 가니까 2개씩
			}
		};
		rbtnWhite.addItemListener(listener);
		rbtnRed.addItemListener(listener);
		rbtnBlack.addItemListener(listener);
		
		setTitle("CheckEventEx");
		setSize(400,300);
		setLocation(100,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckEventEx();
	}
}
