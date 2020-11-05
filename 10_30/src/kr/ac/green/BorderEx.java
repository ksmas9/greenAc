package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.AbstractBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class BorderEx extends JFrame {
	private Font font = new Font(Font.DIALOG, Font.BOLD, 25);
	public BorderEx() {
		
		
		JPanel pnlMain = new JPanel(new GridLayout(0, 1, 10, 10)); //패널마다 간격주기 가로세로위아래
		JScrollPane scroll = new JScrollPane(pnlMain); //스크롤 객체생성
		JScrollBar bar = scroll.getVerticalScrollBar(); // 스크롤 설정 변경
		bar.setUnitIncrement(25);  //스크롤 이동속도 변경 올라갈수록 빨라짐.
				
		Insets insets = new Insets(20, 20, 20, 20);
		pnlMain.setBorder(new EmptyBorder(insets));  //Border 여백주기
		
		AbstractBorder border = new LineBorder(Color.BLACK, 1);
		pnlMain.add(getLabel("LineBorder", border));  //테두리 만들기
		
	
		TitledBorder tBorder = new TitledBorder("TitledBorder"); //우측상단에 제목있는 보더
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		LineBorder lBorder = new LineBorder(Color.RED,1);  //titled border에 lineborder 결합
		tBorder = new TitledBorder(
				lBorder,"TitledBorder + LineBorder");
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("right");  		//타이틀 오른쪽으로이동
		tBorder.setTitleJustification(TitledBorder.RIGHT); //타이틀 횡이동
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("center-bottom");  //타이틀 센터,아래쪽으로이동
		tBorder.setTitleJustification(TitledBorder.CENTER);
		tBorder.setTitlePosition(TitledBorder.BOTTOM);	 //타이틀 종이동
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("above_bottom");  // 타이틀이 안에 포함
		tBorder.setTitleJustification(TitledBorder.CENTER);
		tBorder.setTitlePosition(TitledBorder.ABOVE_BOTTOM);		 
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("below_bottom");  // 타이틀이 밖으로빠짐
		tBorder.setTitleJustification(TitledBorder.CENTER);
		tBorder.setTitlePosition(TitledBorder.BELOW_BOTTOM);		 
		pnlMain.add(getLabel("TitledBorder",tBorder));
		/*
		 *  타이틀 위치설정
		 *  세로 : setTitlePosition(position)
		 *  -> ABOVE_TOP,BELOW_TOP,ABOVE_BOTTOM,BELOW_BOTTOM,TOP,BOTTM
		 *  세로 : setTitleJustification(position)
		 *  -> LEFT,CENTER,RIGHT
		 */ 
		
		LineBorder innerLine = new LineBorder(Color.GREEN, 5); //타이틀드 보더 안에 타이틀드보더
		TitledBorder innerTitle = new TitledBorder(
			innerLine,
			"inner title"
		);
		innerTitle.setTitlePosition(TitledBorder.BOTTOM);
		
		tBorder = new TitledBorder(
			innerTitle, "title"
		);
		pnlMain.add(getLabel("TitledBorder", tBorder));	
		
		tBorder = new TitledBorder("Title changed write");
		tBorder.setTitleFont(new Font(Font.MONOSPACED,Font.ITALIC,15));
		tBorder.setTitleColor(Color.PINK);//타이틀 글씨색 바꾸기
		pnlMain.add(getLabel("TitledBorder",tBorder)); //타이틀 글씨 바꾸기
		
		tBorder = new TitledBorder("left-avobe_top");  // 타이틀이 위로빠짐
		tBorder.setTitleJustification(TitledBorder.LEFT);
		tBorder.setTitlePosition(TitledBorder.ABOVE_TOP);		 
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		border = new EtchedBorder(EtchedBorder.RAISED);
		pnlMain.add(getLabel("EtchedBorder-RAISED", border)); //테두리 양각
		
		border = new EtchedBorder(EtchedBorder.LOWERED);
		pnlMain.add(getLabel("EtchedBorder-LOWERED", border)); //테두리 음각
		
		border = new BevelBorder(BevelBorder.RAISED);
		pnlMain.add(getLabel("BevelBorder-RAISED", border)); //테두리 튀어나온 입체감
		
		border = new BevelBorder(BevelBorder.LOWERED);
		pnlMain.add(getLabel("BevelBorder-LOWERED", border)); //테두리 폭 들어간 입체감
		
		
		
		
		
	
//=========================================================================================BorderSet		
	
		add(scroll, BorderLayout.CENTER); //스크롤 붙이기
		setTitle("BorderEx");
		setSize(500, 600);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	private JLabel getLabel(String text, AbstractBorder border) {
		JLabel lbl = new JLabel(text, JLabel.CENTER);
		lbl.setFont(font);
		lbl.setBorder(border);
		return lbl;
	}
	
	
	public static void main(String[] args) {
		new BorderEx();
	}
}

