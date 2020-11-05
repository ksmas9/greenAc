package kr.ac.green;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class YourFrame extends JFrame{
	public YourFrame() {
		

		
		//내부 익명 클래스 
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we){
				System.exit(0);
				}
			}
		);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we){
				
				}
			}
		);
		
		setTitle("Your Frame");
		setSize(500,400);
		setLocation(500,0);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}
}
