package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Answer2 extends JFrame implements IDoAction {
	
	private JLabel lblInfo;
	private JTextField tfInput;
	private JButton btnCalc;
	private JTextField tfOutput;
	
	public Answer2() {
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	
	private void init() {
		lblInfo = new JLabel("거리를 마일단위로 입력하시오.");
		tfInput = new JTextField(5);
		tfInput.setBorder(new LineBorder(Color.GRAY, 1));
		btnCalc = new JButton("변환");
		tfOutput = new JTextField(15);
		tfOutput.setEditable(false);
		tfOutput.setBackground(Color.WHITE);
		tfOutput.setBorder(new LineBorder(Color.GRAY, 1));
	}

	private void setDisplay() {
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(lblInfo);
		pnlNorth.add(tfInput);
		Insets insets = new Insets(10, 20, 0, 20); // 내부간격
		pnlNorth.setBorder(new EmptyBorder(insets));
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCalc);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(tfOutput);
		pnlSouth.setBorder(new EmptyBorder(0, 0, 10, 0));
		
		add(pnlNorth, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
	}
	
	private void addListeners() {
		ActionListener listener = new MyActionListener3(this);
		btnCalc.addActionListener(listener);
		// JTextField에서 enter입력도 ActionEvent다.
		tfInput.addActionListener(listener);
	}
	
	private void showFrame() {
		setTitle("마일을 킬로미터로 변환");
		pack();
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void action() {
		String msg = "";
		try {
			int mile = Integer.parseInt(tfInput.getText());
			double km = mile * 1.6;
			msg = String.valueOf(km) + "km";
		} catch(NumberFormatException e) {
			msg = "숫자만 입력가능합니다.";
			
			JOptionPane.showMessageDialog(
				this, 					// 부모창
				"숫자만 입력해라~", 	// 메세지
				"경고",					// 타이틀
				// 아이콘
				JOptionPane.PLAIN_MESSAGE
				//JOptionPane.INFORMATION_MESSAGE
				//JOptionPane.QUESTION_MESSAGE
				//JOptionPane.ERROR_MESSAGE
				//JOptionPane.WARNING_MESSAGE
			);
		}
		tfOutput.setText(msg);
		// 포커스 요청 커서이동
		tfInput.requestFocus(); 
		// 전체 선택
		tfInput.selectAll();
	}

	public static void main(String[] args) {
		new Answer2();
	}
}






