package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * ��ġ (layout) : ��������� ũ��, ��ġ ����
 * 
 * layout manager : ��ġ������, Container���� 1���� ������.
 * 
 * 1. BorderLayout
 * 	-> Container�� 5���������� ���� �ؼ� ��ġ�Ѵ�.(��ġ)
 *  -> �� �������� 1���� Component�� ���δ�.
 *  -> ������ ������Ʈ�� �ش� ������ ����ä��� ũ��� ���ǵȴ�.(ũ��)
 *  -> Container�� ũ�Ⱑ ���Ҷ�, �������� ������ �޴� ������ �ٸ���.
 *  	(Ⱦ : north, south, center, �� : west, east, center)
 *  
 * 2. FlowLayout
 *  -> �����Ǵ� ������� ��ġ�Ѵ�.(��->��, ��->�Ʒ�)
 *  -> ���ı����� ������.(LEFT, RIGHT, CENTER)
 *  -> ������Ʈ�� ���빰�� ���� ũ�Ⱑ �����ȴ�.
 *  
 * 3. GridLayout
 * 	-> ��, ĭ���� ������ ����
 * 	-> ������ 1���� ������Ʈ�� ����.
 * 	-> ��ġ�� ��� ������Ʈ�� ������ ũ�⸦ ������.
 *  -> ����, ���� ������ ������ ���� �� �ִ�.
 *  -> �� ���� ������ �Ұ��� �ϴ�.
 *  -> ���� �ǳʶپ ��ġ�ϴ°��� �Ұ��� �ϴ�. 
 *  -> ��, ĭ�� ������ 0���� ���� �� �� �ִ�.(1���� ����)
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
		// layout manager ����
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

		// �� Component�� ũ��� ��ġ ������ ������ ������
		// Container�� ������ �ɶ� layout manager�� ���� ����ȴ�.
		btnNorth.setSize(100, 100);

		add(btnNorth, BorderLayout.NORTH);
		add(btnCenter, BorderLayout.CENTER);
		add(btnWest, BorderLayout.WEST);
		add(btnEast, BorderLayout.EAST);
		add(btnSouth, BorderLayout.SOUTH);
	}

	private void flowLayout() {
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		// layout manager ����
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
