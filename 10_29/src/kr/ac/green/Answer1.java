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
	 * FlowLayout = PrefferdSize ���� ������ ��ġ�°� - FlowLayout : ������� - BorderLayout
	 * : North,South�� ���� West,East�� �ʺ�. - GridLayout(pack) : ���� ū ������Ʈ �������� ���μ���
	 * ���� ����.
	 */

	// ������Ʈ �ʱ�ȭ
	private void init() {
		lblInfo = new JLabel("�ڹ����ڿ����Ű��� ȯ���մϴ�. ���ڸ� ������.", JLabel.CENTER);
		btnCombo = new JButton("�޺�����");
		btnCombo.setPreferredSize(BTN_SIZE);
		btnPotato = new JButton("������������");
		btnPotato.setPreferredSize(BTN_SIZE);
		btnBul = new JButton("�Ұ������");
		btnBul.setPreferredSize(BTN_SIZE);
	}

	// ��ġ
	private void setDisplay() {
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(btnCombo);
		pnlCenter.add(btnPotato);
		pnlCenter.add(btnBul);

		add(lblInfo, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
	}

	// â�����ֱ�
	private void showFrame() {
		setTitle("MyFrame");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		System.out.println(btnPotato.getSize()); // ��ư ��������
	}

	public static void main(String[] args) {
		new Answer1();
	}
}