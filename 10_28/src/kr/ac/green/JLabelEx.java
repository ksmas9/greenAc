package kr.ac.green;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * JLabel
 * ����, �׸� ǥ���ϴ� ������Ʈ
 */
public class JLabelEx extends JFrame {

	public JLabelEx() {
		setLayout(new GridLayout(0, 1));

		JLabel lblFirst = new JLabel("�ѱ�", JLabel.CENTER);
		// ������ ��� ������ ���� �� ����.	
		// ���������� ����
		lblFirst.setOpaque(true);
		lblFirst.setBackground(Color.YELLOW);
		lblFirst.setForeground(Color.RED);

		Font font = new Font("�ü�", Font.ITALIC | Font.BOLD, 40);
		lblFirst.setFont(font);

		add(lblFirst);
		
		JLabel lblSecond = new JLabel();
//		Toolkit kit = Toolkit.getDefaultToolkit();
//		Image img = kit.getImage("chokey.jpg");
		ImageIcon icon = new ImageIcon("chokey.jpg");
		lblSecond.setIcon(icon);

		add(lblSecond);

		setTitle("JLabelEx");
		setSize(300, 600);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JLabelEx();
	}
} 