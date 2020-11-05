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
	LineBorder border = new LineBorder(Color.GRAY); //보더 만들기
		
	public Quiz2(){
		init();
		setDisplay();
		showFrame();
	}
	
	public void init(){
		btncheck = new JButton("중복검사");
		btnjoin = new JButton("가입");
		btncancel = new JButton("취소");
		
		lblId = new JLabel("아이디");
		lblName = new JLabel("이름");
		lblPw = new JLabel("비밀번호");
		lblPwRe = new JLabel("재입력");
		lblSex = new JLabel("성별");
		lblIntro = new JLabel("자기소개");
		
		rbtnM = new JRadioButton("남자");
		rbtnW = new JRadioButton("여자");
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
		
//      그리드 3열짜리를 만들어 0,3
//		한번넣고 아이디 이름 비밀번호 순서대로 넣는 패널,
//		텍스트 필드, 래디오 버튼 영역
//		중복검사 체크박스 영역
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
		
		setTitle("회원가입");
		setSize(400,500);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Quiz2();
	}
	
}
