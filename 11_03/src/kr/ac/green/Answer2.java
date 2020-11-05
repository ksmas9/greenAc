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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Answer2 extends JFrame {
	
	private JLabel lblInfo;
	private JTextField tfInput;
	private JButton btnCalc;
	private JTextField tfOutput;
	
	public Answer2() {
		init();
		setDisplay();
		showFrame();
		addListeners();
	}
	private void addListeners(){
		//���ٽ� JDK 1.8~
		//functional interface : �߻�޼��尡 1���ִ� �������̽�
//		btnCalc.addActionListener((e)->System.out.println("call"));
		btnCalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfOutput.setText(
						String.valueOf(
						Integer.parseInt(tfInput.getText())*1.6));
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}//JDK 1.7 final ������ ��밡��,���������� �Ұ���.
		});//JDK 1.8�̳� Ŭ�����ȿ��� ���������� �б�� ������ ���� ��ȯ�� �Ұ��ϴ�.
	}
	
	private void init() {
		lblInfo = new JLabel("�Ÿ��� ���ϴ����� �Է��Ͻÿ�.");
		tfInput = new JTextField(5);
		tfInput.setBorder(new LineBorder(Color.GRAY, 1));
		btnCalc = new JButton("��ȯ");
		tfOutput = new JTextField(15);
		tfOutput.setEditable(false);
		tfOutput.setBackground(Color.WHITE);
		tfOutput.setBorder(new LineBorder(Color.GRAY, 1));
	}

	private void setDisplay() {
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(lblInfo);
		pnlNorth.add(tfInput);
		Insets insets = new Insets(10, 20, 0, 20); // ���ΰ���
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

	private void showFrame() {
		setTitle("������ ų�ι��ͷ� ��ȯ");
		pack();
		setLocation(100, 0);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Answer2_T();
	}
}