package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

public class LoginForm extends JFrame implements ActionListener {
	private JTextComponent tfId; //대부분의 경우 상위개념의 타입을 사용하는게 유리
	private JTextComponent pfPw;
	
	private JButton btnLogin;
	private JButton btnJoin;
	
	private Vector<User> list; //유저관리는 벡터
	//배열로 못하는이유는 추가삭제가 어렵기때문

	public LoginForm() {
		init();
		setDisplay();
		addListener();
		showFrame();
	}

	private void init() {	
		list = new Vector<User>();
		tfId = LoginUtils.getTextComponent(LoginUtils.TEXT);
		pfPw = LoginUtils.getTextComponent(LoginUtils.PASSWORD);;		
		btnJoin = LoginUtils.getButton("Join");		
		btnLogin = LoginUtils.getButton("Login");
	}

	private void setDisplay() {		
		JPanel pnlText = new JPanel(new GridLayout(0,1));
		JPanel pnlInput = new JPanel(new GridLayout(0,1));
				
		pnlText.add(LoginUtils.getLabel("ID"));
		pnlText.add(LoginUtils.getLabel("Password"));
		
		JPanel pnlId = new JPanel();
		pnlId.add(tfId);
		JPanel pnlPw = new JPanel();
		pnlPw.add(pfPw);
		pnlInput.add(pnlId);
		pnlInput.add(pnlPw);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnLogin);
		pnlSouth.add(btnJoin);
				
		JPanel pnlMain = new JPanel(new BorderLayout());
		pnlMain.add(pnlText, BorderLayout.WEST);
		pnlMain.add(pnlInput, BorderLayout.CENTER);
		pnlMain.add(pnlSouth, BorderLayout.SOUTH);
		
		pnlMain.setBorder(new EmptyBorder(5, 10, 5, 10));
		
		add(pnlMain, BorderLayout.CENTER);
	}

	private void addListener() {
		btnLogin.addActionListener(this);
		btnJoin.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent we) {
				int result = JOptionPane.showConfirmDialog(
					LoginForm.this,
					"exit?",
					"question",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE
				);
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}

	private void showFrame() {
		setTitle("Login");
		pack();
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();		
		if(src == btnLogin) {
			JTextComponent input = null;
			String msg = "welcome!!";
			User user = null;
			if(LoginUtils.isEmpty(tfId)) {
				msg = "input your ID";
				input = tfId;
			} else {
				if(LoginUtils.isEmpty(pfPw)) {
					msg = "input your password";
					input = pfPw;
				} else {
					String uid = tfId.getText();
					String upw = pfPw.getText();
					user = findUser(uid);
					if( user == null ){
						msg = "check your ID";
						input = tfId;
					} else {
						if(!upw.equals(user.getUpw())) { 
							msg = "check your password";
							input = pfPw;
						}
					}
				}
			}
			JOptionPane.showMessageDialog(
				this,
				msg,
				"Information",
				JOptionPane.INFORMATION_MESSAGE	
			);
			if(input != null) {
				input.requestFocus();
			} else {
				clear();
				setVisible(false);
				new InformationForm(this, user);				
			}
		} else {			
			clear();
			setVisible(false);			
			new JoinForm(this);			
		}
	}

	private void clear() { //입력되있는거 빈문자열로 셋팅
		tfId.setText("");
		pfPw.setText("");
	}
	
	public User findUser(String userId) { //유저찾기
		int idx = list.indexOf(new User(userId));
		if(idx>=0) {
			return list.get(idx);
		} else {
			return null; //아이디가 없을때,
		}		
	}

	public void addUser(User user) { //유저 추가하기
		if(findUser(user.getUid()) == null) { //유저가 없을때만
			list.add(user);
		}
	}

	public void removeUser(User user) {// 회원탈퇴
		list.remove(user);
	}
	public static void main(String[] args) {
		new LoginForm();
	}
}