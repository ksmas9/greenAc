package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

// BorderLayout
public class MyDialog extends JDialog {
	public static final int WHITE = 0;
	public static final int BLACK = 1;
	public static final int RED = 2;
	public static final int GREEN = 3;
	
	private String[] colors = {"white", "black", "red", "green"};
	private JRadioButton[] rbtns;
	public MyDialog(MainFrame owner, String currentColor) {
		// modal이 true인 경우 owner의 모든 동작은 멈춘다.
		super(owner, "MyDialog", true);
		
		rbtns = new JRadioButton[colors.length];
		ButtonGroup group = new ButtonGroup();
		
		JPanel pnlCenter = new JPanel();
		for(int i=0; i<rbtns.length; i++) {
			rbtns[i] = new JRadioButton(colors[i]);
			group.add(rbtns[i]);
			pnlCenter.add(rbtns[i]);
			if(rbtns[i].getText().equals(currentColor)) {
				rbtns[i].setSelected(true);
			}
		}
		
		JButton btnOk = new JButton("OK");
		
		pnlCenter.setBorder(new TitledBorder(
			new LineBorder(Color.GRAY, 1),
			"background color"
		));
		
		add(pnlCenter, BorderLayout.CENTER);
		add(btnOk, BorderLayout.SOUTH);
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				for(JRadioButton rbtn : rbtns) {
					if(rbtn.isSelected()) {
						owner.changeColor(rbtn.getText());
					}
				}
				dispose();
			}			
		});
		
		pack();
		setLocationRelativeTo(owner);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
