package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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

public class Quiz3 extends JFrame{
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
	private Font btnIdCheckFont;
	
	public Quiz3(){
		init();
		setDisplay();
		showFrame();
	}
	
	private void init(){
		lblId = new JLabel("ID", JLabel.LEFT);
		lblId.setPreferredSize(new Dimension(20, 10));
		lblPasswd = new JLabel("PW", JLabel.LEFT);
		lblPasswd.setPreferredSize(new Dimension(20, 10));
		lblPasswdCheck = new JLabel("Re", JLabel.LEFT);
		lblPasswdCheck.setPreferredSize(new Dimension(20, 10));
		lblSex = new JLabel("성별", JLabel.LEFT);
		lblHobby = new JLabel("취미", JLabel.LEFT);
		lblIntroduce = new JLabel("자기소개", JLabel.LEFT);
		tfId = new JTextField(8);
		pfPasswd = new JPasswordField(16);
		pfPasswdCheck = new JPasswordField(16);
		taIntroduce = new JTextArea(12, 24);
		rbMale = new JRadioButton("남자",true);
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
		btnIdCheckFont = new Font("굴림",Font.BOLD,11);
		btnIdCheck.setPreferredSize(new Dimension(82, 25));
		btnIdCheck.setFont(btnIdCheckFont);
		btnOk = new JButton("확인");
		btnCancel = new JButton("취소");
		lBorder = new LineBorder(Color.GRAY, 1);
	}
	
	private void setDisplay(){
		JPanel pnlCenter = new JPanel(new BorderLayout());
		JPanel pnlCenterEast = new JPanel(new BorderLayout());
		pnlCenterEast.add(lblIntroduce, BorderLayout.NORTH);
		pnlCenterEast.add(taIntroduce, BorderLayout.SOUTH);
		pnlCenterEast.setBorder(new EmptyBorder(5, 5, 5, 5));
		taIntroduce.setBorder(lBorder);
		
		
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnOk);
		pnlSouth.add(btnCancel);
		
		JPanel pnlCenterWest = new JPanel(new GridLayout(0,1));
		JPanel pnlId = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlId.add(lblId);
		pnlId.add(tfId);
		pnlId.add(btnIdCheck);
		
		JPanel pnlPw = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlPw.add(lblPasswd);
		pnlPw.add(pfPasswd);
		
		JPanel pnlPwCheck = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlPwCheck.add(lblPasswdCheck);
		pnlPwCheck.add(pfPasswdCheck);
		
		JPanel pnlSex = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlSex.add(lblSex);
		
		JPanel pnlSexSelect = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlSexSelect.add(rbMale);
		pnlSexSelect.add(rbFemale);
		
		JPanel pnlHobby = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlHobby.add(lblHobby);
		
		JPanel pnlHobbyGroup1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlHobbyGroup1.add(cbRead);
		pnlHobbyGroup1.add(cbSleep);
		pnlHobbyGroup1.add(cbTrip);
		
		JPanel pnlHobbyGroup2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlHobbyGroup2.add(cbSurfing);
		pnlHobbyGroup2.add(cbGame);
		pnlHobbyGroup2.add(cbLate);
		
		pnlCenterWest.add(pnlId);
		pnlCenterWest.add(pnlPw);
		pnlCenterWest.add(pnlPwCheck);
		pnlCenterWest.add(pnlSex);
		pnlCenterWest.add(pnlSexSelect);
		pnlCenterWest.add(pnlHobby);
		pnlCenterWest.add(pnlHobbyGroup1);
		pnlCenterWest.add(pnlHobbyGroup2);
		
		pnlCenter.add(pnlCenterWest, BorderLayout.WEST);
		pnlCenter.add(pnlCenterEast, BorderLayout.EAST);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
	}
	
	private void showFrame(){
		setTitle("informationForm");
		setLocationRelativeTo(null);
		setSize(510, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		System.out.println(btnIdCheck.getSize());
	}
	
	public static void main(String[] args) {
		new Quiz3();
	}
}


