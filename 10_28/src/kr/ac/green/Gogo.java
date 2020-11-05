package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Gogo extends JFrame{
	private JLabel lblId;
	private JLabel lblPasswd;
	private JLabel lblPasswdCheck;
	private JLabel lblSex;
	private JLabel lblHobby;
	private JLabel lblIntroduce;
	private JTextField tfId;
	private JPasswordField pfPasswd;
	private JPasswordField pfPasswdCheck;
	private JTextArea taIntroduce;
	private JRadioButton rbMale;
	private JRadioButton rbFemale;
	private JCheckBox cbRead;
	private JCheckBox cbSleep;
	private JCheckBox cbTrip;
	private JCheckBox cbSurfing;
	private JCheckBox cbGame;
	private JCheckBox cbLate;
	private ButtonGroup bg;
	private JButton btnIdCheck;
	private JButton btnOk;
	private JButton btnCancel;
	private LineBorder lBorder;
	
	public Gogo(){
		init();
		setDisplay();
		showFrame();
	}
	
	private void init(){
		lblId = new JLabel("ID", JLabel.LEFT);
		lblPasswd = new JLabel("PW", JLabel.LEFT);
		lblPasswdCheck = new JLabel("Re", JLabel.LEFT);
		lblSex = new JLabel("성별", JLabel.LEFT);
		lblHobby = new JLabel("취미", JLabel.LEFT);
		lblIntroduce = new JLabel("자기소개", JLabel.LEFT);
		tfId = new JTextField(5);
		pfPasswd = new JPasswordField(8);
		pfPasswdCheck = new JPasswordField(8);
		taIntroduce = new JTextArea(15, 15);
		rbMale = new JRadioButton("남자");
		rbFemale = new JRadioButton("여자");
		bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		cbRead = new JCheckBox("독서");
		cbSleep = new JCheckBox("낮잠");
		cbTrip = new JCheckBox("여행");
		cbSurfing = new JCheckBox("서핑");
		cbGame = new JCheckBox("게임");
		cbLate = new JCheckBox("지각");
		btnIdCheck = new JButton("중복체크");
		btnOk = new JButton("확인");
		btnCancel = new JButton("취소");
		lBorder = new LineBorder(Color.GRAY, 1);
	}
	
	private void setDisplay(){
		JPanel pnlCenter = new JPanel(new BorderLayout());
		JPanel pnlCenterEast = new JPanel(new BorderLayout());
		pnlCenterEast.add(lblIntroduce, BorderLayout.NORTH);
		pnlCenterEast.add(taIntroduce, BorderLayout.SOUTH);
		pnlCenterEast.setBorder(new EmptyBorder(5, 5, 5 , 5));
		taIntroduce.setBorder(lBorder);
		
		
		pnlCenter.add(pnlCenterEast, BorderLayout.EAST);
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnOk);
		pnlSouth.add(btnCancel);
		
		JPanel pnlCenterWest = new JPanel(new BorderLayout());
		
		
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
//		add(pnlWest, BorderLayout.WEST);
	}
	
	private void showFrame(){
		setTitle("informationForm");
		setLocationRelativeTo(null);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Gogo();
	}
}
