package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 배치 (layout) : 구성요소의 크기, 위치 결정
 * 
 * layout manager : 배치관리자, Container마다 1개씩 가진다.
 * 
 * 1. BorderLayout
 * 	-> Container를 5개영역으로 분할 해서 배치한다.(위치)
 *  -> 각 영역에는 1개의 Component만 보인다.
 *  -> 부착된 컴포넌트는 해당 영역을 가득채우는 크기로 정의된다.(크기)
 *  -> Container의 크기가 변할때, 영역별로 영향을 받는 방향이 다르다.
 *  	(횡 : north, south, center, 종 : west, east, center)
 *  
 * 2. FlowLayout
 *  -> 부착되는 순서대로 배치한다.(왼->오, 위->아래)
 *  -> 정렬기준을 가진다.(LEFT, RIGHT, CENTER)
 *  -> 컴포넌트의 내용물에 따라 크기가 결정된다.
 *  
 * 3. GridLayout
 * 	-> 줄, 칸으로 영역을 분할
 * 	-> 영역당 1개의 컴포넌트가 들어간다.
 * 	-> 배치된 모든 컴포넌트는 동일한 크기를 가진다.
 *  -> 가로, 세로 셀간의 간격을 가질 수 있다.
 *  -> 셀 간의 병합은 불가능 하다.
 *  -> 셀을 건너뛰어서 배치하는것은 불가능 하다. 
 *  -> 줄, 칸의 갯수를 0으로 조절 할 수 있다.(1개만 가능)
 */
public class LayoutEx1 extends JFrame {
	public static final int BORDER = 0;
	public static final int FLOW = 1;
	public static final int GRID = 2;
	public static final int NONE = 3;

	public LayoutEx1(int kind) {
		if (kind == FLOW) {
			flowLayout();
		} else if (kind == GRID) {
			gridLayout();
		} else if (kind == NONE) {
			none();
		} else {
			borderLayout();
		}

		setSize(400, 300);
		setLocation(400, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void none() {
		// layout manager 제거
		setLayout(null);
		setTitle("");
		JButton btn1 = new JButton("first");
		btn1.setSize(100, 100);
		btn1.setLocation(0, 0);

		JButton btn2 = new JButton("second");
		btn2.setSize(120, 80);
		btn2.setLocation(100, 100);

		add(btn1);
		add(btn2);
	}

	private void borderLayout() {
		setTitle("BorderLayout Ex");

		JButton btnNorth = new JButton("north");
		JButton btnCenter = new JButton("center");
		JButton btnWest = new JButton("west");
		JButton btnEast = new JButton("east");
		JButton btnSouth = new JButton("south");

		// 각 Component는 크기와 위치 정보를 가질수 있지만
		// Container에 부착이 될때 layout manager에 의해 변경된다.
		btnNorth.setSize(100, 100);

		add(btnNorth, BorderLayout.NORTH);
		add(btnCenter, BorderLayout.CENTER);
		add(btnWest, BorderLayout.WEST);
		add(btnEast, BorderLayout.EAST);
		add(btnSouth, BorderLayout.SOUTH);
	}

	private void flowLayout() {
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		// layout manager 변경
		// BorderLayout -> FlowLayout
		setLayout(layout);

		setTitle("FlowLayout Ex");
		for (int i = 0; i < 50; i++) {
			JButton btn = new JButton(String.valueOf(i + 1));
			add(btn);
		}
	}

	private void gridLayout() {
		GridLayout layout = new GridLayout(3, 0, 5, 10);
		setLayout(layout);

		setTitle("GridLayout Ex");
		for (int i = 0; i < 17; i++) {
			JButton btn = new JButton(String.valueOf(i + 1));
			add(btn);
		}
	}

	public static void main(String[] args) {
		new LayoutEx1(LayoutEx1.NONE);
	}
}
