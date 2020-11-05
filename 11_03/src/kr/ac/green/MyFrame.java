package kr.ac.green;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
	

public class MyFrame extends JFrame {
	public MyFrame() {
		
		addWindowListener(new MyWindowListener(this));
		setTitle("MyFrame");
		setSize(400, 300);
		setLocation(100, 0);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}
	public void closeFrame() {
		
		int result = JOptionPane.showConfirmDialog(
			this, 
			"종료하시겠습니까?", 
			"종료",
			//JOptionPane.YES_NO_CANCEL_OPTION, //3가지 선택
			//JOptionPane.OK_CANCEL_OPTION, //2가지 선택
			JOptionPane.YES_NO_OPTION,  //2가지 선택
			JOptionPane.QUESTION_MESSAGE
		);
		if(result == JOptionPane.YES_OPTION){
			System.exit(NORMAL);
		}if(result == JOptionPane.NO_OPTION){}
	}		
	private class MyWindowListener extends WindowAdapter { 
		//선택여지가 없이 뜯어써 어댑터쓸려고
		//MyFrame만을 위해서 만들어진 inner 클래스 
		private MyFrame f;	
		public MyWindowListener(MyFrame f){
			this.f = f;
		}
		@Override
		public void windowClosing(WindowEvent we) {
			f.closeFrame();
		}
	}
	public static void main(String[] args) {
		new MyFrame();	
	}
}






