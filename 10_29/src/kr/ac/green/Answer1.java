package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Answer1 extends JFrame {
	private JLabel lblInfo;
	private JButton btnCombo;
	private JButton btnPotato;
	private JButton btnBul;
	public static final Dimension BTN_SIZE = new Dimension(112, 20);

	// java.awt.Dimension[width=112,height=28]
	public Answer1() {
		init();
		setDisplay();
		showFrame();
	}
	/*
	 * FlowLayout = PrefferdSize 값이 영향을 미치는곳 - FlowLayout : 구성요소 - BorderLayout
	 * : North,South의 높이 West,East의 너비. - GridLayout(pack) : 가장 큰 컴포넌트 기준으로 가로세로
	 * 높이 결정.
	 */

	// 컴포넌트 초기화
	private void init() {
		lblInfo = new JLabel("자바피자에오신것을 환영합니다. 피자를 고르세요.", JLabel.CENTER);
		btnCombo = new JButton("콤보피자");
		btnCombo.setPreferredSize(BTN_SIZE);
		btnPotato = new JButton("포테이토피자");
		btnPotato.setPreferredSize(BTN_SIZE);
		btnBul = new JButton("불고기피자");
		btnBul.setPreferredSize(BTN_SIZE);
	}

	// 배치
	private void setDisplay() {
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCombo);
		pnlCenter.add(btnPotato);
		pnlCenter.add(btnBul);

		add(lblInfo, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
	}

	// 창보여주기
	private void showFrame() {
		setTitle("MyFrame");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		System.out.println(btnPotato.getSize()); // 버튼 사이즈계산
	}

	public static void main(String[] args) {
		new Answer1();
	}
}