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
		lblSex = new JLabel("����", JLabel.LEFT);
		lblHobby = new JLabel("���", JLabel.LEFT);
		lblIntroduce = new JLabel("�ڱ�Ұ�", JLabel.LEFT);
		tfId = new JTextField(8);
		pfPasswd = new JPasswordField(16);
		pfPasswdCheck = new JPasswordField(16);
		taIntroduce = new JTextArea(12, 24);
		rbMale = new JRadioButton("����",true);
		rbFemale = new JRadioButton("����");
		bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		cbRead = new JCheckBox("����");
		cbSleep = new JCheckBox("����");
		cbTrip = new JCheckBox("����");
		cbSurfing = new JCheckBox("����");
		cbGame = new JCheckBox("����");
		cbLate = new JCheckBox("����");
		btnIdCheck = new JButton("�ߺ�üũ");
		btnIdCheckFont = new Font("����",Font.BOLD,11);
		btnIdCheck.setPreferredSize(new Dimension(82, 25));
		btnIdCheck.setFont(btnIdCheckFont);
		btnOk = new JButton("Ȯ��");
		btnCancel = new JButton("���");
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


