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

public class BorderExT extends JFrame {
	private Font font = new Font(Font.DIALOG, Font.BOLD, 25);

	public BorderExT() {
		JPanel pnlMain = new JPanel(new GridLayout(0, 1, 10, 10));
		JScrollPane scroll = new JScrollPane(pnlMain);

		Insets insets = new Insets(20, 20, 20, 20);
		pnlMain.setBorder(new EmptyBorder(insets));

		TitledBorder tBorder = new TitledBorder("I'm a title");
		pnlMain.add(getLabel("TitledBorder", tBorder));

		LineBorder lBorder = new LineBorder(Color.RED, 1);
		tBorder = new TitledBorder(lBorder, "TitledBorder + LineBorder");
		pnlMain.add(getLabel("TitledBorder", tBorder));

		tBorder = new TitledBorder("right");
		// 타이틀 횡 위치 설정
		tBorder.setTitleJustification(TitledBorder.RIGHT);
		pnlMain.add(getLabel("TitledBorder", tBorder));

		tBorder = new TitledBorder("center-bottom");
		tBorder.setTitleJustification(TitledBorder.CENTER);
		// 타이틀의 종 위치 설정
		tBorder.setTitlePosition(TitledBorder.BOTTOM);
		pnlMain.add(getLabel("TitledBorder", tBorder));

		AbstractBorder border = new LineBorder(Color.BLACK, 1);
		pnlMain.add(getLabel("LineBorder", border));

		border = new EtchedBorder(EtchedBorder.RAISED);
		pnlMain.add(getLabel("EtchedBorder-RAISED", border));

		border = new EtchedBorder(EtchedBorder.LOWERED);
		pnlMain.add(getLabel("EtchedBorder-LOWERED", border));

		border = new BevelBorder(BevelBorder.RAISED);
		pnlMain.add(getLabel("BevelBorder-RAISED", border));

		border = new BevelBorder(BevelBorder.LOWERED);
		pnlMain.add(getLabel("BevelBorder-LOWERED", border));

		// 세로스크롤바를 가져온다.
		JScrollBar bar = scroll.getVerticalScrollBar();
		// 움직이는 단위를 올려준다.
		bar.setUnitIncrement(5);

		add(scroll, BorderLayout.CENTER);
		setTitle("BorderEx");
		setSize(400, 400);
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
		new BorderExT();
	}
}
