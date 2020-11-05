package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class MJBGame extends JFrame{
	public static final int MOOK = 0;
	public static final int JJI = 1;
	public static final int BBA = 2;
	
	private HashMap<String, Integer> values;
	private Random r = new Random();
	
	private JButton btnStart;
	private JRadioButton[] rbtns;
	private String[] finger = {"��", "��", "��"};
	private JTextArea taResult;
	
	public MJBGame(){
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	
	public void init(){
		values = new HashMap<String, Integer>();
		
		values.put("��", MOOK);
		values.put("��", JJI);
		values.put("��", BBA);
		
		rbtns = new JRadioButton[finger.length];
		btnStart = new JButton("����");
		ButtonGroup bg = new ButtonGroup();
		for(int i = 0; i < finger.length; i++){
			rbtns[i] = new JRadioButton(finger[i]);
			bg.add(rbtns[i]);
		}
		
		taResult = new JTextArea(4, 20);
	}
	
	public void setDisplay(){
		JPanel pnlRbtn = new JPanel();
		for(JRadioButton rbtn : rbtns){
			pnlRbtn.add(rbtn);
		}
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnStart);
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(taResult);
		taResult.setBorder(new LineBorder(Color.GRAY));
		
		add(pnlRbtn, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);
		
	}
	
	public void showFrame(){
		setTitle("MJBGame");
		setLocationRelativeTo(null);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void addListeners(){
		btnStart.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				int com = r.nextInt(3);
				int mine = 0;
				
				String comResult = "��ǻ�� : ";
				String myResult = "��� : ";
				String LastResult = "";
				
				if(com == MOOK){
					comResult += "��";
				}else if(com == JJI){
					comResult += "��";
				}else{
					comResult += "��";
				}
				
				for(JRadioButton rbtn : rbtns){
					if(rbtn.isSelected()){
						mine = values.get(rbtn.getText());
						
						if(mine == MOOK){
							myResult += "��";
						}else if(mine == JJI){
							myResult += "��";
						}else{
							myResult += "��";
						}
						
					}
				}
				
				int result = com - mine;
				if(result == -1 || result == 2){
					LastResult = "����� �����ϴ�.";
				}else if(result == 0){
					LastResult = "�����ϴ�.";
				}else{
					LastResult = "����� �̰���ϴ�.";
				}
			
				taResult.setText(comResult + "\n" + myResult + "\n" + LastResult);
			}
		});
	}
	
	public static void main(String[] args) {

		new MJBGame();
	}
}
