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
		
		
		JPanel pnlMain = new JPanel(new GridLayout(0, 1, 10, 10)); //�гθ��� �����ֱ� ���μ������Ʒ�
		JScrollPane scroll = new JScrollPane(pnlMain); //��ũ�� ��ü����
		JScrollBar bar = scroll.getVerticalScrollBar(); // ��ũ�� ���� ����
		bar.setUnitIncrement(25);  //��ũ�� �̵��ӵ� ���� �ö󰥼��� ������.
				
		Insets insets = new Insets(20, 20, 20, 20);
		pnlMain.setBorder(new EmptyBorder(insets));  //Border �����ֱ�
		
		AbstractBorder border = new LineBorder(Color.BLACK, 1);
		pnlMain.add(getLabel("LineBorder", border));  //�׵θ� �����
		
	
		TitledBorder tBorder = new TitledBorder("TitledBorder"); //������ܿ� �����ִ� ����
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		LineBorder lBorder = new LineBorder(Color.RED,1);  //titled border�� lineborder ����
		tBorder = new TitledBorder(
				lBorder,"TitledBorder + LineBorder");
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("right");  		//Ÿ��Ʋ �����������̵�
		tBorder.setTitleJustification(TitledBorder.RIGHT); //Ÿ��Ʋ Ⱦ�̵�
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("center-bottom");  //Ÿ��Ʋ ����,�Ʒ��������̵�
		tBorder.setTitleJustification(TitledBorder.CENTER);
		tBorder.setTitlePosition(TitledBorder.BOTTOM);	 //Ÿ��Ʋ ���̵�
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("above_bottom");  // Ÿ��Ʋ�� �ȿ� ����
		tBorder.setTitleJustification(TitledBorder.CENTER);
		tBorder.setTitlePosition(TitledBorder.ABOVE_BOTTOM);		 
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		tBorder = new TitledBorder("below_bottom");  // Ÿ��Ʋ�� �����κ���
		tBorder.setTitleJustification(TitledBorder.CENTER);
		tBorder.setTitlePosition(TitledBorder.BELOW_BOTTOM);		 
		pnlMain.add(getLabel("TitledBorder",tBorder));
		/*
		 *  Ÿ��Ʋ ��ġ����
		 *  ���� : setTitlePosition(position)
		 *  -> ABOVE_TOP,BELOW_TOP,ABOVE_BOTTOM,BELOW_BOTTOM,TOP,BOTTM
		 *  ���� : setTitleJustification(position)
		 *  -> LEFT,CENTER,RIGHT
		 */ 
		
		LineBorder innerLine = new LineBorder(Color.GREEN, 5); //Ÿ��Ʋ�� ���� �ȿ� Ÿ��Ʋ�庸��
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
		tBorder.setTitleColor(Color.PINK);//Ÿ��Ʋ �۾��� �ٲٱ�
		pnlMain.add(getLabel("TitledBorder",tBorder)); //Ÿ��Ʋ �۾� �ٲٱ�
		
		tBorder = new TitledBorder("left-avobe_top");  // Ÿ��Ʋ�� ���κ���
		tBorder.setTitleJustification(TitledBorder.LEFT);
		tBorder.setTitlePosition(TitledBorder.ABOVE_TOP);		 
		pnlMain.add(getLabel("TitledBorder",tBorder));
		
		border = new EtchedBorder(EtchedBorder.RAISED);
		pnlMain.add(getLabel("EtchedBorder-RAISED", border)); //�׵θ� �簢
		
		border = new EtchedBorder(EtchedBorder.LOWERED);
		pnlMain.add(getLabel("EtchedBorder-LOWERED", border)); //�׵θ� ����
		
		border = new BevelBorder(BevelBorder.RAISED);
		pnlMain.add(getLabel("BevelBorder-RAISED", border)); //�׵θ� Ƣ��� ��ü��
		
		border = new BevelBorder(BevelBorder.LOWERED);
		pnlMain.add(getLabel("BevelBorder-LOWERED", border)); //�׵θ� �� �� ��ü��
		
		
		
		
		
	
//=========================================================================================BorderSet		
	
		add(scroll, BorderLayout.CENTER); //��ũ�� ���̱�
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

