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
	//�׼��̺�Ʈ�� �������϶�, ó���ϴ¹��
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
	// eventListener, eventSource ����
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
	//�׼��̺�Ʈ�� �������϶�, ó���ϴ¹��
	@Override
	public void actionPerformed(ActionEvent ae) {
		//�� �̺�Ʈ�� �߻���Ų �ҽ��ڵ�
		Object src = ae.getSource();
			
		String strNum = lblNum.getText();	
		int num = Integer.parseInt(strNum);
		if(src == btnPlus){ //�ҽ��ڵ尡 btnPlus���
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




