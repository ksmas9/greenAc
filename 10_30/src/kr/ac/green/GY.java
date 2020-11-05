package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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

public class GY extends JFrame {

	private JLabel lblId;
	private JLabel lblPassword;
	private JLabel lblRePassword;
	private JLabel lblGender;
	private JLabel lblHobby;
	private JLabel lblSelf;
	
	private JButton btnIdCheck;
	private JButton btnCheck;
	private JButton btnCancel;
	
	private JTextField tfId;
	
	private JPasswordField pfPassword;
	private JPasswordField pfRePassword;
	
	private JTextArea taSelf;
	
	private JRadioButton rbtnGenderMan;
	private JRadioButton rbtnGenderWoman;
	
	private JCheckBox cbHobbyReading;
	private JCheckBox cbHobbyNaps;
	private JCheckBox cbHobbyTravel;
	private JCheckBox cbHobbySurfing;
	private JCheckBox cbHobbyGame;
	private JCheckBox cbHobbylate;
	
	
	
	
	public GY(){
		init();
		setDisplay();
		showFrame();
	}
	
	private void init(){
		lblId = new JLabel("ID");
		lblPassword = new JLabel("PW");
		lblRePassword = new JLabel("Re");
		lblGender = new JLabel("성별");
		lblHobby = new JLabel("취미");
		lblSelf = new JLabel("자기소개");
		
		btnIdCheck = new JButton("중복체크");
		btnCheck = new JButton("확인");
		btnCancel = new JButton("취소");
		
		tfId = new JTextField(5);
		pfPassword = new JPasswordField(15);
		pfRePassword = new JPasswordField(15);
		
		taSelf = new JTextArea(10,20);
		
		rbtnGenderMan = new JRadioButton("남자");
		rbtnGenderWoman = new JRadioButton("여자");
		
		ButtonGroup bgGender = new ButtonGroup();
		bgGender.add(rbtnGenderMan);
		bgGender.add(rbtnGenderWoman);
		
		cbHobbyReading = new JCheckBox("독서");
		cbHobbyNaps = new JCheckBox("낮잠");
		cbHobbyTravel = new JCheckBox("여행");
		cbHobbySurfing = new JCheckBox("서핑");
		cbHobbyGame = new JCheckBox("게임");
		cbHobbylate = new JCheckBox("지각");
	}
	
	private void setDisplay(){
		

		JPanel pnlLblId = new JPanel();
		pnlLblId.add(lblId);
		JPanel pnlLblPassword = new JPanel();		
		pnlLblPassword.add(lblPassword);		
		JPanel pnlLblRePassword = new JPanel();
		pnlLblRePassword.add(lblRePassword);
		

		JPanel pnlTfId = new JPanel();
		pnlTfId.add(tfId);
		JPanel pnlPfPassword = new JPanel();
		pnlPfPassword.add(pfPassword);
		JPanel pnlPfRePassword = new JPanel();
		pnlPfRePassword.add(pfRePassword);
		
		JPanel pnlBtnId = new JPanel();
		pnlBtnId.add(btnIdCheck);

		
		JPanel pnlTopWest = new JPanel(new GridLayout(0,1));
		pnlTopWest.add(pnlLblId);
		pnlTopWest.add(pnlLblPassword);
		pnlTopWest.add(pnlLblRePassword);
		
		JPanel pnlBtnTfId = new JPanel(new GridLayout(0,2));
		pnlBtnTfId.add(pnlTfId);
		pnlBtnTfId.add(pnlBtnId);
		
		JPanel pnlTopCenter = new JPanel(new GridLayout(0,1));
		pnlTopCenter.add(pnlBtnTfId);
		pnlTopCenter.add(pnlPfPassword);
		pnlTopCenter.add(pnlPfRePassword);
		
		JPanel pnlTop = new JPanel(new BorderLayout());
		pnlTop.add(pnlTopWest,BorderLayout.SOUTH);
		//pnlTop.add(pnlTopCenter,BorderLayout.CENTER);
		
		
		
		
		
		
		
		
		JPanel pnlLblGender = new JPanel();
		pnlLblGender.add(lblGender);
		
		JPanel pnlRbtnGender = new JPanel(new GridLayout(0,3));
		pnlRbtnGender.add(rbtnGenderMan);
		pnlRbtnGender.add(rbtnGenderWoman);
		
		JPanel pnlGender = new JPanel(new BorderLayout());
		pnlGender.add(pnlLblGender, BorderLayout.WEST);
		pnlGender.add(pnlRbtnGender, BorderLayout.SOUTH);
		
		JPanel pnlLblHobby = new JPanel();
		pnlLblHobby.add(lblHobby);
		
		JPanel pnlCbHobby = new JPanel(new GridLayout(2,3));
		pnlCbHobby.add(cbHobbyReading);
		pnlCbHobby.add(cbHobbyNaps);
		pnlCbHobby.add(cbHobbyTravel);
		pnlCbHobby.add(cbHobbySurfing);
		pnlCbHobby.add(cbHobbyGame);
		pnlCbHobby.add(cbHobbylate);
		
		JPanel pnlHobboy = new JPanel(new BorderLayout());
		pnlHobboy.add(pnlLblHobby, BorderLayout.WEST);
		pnlHobboy.add(pnlCbHobby, BorderLayout.SOUTH);
		
		
//		JPanel pnlTopWest = new JPanel(new GridLayout(0,1));
//		pnlTopWest.add(pnlGender);
//		pnlTopWest.add(pnlHobboy);
		
		JPanel pnlBorder = new JPanel(new BorderLayout());
		pnlBorder.add(pnlTopWest, BorderLayout.WEST);
		
		
		add(pnlTop);
		
		
		
		
	}
	private void showFrame(){
		setTitle("InformationForm");
		pack();
		setLocation(500,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new GY();
	}
}



