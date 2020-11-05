package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Answer2_T extends JFrame {
	
	private JLabel lblInfo;
	private JTextField tfInput;
	private JButton btnCalc;
	private JTextField tfOutput;
	
	public Answer2_T() {
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
		// 람다식(JDK1.8~)
		// functional interface : 추상메서드가 1개있는 인터페이스
		ActionListener listener = (e)->System.out.println("call");
		btnCalc.addActionListener(listener);
		/*
		btnCalc.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				tfOutput.setText(
					String.valueOf(
						Integer.parseInt(tfInput.getText()) * 1.6
					)
				);
			}
		});
		*/
		final int num = 5;
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent we) {
				// JDK1.7 : final만 사용가능, 지역변수 사용 불가능
				// JDK1.8 : 지역변수의 읽기는 가능, 수정은 불가능				
				//System.out.println(num); //showInputDialog
				int result = JOptionPane.showConfirmDialog(
					// this는 WindowAdapter가 된다.
					// Answer2.this 는 this가 Answer2 객체를 나타낸다는 의미	
					Answer2_T.this, 
					"종료하시겠습니까?", 
					"종료",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE
				);
				if(result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
	
	private void showFrame() {
		setTitle("마일을 킬로미터로 변환");
		pack();
		setLocation(100, 0);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Answer2();
	}
}
