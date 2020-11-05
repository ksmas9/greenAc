package kr.ac.green;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextInputEx extends JFrame {

	public TextInputEx() {
		JTextField tf = new JTextField(10);
		tf.setText("Example");
		// �б�����
		// tf.setEditable(false);
		// ��Ȱ��ȭ
		tf.setEnabled(false);

		JPanel pnlNorth = new JPanel();
		pnlNorth.add(new JLabel("����� �Է�"));
		pnlNorth.add(tf);
		JButton btn = new JButton("ok");
		btn.setEnabled(false);
		pnlNorth.add(btn);

		add(pnlNorth, BorderLayout.NORTH);

		JPasswordField pf = new JPasswordField();
		pf.setEchoChar('$');
		add(pf, BorderLayout.SOUTH);

		JTextArea ta = new JTextArea(5, 20);
		// �ڵ��ٹٲ�
		ta.setLineWrap(true);
		// �ٹٲ� ����(�ܾ�)
		ta.setWrapStyleWord(true);
		
		JScrollPane scroll = new JScrollPane(ta);
		scroll.setHorizontalScrollBarPolicy(
				// JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
				// JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll, BorderLayout.CENTER);

		// ����� �Է� �������� 
		String userInput = tf.getText();
		char[] password = pf.getPassword();
		
		//char[] ->String
		String pw1 = String.valueOf(password); //��й�ȣ ��������
		String pw2 = new String(password);  //��й�ȣ ��������
		
		setTitle("text input ex");
		setSize(400, 300);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextInputEx();
	}
}
