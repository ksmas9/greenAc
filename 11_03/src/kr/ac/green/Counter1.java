package kr.ac.green;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Counter1 extends JFrame implements ActionListener {
	private JLabel lblNum;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnReset;
	
	public Counter1() {
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	
	private void init() {
		lblNum = new JLabel("0", JLabel.CENTER);
		lblNum.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
		
		btnPlus = new JButton("Plus");
		btnMinus = new JButton("Minus");
		btnReset = new JButton("Reset");
		
	}
	//액션이벤트가 복수개일때, 처리하는방법
	private void setDisplay() {
		JPanel pnlSouth = new JPanel(new GridLayout(1, 2));
		JPanel pnlNorth = new JPanel(new GridLayout(1, 0));
		
		pnlNorth.add(btnReset);
		
		pnlSouth.add(btnPlus);
		pnlSouth.add(btnMinus);
		
		add(pnlNorth, BorderLayout.NORTH);
		add(lblNum, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
	}
	// eventListener, eventSource 연결
	private void addListeners() {
		btnPlus.addActionListener( this );
		btnMinus.addActionListener( this );		
		btnReset.addActionListener( this );		
	}
	
	private void showFrame() {		
		setTitle("counter1");
		setSize(300, 400);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	//액션이벤트가 복수개일때, 처리하는방법
	@Override
	public void actionPerformed(ActionEvent ae) {
		//이 이벤트를 발생시킨 소스코드
		Object src = ae.getSource();
			
		String strNum = lblNum.getText();	
		int num = Integer.parseInt(strNum);
		if(src == btnPlus){ //소스코드가 btnPlus라면
			num++;		
		}else if(src == btnReset){
			num = 0;
		}
		else {
			num--;	
		}
		strNum = String.valueOf(num);
		lblNum.setText(strNum);
	}
	
	public static void main(String[] args) {
		new Counter1();
	}
}




