package frientrip.main;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import frientrip.dao.DAO;
import frientrip.login.LoginPanel;

/**
* @packageName   : frientrip.main
* @fileName      : MainFrame.java
* @author        : Taejeong Park
* @date          : 2023.05.15
* @description   : 메인 프레임 클래스
* ===========================================================
* DATE              AUTHOR            NOTE
* -----------------------------------------------------------
* 2023.05.15        Taejeong Park      최초 생성
* 2023.05.16        Taejeong Park      구현 완료
*/
public class MainFrame extends JFrame implements WindowListener {

	private static JFrame mainFrame;
	private JPanel currentPanel;
	
	public MainFrame(String title) {
		
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 50);
        setSize(1050, 750);
        setResizable(false);
        setLayout(new BorderLayout());
        
        mainFrame = this;
        
        currentPanel = new LoginPanel();
        add(currentPanel);
        
        setVisible(true);
        
        addWindowListener(this);
        
	}
	
	public static JFrame getMainFrame() {
		
		return mainFrame;
		
	}

	public static void setMainFrame(JFrame mainFrame) {
		
		MainFrame.mainFrame = mainFrame;
		
	}
	
	public JPanel getCurrentPanel() {
		
		return currentPanel;
		
	}

	public void setCurrentPanel(JPanel currentPanel) {
		
		this.currentPanel = currentPanel;
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		DAO.closeDB(DAO.conn, DAO.stmt);	//DB 연결 종료
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
