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
 * 글자, 그림 표현하는 컴포넌트
 */
public class JLabelEx extends JFrame {

	public JLabelEx() {
		setLayout(new GridLayout(0, 1));

		JLabel lblFirst = new JLabel("한글", JLabel.CENTER);
		// 투명한 경우 배경색을 가질 수 없다.	
		// 불투명으로 설정
		lblFirst.setOpaque(true);
		lblFirst.setBackground(Color.YELLOW);
		lblFirst.setForeground(Color.RED);

		Font font = new Font("궁서", Font.ITALIC | Font.BOLD, 40);
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