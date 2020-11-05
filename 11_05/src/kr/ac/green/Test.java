package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
	public Test() {
		JPanel pnlCenter = new JPanel(new GridLayout(0, 1));
		pnlCenter.add(new MyPanel("test1", MyPanel.TEXT));
		pnlCenter.add(new MyPanel("test2", MyPanel.PASSWORD));
		pnlCenter.add(new MyPanel("test3", MyPanel.PASSWORD));
		pnlCenter.add(new MyPanel("test4", MyPanel.TEXT));
		
		add(pnlCenter, BorderLayout.CENTER);
		
		setTitle("MyPanel Test");
		pack();
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test();
	}
}
