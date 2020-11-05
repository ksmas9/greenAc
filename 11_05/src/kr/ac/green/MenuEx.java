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
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //UI설정
		}catch(Exception e){			
		}
		
		mBar = new JMenuBar();
		mFile = new JMenu("File");
		miOpen = new JMenuItem("Open (O)");
		miOpen.setMnemonic('O');
//		ctrl + o 는 열기
//		보일때 동작하는거 니모닉
		KeyStroke keys = KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK);
		//키조합 CTRL_DOWN 은 컨트롤 누른채로
		miOpen.setAccelerator(keys); // 키조합 입력하기
		miOpen.setIcon(new ImageIcon("open.png"));
		
		miSave = new JMenuItem("Save (S)",'S'); //므니모닉 동시에 정의
		miSave.setAccelerator(
				KeyStroke.getKeyStroke(
						KeyEvent.VK_S, 
						InputEvent.ALT_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK	
						)			
				);
				
		//alt + shift + s
		
		miSave.setIcon(new ImageIcon("save.png"));
		miExit = new JMenuItem("Exit");
		miExit.setActionCommand("bye"); //셋액션 코맨드의 정의
		mOption = new JMenu("Option");
		miA = new JRadioButtonMenuItem("option A");
		miB = new JRadioButtonMenuItem("option B");
		
		// 논리적 그룹을 만든다.
		ButtonGroup group = new ButtonGroup();
		group.add(miA);
		group.add(miB);
		
		mOption.add(miA);
		mOption.add(miB);
		
		
		// add된 순서로 표시된다.
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
		
		
		// 메뉴바설정
		setJMenuBar(mBar);
		
		lbl = new JLabel("Start", JLabel.CENTER);
		lbl.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setMnemonic('x');  //버튼에 므니모닉!
		
		//팝업시작 Event 처리 2번해야함.
		pMenu = new JPopupMenu();
		miFirst = new JMenuItem("First");
		miSecond = new JMenuItem("Second");
		miThird = new JMenuItem("Third");
		
		pMenu.add(miFirst);
		pMenu.add(miSecond);
		pMenu.add(miThird);
		
		//툴바시작
		tBar = new JToolBar(); //플로팅 되어있어서 노스,웨스트,사우스,이스트 비워놔야댐.
		btnOpen = new JButton(new ImageIcon("open.png"));
		btnSave = new JButton(new ImageIcon("save.png"));
		
		tBar.add(btnOpen);
		tBar.addSeparator(new Dimension(10,0)); //간격 조정
		tBar.add(btnSave);
		tBar.setFloatable(true); //분리 방지
		
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
//				ae.getActionCommand(); // 액션이벤트의 명령을 들고와라
				String cmd = ae.getActionCommand();
//				if (cmd.equals("Exit")) { exit이나 bye나 똑같은 걸로 
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
			// OS마다 팝업신호의 정의가 다르다.
			// 따라서 둘 다 처리한다.
			// 기능을 넣고싶으면 기존의 메뉴바에있는 
			// 메뉴가 사용되고 독립적으로는 단축키설정X
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



