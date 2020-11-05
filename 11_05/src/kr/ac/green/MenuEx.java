package kr.ac.green;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class MenuEx extends JFrame {
	
	private JMenuBar mBar;
	private JMenu mFile;
	private JMenuItem miOpen;
	private JMenuItem miSave;
	private JMenuItem miExit;
	
	private JMenu mOption;
	private JRadioButtonMenuItem miA;
	private JRadioButtonMenuItem miB;
	
	private JLabel lbl;
		
	private JPopupMenu pMenu;
	private JMenuItem miFirst;
	private JMenuItem miSecond;
	private JMenuItem miThird;
	
	private JToolBar tBar;
	private JButton btnOpen;
	private JButton btnSave;
			
	public MenuEx(){
		try{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //UI����
		}catch(Exception e){			
		}
		
		mBar = new JMenuBar();
		mFile = new JMenu("File");
		miOpen = new JMenuItem("Open (O)");
		miOpen.setMnemonic('O');
//		ctrl + o �� ����
//		���϶� �����ϴ°� �ϸ��
		KeyStroke keys = KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK);
		//Ű���� CTRL_DOWN �� ��Ʈ�� ����ä��
		miOpen.setAccelerator(keys); // Ű���� �Է��ϱ�
		miOpen.setIcon(new ImageIcon("open.png"));
		
		miSave = new JMenuItem("Save (S)",'S'); //�Ǵϸ�� ���ÿ� ����
		miSave.setAccelerator(
				KeyStroke.getKeyStroke(
						KeyEvent.VK_S, 
						InputEvent.ALT_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK	
						)			
				);
				
		//alt + shift + s
		
		miSave.setIcon(new ImageIcon("save.png"));
		miExit = new JMenuItem("Exit");
		miExit.setActionCommand("bye"); //�¾׼� �ڸǵ��� ����
		mOption = new JMenu("Option");
		miA = new JRadioButtonMenuItem("option A");
		miB = new JRadioButtonMenuItem("option B");
		
		// ���� �׷��� �����.
		ButtonGroup group = new ButtonGroup();
		group.add(miA);
		group.add(miB);
		
		mOption.add(miA);
		mOption.add(miB);
		
		
		// add�� ������ ǥ�õȴ�.
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.addSeparator();
		mFile.add(mOption);
		mFile.addSeparator();
		mFile.add(miExit);
		
		mBar.add(mFile);
		mBar.add(new JMenu("Edit"));
		mBar.add(Box.createHorizontalGlue());
		mBar.add(new JMenu("help"));
		
		
		// �޴��ټ���
		setJMenuBar(mBar);
		
		lbl = new JLabel("Start", JLabel.CENTER);
		lbl.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setMnemonic('x');  //��ư�� �Ǵϸ��!
		
		//�˾����� Event ó�� 2���ؾ���.
		pMenu = new JPopupMenu();
		miFirst = new JMenuItem("First");
		miSecond = new JMenuItem("Second");
		miThird = new JMenuItem("Third");
		
		pMenu.add(miFirst);
		pMenu.add(miSecond);
		pMenu.add(miThird);
		
		//���ٽ���
		tBar = new JToolBar(); //�÷��� �Ǿ��־ �뽺,����Ʈ,��콺,�̽�Ʈ ������ߴ�.
		btnOpen = new JButton(new ImageIcon("open.png"));
		btnSave = new JButton(new ImageIcon("save.png"));
		
		tBar.add(btnOpen);
		tBar.addSeparator(new Dimension(10,0)); //���� ����
		tBar.add(btnSave);
		tBar.setFloatable(true); //�и� ����
		
		add(tBar, BorderLayout.NORTH);
		
		
		JPanel pnlCenter = new JPanel(new BorderLayout());
		
				
		pnlCenter.add(lbl, BorderLayout.CENTER);
		pnlCenter.add(btnExit, BorderLayout.SOUTH);
		
		add(pnlCenter, BorderLayout.CENTER);
		
		ActionListener listener = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent ae) {
//				JMenuItem item = (JMenuItem)ae.getSource();
//				lbl.setText(item.getText());	
//				ae.getActionCommand(); // �׼��̺�Ʈ�� ����� ���Ͷ�
				String cmd = ae.getActionCommand();
//				if (cmd.equals("Exit")) { exit�̳� bye�� �Ȱ��� �ɷ� 
				if (cmd.equals("bye")) {
					lbl.setText("exit (menu or button");
				} else{
					lbl.setText(cmd);
				}
			}
		};
		btnExit.addActionListener(listener);
		
		miOpen.addActionListener(listener);
		miSave.addActionListener(listener);
		miExit.addActionListener(listener);
		MouseListener mListener = new MouseAdapter() {
			// OS���� �˾���ȣ�� ���ǰ� �ٸ���.
			// ���� �� �� ó���Ѵ�.
			// ����� �ְ������ ������ �޴��ٿ��ִ� 
			// �޴��� ���ǰ� ���������δ� ����Ű����X
			@Override
			public void mousePressed(MouseEvent me){
				showPopup(me);
			}
			
			@Override
			public void mouseReleased(MouseEvent me){
				showPopup(me);
			}
		};
		
		lbl.addMouseListener(mListener);

		
		setTitle("MenuEx");
		setSize(400, 300);
		setLocation(100, 0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		System.out.println(miOpen.getPreferredSize());
	}	
	public void showPopup(MouseEvent me){
		if(me.isPopupTrigger()){
			pMenu.show(lbl, me.getX(),me.getY());
		}
	}
	
	public static void main(String[] args) {
		new MenuEx();
	}
}



