package kr.ac.green;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MouseEventEx extends JFrame{
	
	public MouseEventEx() {
		setLayout(new GridLayout(1,0));
		JLabel lblLeft = new JLabel();
		lblLeft.setBorder(new LineBorder(Color.GRAY,1));
		lblLeft.setOpaque(true);
		lblLeft.setBackground(Color.WHITE);
		
		JLabel lblRight = new JLabel();
		lblRight.setBorder(new LineBorder(Color.GRAY,1));
		lblRight.setOpaque(true);
		lblRight.setBackground(Color.WHITE);
		lblRight.setHorizontalAlignment(JLabel.CENTER);
				
		add(lblLeft);
		add(lblRight);
		
		MouseListener listener = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				lblLeft.setBackground(Color.PINK);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getX();
				
				int kind = e.getButton();
				String btnName = "button 3"; //우클릭
				if(kind == MouseEvent.BUTTON1){
					btnName = "button 1";//좌클릭
				}else if(kind == MouseEvent.BUTTON2){
					btnName = "button 2";//휠클릭
				}
				lblLeft.setBackground(Color.RED);
				lblRight.setText(btnName + "(" + x + ","+y+")");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblLeft.setBackground(Color.WHITE);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLeft.setBackground(Color.PINK);
				lblLeft.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
				//손바닥으로 나타남
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int cnt = e.getClickCount();				
				lblRight.setText(String.valueOf(cnt));
				if(e.getButton() == MouseEvent.BUTTON1 
						&&
						e.getClickCount()==2){
					System.out.println("Double click");
				}
			}
		};
		
		lblLeft.addMouseListener(listener);
		
		
		setTitle("MouseEventEx");
		setSize(500,300);
		setLocation(100,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MouseEventEx();
	}
}
