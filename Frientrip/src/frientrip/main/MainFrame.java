package frientrip.main;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import frientrip.login.LoginPanel;

public class MainFrame extends JFrame implements WindowListener {

	private static JFrame mainFrame;
	private JPanel currentPanel;
	
	//로그인 화면
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
		// TODO Auto-generated method stub
		
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
