package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz3 extends JFrame implements IDoAction{

	private JLabel lblInfo1;
	private JLabel lblInfo2;
	private JTextField tfInput1;
	private JTextField tfInput2;
	private JTextField tfOutput;
	private JButton btnCalc;
	private JButton btnReset;


	public Quiz3() {
		init();
		setDisplay();
		showFrame();
		addListeners();
	}

	private void init() {
		lblInfo1 = new JLabel("������ �Է��Ͻÿ�.");
		lblInfo2 = new JLabel("�������� �Է��Ͻÿ�");

		tfInput1 = new JTextField(10);
		tfInput2 = new JTextField(10);
		btnCalc = new JButton("��ȯ");
		btnReset = new JButton("����");
		
		tfOutput = new JTextField(20);
	}
	private void addListeners(){
		btnCalc.addActionListener(new MyActionListener3(this));
		
	}
	@Override
	public void action() {
		try{
		int principal = Integer.parseInt(tfInput1.getText());	
		double rate = Double.parseDouble(tfInput2.getText());
		tfOutput.setText(String.format("%.2f",principal * ((rate)/100)));  //���� * ((100+(2))/100)
	}catch(NumberFormatException e){
		System.out.println("���ڸ� �Է��� �� �ֽ��ϴ�.");
		}		
	}
//	(String.format("%.2f", pie)); //��� : 3.14 �Ҽ��� �ڸ��� �����ֱ�

	
	private void setDisplay() {

		JPanel pnlNorthBig = new JPanel(new GridLayout(2, 2));
		JPanel pnlNorthMid1 = new JPanel(new GridLayout(0, 2));
		JPanel pnlNorthMid2 = new JPanel(new GridLayout(0, 2));
		JPanel pnlNorth1 = new JPanel();
		JPanel pnlNorth2 = new JPanel();
		JPanel pnlNorth3 = new JPanel();
		JPanel pnlNorth4 = new JPanel();

		// tfOutput.setBorder(new LineBorder(Color.GRAY,20)); //�׵θ� ����, �� �����ϱ�
		// setBorder(new EmptyBorder(5,10,15,20)) ���μ������Ʒ� ���� �����ֱ�

		pnlNorth1.add(lblInfo1);
		pnlNorth2.add(tfInput1);
		pnlNorth3.add(lblInfo2);
		pnlNorth4.add(tfInput2);

		pnlNorthMid1.add(pnlNorth1);
		pnlNorthMid1.add(pnlNorth2);

		pnlNorthMid2.add(pnlNorth3);
		pnlNorthMid2.add(pnlNorth4);

		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCalc);

		pnlNorthBig.add(pnlNorthMid1);
		pnlNorthBig.add(pnlNorthMid2);
		add(pnlNorthBig, BorderLayout.NORTH);

		add(pnlCenter, BorderLayout.CENTER);
	
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(tfOutput);
		add(pnlSouth, BorderLayout.SOUTH);
	}

	private void showFrame() {
		setTitle("���ڰ���");
		pack();
		setLocation(500, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz3();
	}
}