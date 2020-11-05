package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Quiz2 extends JFrame{

	private JButton btncheck;
	private JButton btnjoin;
	private JButton btncancel;
	
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblPw;
	private JLabel lblPwRe;
	private JLabel lblSex;
	private JLabel lblIntro;
	
	private JRadioButton rbtnM;
	private JRadioButton rbtnW;
	
	private JTextField tfId;
	private JTextField tfName;
	private JTextField tfPw;
	private JTextField tfPwRe;
	
	private JTextArea taIntro;
	LineBorder border = new LineBorder(Color.GRAY); //���� �����
		
	public Quiz2(){
		init();
		setDisplay();
		showFrame();
	}
	
	public void init(){
		btncheck = new JButton("�ߺ��˻�");
		btnjoin = new JButton("����");
		btncancel = new JButton("���");
		
		lblId = new JLabel("���̵�");
		lblName = new JLabel("�̸�");
		lblPw = new JLabel("��й�ȣ");
		lblPwRe = new JLabel("���Է�");
		lblSex = new JLabel("����");
		lblIntro = new JLabel("�ڱ�Ұ�");
		
		rbtnM = new JRadioButton("����");
		rbtnW = new JRadioButton("����");
		ButtonGroup bg = new ButtonGroup(); 
		bg.add(rbtnM);
		bg.add(rbtnW);
		
		tfId = new JTextField(15);
		tfName = new JTextField(15);
		tfPw = new JTextField(15);
		tfPwRe = new JTextField(15);
		taIntro = new JTextArea(5,30);

		
	}
	public void setDisplay(){
		
//North	
		
//      �׸��� 3��¥���� ����� 0,3
//		�ѹ��ְ� ���̵� �̸� ��й�ȣ ������� �ִ� �г�,
//		�ؽ�Ʈ �ʵ�, ����� ��ư ����
//		�ߺ��˻� üũ�ڽ� ����
//North
		JPanel pnlNorth = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JPanel pnlNorthLine1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pnlNorthLine1.add(lblId);
		pnlNorthLine1.add(tfId);
		pnlNorthLine1.add(btncheck);
		pnlNorth.add(pnlNorthLine1);
		
		
		JPanel pnlNorthLine2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pnlNorthLine2.add(lblName);
		pnlNorthLine2.add(tfName);
		pnlNorth.add(pnlNorthLine2);
		
		JPanel pnlNorthLine3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel pnlNorthLine4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel pnlNorthLine5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel pnlNorthLine6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		
		
//Center
		JPanel pnlCenter = new JPanel(new FlowLayout(FlowLayout.CENTER));
		taIntro.setBorder(border);
		pnlCenter.add(taIntro);
	
		
//South
		JPanel pnlSouth1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel pnlSouth = new JPanel(new GridLayout(0,2));
		pnlSouth.add(btnjoin);
		pnlSouth.add(btncancel);
		pnlSouth1.add(pnlSouth);
		
		
// Border add
		add(pnlNorth, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth1, BorderLayout.SOUTH);
		
		
	}
	public void showFrame(){
		
		setTitle("ȸ������");
		setSize(400,500);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Quiz2();
	}
	
}
