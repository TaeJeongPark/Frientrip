package frientrip.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class MainPanel extends JPanel {
	
	private MainFrame mainFrame = null;	//메인 프레임 객체
	
	private ImageIcon img_logo;
	private ImageIcon img_login;
	private ImageIcon img_mypage;
	private ImageIcon img_guidelist;
	private ImageIcon img_myproducts;
	private ImageIcon img_chat;


	public MainPanel() {
		
		setLayout(new BorderLayout());
        setBackground(new Color(220, 238, 248));    //배경색 설정
        
        mainFrame = (MainFrame) MainFrame.getMainFrame();	//메인 프레임 객체 주소 저장
        
        mainFrame.setTitle("Main");
		
        makeImageIcon();
        
        makeLogo();
        
        makepnRight();
        
        makebtns();
        
     
    	} 
		
		private void makeImageIcon() {
			
		img_logo = new ImageIcon("img/common/img_logo.png");
		img_login = new ImageIcon("img/common/img_login.png");
		img_mypage = new ImageIcon("img/common/img_mypage.png");
		img_guidelist = new ImageIcon("img/common/img_guidelist.png");
		img_myproducts = new ImageIcon("img/common/img_myproducts.png");
		img_chat = new ImageIcon("img/common/img_chat.png");
		
	}

		private void makeLogo() { //로고 라벨을 붙일 패널
		JPanel pnLogo = new JPanel();
		pnLogo.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnLogo.setBackground(new Color(220, 238, 248));		//패널 색상 배경색과 동일하게 설정
		
		JLabel lblLogo = new JLabel(img_logo);
		
		pnLogo.add(lblLogo); //로고 생성 패널에 로고 이미지 아이콘 붙이기 
		add(pnLogo, BorderLayout.CENTER); 
		
	}
      
        
		private void makepnRight() { //로그인과 마이페이지 버튼을 붙일 패널
        JPanel pnEast = new JPanel();
        pnEast.setLayout(new GridLayout(0, 1));
        pnEast.setBackground(new Color(220, 238, 248));
           
        JButton btn_login = new JButton(img_login);
        btn_login.setBackground(new Color(220, 238, 248));
        btn_login.setBorderPainted(false);//버튼 테두리 없애기
            
        JButton btn_mypage = new JButton(img_mypage);
        btn_mypage.setBackground(new Color(220, 238, 248));
        btn_mypage.setBorderPainted(false);//버튼 테두리 없애기
            
        pnEast.add(btn_login);
        pnEast.add(btn_mypage);
        add(pnEast, BorderLayout.EAST);
			
		}

		private void makebtns() { //가이드리스트, 상품리스트, 채팅화면 버튼을 붙일 패널
		JPanel pnBtns = new JPanel();
		pnBtns.setLayout(new FlowLayout((FlowLayout.CENTER), 70, 50 ));
		pnBtns.setBackground(new Color(220, 238, 248));
				
		JButton btn_guidelist = new JButton(img_guidelist);
		btn_guidelist.setBackground(new Color(255, 252, 244));
		btn_guidelist.setBorderPainted(false); //버튼 테두리 없애기

		JButton btn_myproducts = new JButton(img_myproducts);
		btn_myproducts.setBackground(new Color(255, 252, 244));
		btn_myproducts.setBorderPainted(false); //버튼 테두리 없애기

		JButton btn_chat = new JButton(img_chat);
		btn_chat.setBackground(new Color(255, 252, 244));
		btn_chat.setBorderPainted(false); //버튼 테두리 없애기
		
        pnBtns.add(btn_guidelist);
		pnBtns.add(btn_myproducts);
		pnBtns.add(btn_chat);
		add(pnBtns, BorderLayout.SOUTH);
		        
		}

	}

	



