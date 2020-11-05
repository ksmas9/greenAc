package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Information extends JFrame{
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
	public static void main(String[] args) {
		new Information();
	}
}
