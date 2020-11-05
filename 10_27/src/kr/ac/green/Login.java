package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Login extends JFrame implements ActionListener{
	
	private JLabel lblId;
	private JLabel lblPw;	
	private JButton btnLogin;
	private JButton btnJoin;
	private JTextField tfId;
	private JPasswordField pfPw;
		
	public Login() {
		init();
		setDisplay();
		showFrame();
		addListeners();
	}
	
	
	public void init(){
		lblId = new JLabel("ID");
		lblId.setPreferredSize(new Dimension(18, 18));
		lblPw = new JLabel("Pw");
		lblPw.setPreferredSize(new Dimension(18,18));
		btnLogin = new JButton("Login");
		btnJoin = new JButton("Join");
		tfId = new JTextField(10);
		pfPw = new JPasswordField(10);
	}
	public void setDisplay(){
		JPanel pnlMain = new JPanel();

		JPanel pnlInfo = new JPanel(new GridLayout(2,1));
	
		JPanel pnlId = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlId.add(lblId);
		pnlId.add(tfId);
		pnlInfo.add(pnlId);
		
		JPanel pnlPw = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlPw.add(lblPw);
		pnlPw.add(pfPw);
		pnlInfo.add(pnlPw);
		
		JPanel pnlBtn = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pnlBtn.add(btnLogin);
		pnlBtn.add(btnJoin);
		
		pnlMain.add(pnlInfo);
		pnlMain.add(pnlBtn);
		
		add(pnlMain, BorderLayout.CENTER);
		
	}
	public void showFrame(){
		setSize(270,150);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Login");
		setVisible(true);
		setResizable(false);
		System.out.println(lblPw.getSize());
	}
	public static void main(String[] args) {
		new Login();
	}

	public void addListeners(){
		btnLogin.addActionListener(this);
		btnJoin.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object o = ae.getSource();
		if(o == btnLogin){
			
		}else if(o == btnJoin){
			new Join();
		}
	}
	class Join extends JDialog{
		private JLabel lblId;
		private JLabel lblPw;
		private JLabel lblRe;
		private JLabel lblName;
		private JLabel lblNickName;
		private JLabel lblInfo;
		
		private JTextField tfId;
		private JPasswordField tfPw;
		private JPasswordField tfRe;
		private JTextField tfName;
		private JTextField tfNickname;
		
		private JButton btnJoin;
		private JButton btnCancel;
		
		private JRadioButton rbtnM;
		private JRadioButton rbtnW;
		private ButtonGroup bg;
		private LineBorder border;
		private TitledBorder titledBorder;
		
		
		
		public Join() {
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
			 tfPw = new JPasswordField(10);
			 tfRe = new JPasswordField(10);
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
	}	class Information extends JDialog{
		private JTextArea txtA;
		private LineBorder border;
		private TitledBorder titledBorder;
		private JButton btnLogout;
		private JButton btnWithdraw;

		public Information() {
			init();
			setDisplay();
			showFrame();
		}
		public void init(){
			btnLogout = new JButton("Logout");
			btnWithdraw = new JButton("Withdraw");
			
			txtA = new JTextArea(8,35);
			border = new LineBorder(Color.GRAY,1);
			titledBorder = new TitledBorder(border,"Check your Information");
		}
		public void setDisplay(){
			JPanel pnlMain = new JPanel();
			pnlMain.setBorder(titledBorder);
			pnlMain.add(txtA);
			pnlMain.setBackground(Color.WHITE);
			txtA.setText("");
			
			JPanel pnlSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
			pnlSouth.add(btnLogout);
			pnlSouth.add(btnWithdraw);
			
			add(pnlMain, BorderLayout.CENTER);
			add(pnlSouth, BorderLayout.SOUTH);
		}
		public void showFrame(){
			setSize(400,270);
			setLocation(500,500);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setTitle("Information");
			setVisible(true);
			setResizable(false);
		}
	}
	class DataBase{
		HashMap<String, Integer> info = new HashMap<String, Integer>();
	}
}
