package kr.ac.green;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// alt + shift + t -> n : rename
public class MyActionListener3 implements ActionListener { //������ Ŭ������ �����ϴ� Ŭ����
	private IDoAction ui;
	
	public MyActionListener3(IDoAction ui) {
		this.ui = ui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {  //���� �������̵��� �޼��尡 Ƣ��´�.
		ui.action(); 
	}	
}
