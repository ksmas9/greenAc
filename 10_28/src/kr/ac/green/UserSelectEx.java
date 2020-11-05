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
		// ��������
		JCheckBox cb1 = new JCheckBox("A",true); //�����Ҷ� ���ÿ���, ������ üũ����
		cb1.setToolTipText("�̰Ŵ� ������A�Դϴ�."); //�������Ʒ� �۾�	
		JCheckBox cb2 = new JCheckBox("B");
		JCheckBox cb3 = new JCheckBox("C");
		JCheckBox cb4 = new JCheckBox("D");		
	
//		alt+shift+t-> n : rename
		JPanel pnlWest = new JPanel(new GridLayout(0,1)); //���̾ƿ� �Ŵ��� ������ ����������
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
		
		JPanel pnlEast = new JPanel(new GridLayout(0,1)); //�Ѱ��� ���ð���
		pnlEast.add(rbtn1);
		pnlEast.add(rbtn2);
		pnlEast.add(rbtn3);
		pnlEast.add(rbtn4);
		
		add(pnlEast, BorderLayout.EAST);  
		
		rbtn4.setEnabled(false); //��Ȱ��ȭ
		ButtonGroup bg = new ButtonGroup(); //�Ѽ�Ʈ�� ��� �Ѱ��� ���ð����ϰ� �����.
		bg.add(rbtn1);
		bg.add(rbtn2);
		bg.add(rbtn3);
		bg.add(rbtn4);
		
		setTitle("Ÿ��Ʋ");
		setSize(500,200);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	
	}
	
	public static void main(String[] args) {
		new UserSelectEx();
	}
}
