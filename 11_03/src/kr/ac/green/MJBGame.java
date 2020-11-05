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
	private String[] finger = {"¹¬", "Âî", "ºü"};
	private JTextArea taResult;
	
	public MJBGame(){
		init();
		setDisplay();
		addListeners();
		showFrame();
	}
	
	public void init(){
		values = new HashMap<String, Integer>();
		
		values.put("¹¬", MOOK);
		values.put("Âî", JJI);
		values.put("ºü", BBA);
		
		rbtns = new JRadioButton[finger.length];
		btnStart = new JButton("½ÃÀÛ");
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
				
				String comResult = "ÄÄÇ»ÅÍ : ";
				String myResult = "´ç½Å : ";
				String LastResult = "";
				
				if(com == MOOK){
					comResult += "¹¬";
				}else if(com == JJI){
					comResult += "Âî";
				}else{
					comResult += "ºü";
				}
				
				for(JRadioButton rbtn : rbtns){
					if(rbtn.isSelected()){
						mine = values.get(rbtn.getText());
						
						if(mine == MOOK){
							myResult += "¹¬";
						}else if(mine == JJI){
							myResult += "Âî";
						}else{
							myResult += "ºü";
						}
						
					}
				}
				
				int result = com - mine;
				if(result == -1 || result == 2){
					LastResult = "´ç½ÅÀÌ Á³½À´Ï´Ù.";
				}else if(result == 0){
					LastResult = "ºñ°å½À´Ï´Ù.";
				}else{
					LastResult = "´ç½ÅÀÌ ÀÌ°å½À´Ï´Ù.";
				}
			
				taResult.setText(comResult + "\n" + myResult + "\n" + LastResult);
			}
		});
	}
	
	public static void main(String[] args) {

		new MJBGame();
	}
}
