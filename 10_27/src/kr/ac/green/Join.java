package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Join extends JDialog{
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel lblRe;
	private JLabel lblName;
	private JLabel lblNickName;
	private JLabel lblInfo;
	private UserData userData;
	
	private JTextField tfId;
	private JTextField tfPw;
	private JTextField tfRe;
	private JTextField tfName;
	private JTextField tfNickname;
	
	private JButton btnJoin;
	private JButton btnCancel;
	
	private JRadioButton rbtnM;
	private JRadioButton rbtnW;
	private ButtonGroup bg;
	private LineBorder border;
	private TitledBorder titledBorder;
	
	
	
	public Join(Login owner, UserData userData){
		super(owner, "Join", true);
		init();
		setDisplay();
		showFrame();
	}
	public void init(){
		 lblId = new JLabel("ID");
		 lblId.setPreferredSize(new Dimension(58,18));
		 lblPw = new JLabel("Pw");
		 lblPw.setPreferredSize(new Dimension(58,18));
		 lblRe = new JLabel("Retry");
		 lblRe.setPreferredSize(new Dimension(58,18));
		 lblName = new JLabel("Name");
		 lblName.setPreferredSize(new Dimension(58,18));
		 lblNickName = new JLabel("NickName");
		 lblNickName.setPreferredSize(new Dimension(58,18));
		 lblInfo = new JLabel("Input your information");
		
		 tfId = new JTextField(10);
		 tfPw = new JTextField(10);
		 tfRe = new JTextField(10);
		 tfName = new JTextField(10);
		 tfNickname = new JTextField(10);
		 
		 btnJoin = new JButton("Join");
		 btnCancel = new JButton("Cancel");
		
		 rbtnM = new JRadioButton("Male");
		 rbtnW = new JRadioButton("Female");
		 bg = new ButtonGroup();
		 bg.add(rbtnM);
		 bg.add(rbtnW);
		 titledBorder = new TitledBorder(border,"Gender");
		 border = new LineBorder(Color.BLUE,1);
	}
	public void setDisplay(){
		JPanel pnlMain = new JPanel(new BorderLayout());
		Insets insets = new Insets(0, 20, 0, 20);
		pnlMain.setBorder(new EmptyBorder(insets));
		JPanel pnlNorth = new JPanel(new GridLayout(0,1));		
		JPanel pnlId = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlId.add(lblId);
		pnlId.add(tfId);
		JPanel pnlPw = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlPw.add(lblPw);
		pnlPw.add(tfPw);
		JPanel pnlRe = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlRe.add(lblRe);
		pnlRe.add(tfRe);
		JPanel pnlName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlName.add(lblName);
		pnlName.add(tfName);
		JPanel pnlNickName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlNickName.add(lblNickName);
		pnlNickName.add(tfNickname);
		pnlNorth.add(lblInfo);
		pnlNorth.add(pnlId);
		pnlNorth.add(pnlPw);
		pnlNorth.add(pnlRe);
		pnlNorth.add(pnlName);
		pnlNorth.add(pnlNickName);
			
		JPanel pnlGender = new JPanel();
		pnlGender.setBorder(titledBorder);
		pnlGender.add(rbtnM);
		pnlGender.add(rbtnW);
		JPanel pnlBtn = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pnlBtn.add(btnJoin);
		pnlBtn.add(btnCancel);
		
		pnlMain.add(pnlNorth, BorderLayout.NORTH);
		pnlMain.add(pnlGender, BorderLayout.CENTER);
		pnlMain.add(pnlBtn, BorderLayout.SOUTH);
		add(pnlMain, BorderLayout.CENTER);		
	}
	public void showFrame(){
		setSize(230,330);
		setLocation(500,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Join");
		setVisible(true);
		setResizable(false);
	}
}
