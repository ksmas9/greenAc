package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private JLabel lblCenter;
	private HashMap<String, Color> colors;
	private String currentColor;
	
	public MainFrame() {		
		colors = new HashMap<String, Color>();
		colors.put("white", Color.WHITE);
		colors.put("black", Color.BLACK);
		colors.put("green", Color.GREEN);
		colors.put("red", Color.RED);
		
		JButton btnOpen = new JButton("Open");
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnOpen);
		
		lblCenter = new JLabel();
		lblCenter.setOpaque(true);		
		changeColor("white");
		
		add(lblCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
		
		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				new MyDialog(MainFrame.this, currentColor);				
			}
		});		
		
		setTitle("MainFrame");
		setSize(400, 300);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void changeColor(String kind) {
		lblCenter.setBackground(colors.get(kind));
		currentColor = kind;
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}







