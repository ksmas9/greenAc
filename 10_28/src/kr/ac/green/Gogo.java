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
		lblSex = new JLabel("����", JLabel.LEFT);
		lblHobby = new JLabel("���", JLabel.LEFT);
		lblIntroduce = new JLabel("�ڱ�Ұ�", JLabel.LEFT);
		tfId = new JTextField(5);
		pfPasswd = new JPasswordField(8);
		pfPasswdCheck = new JPasswordField(8);
		taIntroduce = new JTextArea(15, 15);
		rbMale = new JRadioButton("����");
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
		btnOk = new JButton("Ȯ��");
		btnCancel = new JButton("���");
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
