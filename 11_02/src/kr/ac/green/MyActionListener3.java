package kr.ac.green;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// alt + shift + t -> n : rename
public class MyActionListener3 implements ActionListener { //리스너 클래스를 구현하는 클래스
	private IDoAction ui;
	
	public MyActionListener3(IDoAction ui) {
		this.ui = ui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {  //따라서 오버라이드한 메서드가 튀어나온다.
		ui.action(); 
	}	
}
