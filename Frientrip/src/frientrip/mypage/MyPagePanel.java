package frientrip.mypage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import frientrip.main.MainFrame;

public class MyPagePanel extends JPanel {
	
	private MainFrame mainFrame = null;
	private ImageIcon img_mypagetitle;
	private ImageIcon img_smalllogo;
	private ImageIcon img_Back;
	private JButton btnBack;
	private ImageIcon img_profile;
	private ImageIcon img_iconbiils;
	private ImageIcon img_iconprofile;
	private ImageIcon img_iconrecharge;
	private ImageIcon img_icongain;
	
	public MyPagePanel() {
		
		setLayout(new BorderLayout());
	    
		setSize(1050, 750);
		setBackground(new Color(220, 238, 248));    //배경색 설정
    
		mainFrame = (MainFrame) MainFrame.getMainFrame();	//메인 프레임 객체 주소 저장
    
		mainFrame.setTitle("GuideList");
    
		makeImageIcon();
    
		makeTitle();
}
    
		
		private void makeImageIcon() {
			img_mypagetitle = new ImageIcon("Frientrip/img/mypage/img_mypagetitle.png");
			img_smalllogo = new ImageIcon("Frientrip/img/guidelist/img_smalllogo.png");
			img_Back = new ImageIcon("Frientrip/img/guidelist/img_Back.png");
			img_profile = new ImageIcon("Frientrip/img/mypage/img_profile.png");
			img_iconbiils = new ImageIcon("Frientrip/img/mypage/img_iconbills.png");
			img_iconrecharge = new ImageIcon("Frientrip/img/mypage/img_iconrecharge.png");
			img_iconprofile = new ImageIcon("Frientrip/img/mypage/img_iconprofile.png");
			img_icongain = new ImageIcon("Frientrip/img/mypage/img_icongain.png");
		
	}


		private void makeTitle() {
			JPanel pnTitleBackground = new JPanel();
			pnTitleBackground.setLayout(new BorderLayout());
			pnTitleBackground.setBackground(new Color(220, 238, 248));		//패널 색상 배경색과 동일하게 설정
				
				
			//타이틀 생성
			JPanel pnTitle = new JPanel();
			pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
			pnTitle.setBorder(new EmptyBorder(0, 150, 0, 120));	//패널 패딩 설정
			pnTitle.setBackground(new Color(220, 238, 248));		//패널 색상 배경색과 동일하게 설정
			JLabel lblTitle = new JLabel(img_mypagetitle);
			pnTitle.add(lblTitle);
			pnTitleBackground.add(pnTitle, BorderLayout.CENTER);
				
				//뒤로가기 버튼 생성
		    JPanel pnBack = new JPanel();
			pnBack.setLayout(new FlowLayout(FlowLayout.CENTER));
			pnBack.setPreferredSize(new Dimension(120, 120));	//패널 크기 설정
			pnBack.setBorder(new EmptyBorder(30, 30, 100, 0));		//패널 패딩 설정
			pnBack.setBackground(new Color(220, 238, 248));		//패널 색상 배경생과 동일하게 설정
			btnBack = new JButton(img_Back);
			btnBack.setBorderPainted(false); //버튼 테두리 없애기
			btnBack.setContentAreaFilled(false); //버튼 배경 없애기
			pnBack.add(btnBack);
			pnTitleBackground.add(pnBack, BorderLayout.WEST);
			
			//로고 생성
			JPanel pnLogo = new JPanel();
			pnLogo.setLayout(new FlowLayout(FlowLayout.CENTER));
			//pnLogo.setBorder(new EmptyBorder(0, 0, 0, 0));	//패널 패딩 설정
			pnLogo.setBackground(new Color(220, 238, 248));		//패널 색상 배경색과 동일하게 설정
			JLabel lblLogo = new JLabel(img_smalllogo);
			pnLogo.add(lblLogo);
			pnTitleBackground.add(pnLogo, BorderLayout.EAST);
			
			
			add(pnTitleBackground, BorderLayout.NORTH);
			
	
        JPanel panCenter = new JPanel(); 
        panCenter.setLayout(null);
        panCenter.setBackground(new Color(213, 251, 200));
        
        JPanel panList = new JPanel();
        panList.setLayout(null);
        panList.setBackground(new Color(220, 238, 248));
        panList.setBounds(100, 40, 850, 500);
    	panList.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
    	
        JLabel lbl_profile = new JLabel(img_profile);
        lbl_profile.setSize(165, 195);
    	lbl_profile.setLocation(30, 30);
        panList.add(lbl_profile);
        
        JLabel lbl_name = new JLabel("이름: ");
        lbl_name.setSize(200, 25);
        lbl_name.setLocation(200, 30);
        lbl_name.setFont(new Font("D2 coding", Font.BOLD, 18));
        lbl_name.setForeground(new Color(59, 126, 205));
        panList.add(lbl_name); 
   
        JLabel lbl_type = new JLabel("가입 유형: ");
        lbl_type.setSize(200, 25);
        lbl_type.setLocation(200, 60);
        lbl_type.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_type.setForeground(new Color(59, 126, 205));
        panList.add(lbl_type); 
   
        JLabel lbl_intro = new JLabel("* 소개: ");
        lbl_intro.setSize(200, 25);
        lbl_intro.setLocation(200, 90);
        lbl_intro.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_intro.setForeground(new Color(59, 126, 205));
        panList.add(lbl_intro); 
   
        JLabel lbl_nation = new JLabel("* 국적: ");
        lbl_nation.setSize(200, 25);
        lbl_nation.setLocation(200, 120);
        lbl_nation.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_nation.setForeground(new Color(59, 126, 205));
        panList.add(lbl_nation); 

        JLabel lbl_language = new JLabel("* 언어: ");
        lbl_language.setSize(200, 25);
        lbl_language.setLocation(200, 150);
        lbl_language.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_language.setForeground(new Color(59, 126, 205));
        panList.add(lbl_language); 
   
        JLabel lbl_mail = new JLabel("* E - Mail: ");
        lbl_mail.setSize(200, 25);
        lbl_mail.setLocation(200,180);
        lbl_mail.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_mail.setForeground(new Color(59, 126, 205));
        panList.add(lbl_mail); 
        
        JTextArea ta_intro = new JTextArea("소개글");
        ta_intro.setSize(400, 200);
        ta_intro.setLocation(30, 250);
        ta_intro.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
        ta_intro.setEditable(false);
        panList.add(ta_intro);
   
       
    	JButton btn_iconbiils = new JButton(img_iconbiils);
    	btn_iconbiils.setSize(200, 200);
    	btn_iconbiils.setLocation(440, 30);
        btn_iconbiils.setBackground(new Color(220, 238, 248));
        btn_iconbiils.setBorderPainted(false);
        panList.add(btn_iconbiils); 
    	
       
    	JButton btn_iconrecharge = new JButton(img_iconrecharge);
    	btn_iconrecharge.setSize(200, 200);
    	btn_iconrecharge.setLocation(640, 30);
        btn_iconrecharge.setBackground(new Color(220, 238, 248));
        btn_iconrecharge.setBorderPainted(false);
        panList.add(btn_iconrecharge); 

       
        JButton btn_iconprofile = new JButton(img_iconprofile);
        btn_iconprofile.setSize(200, 200);
        btn_iconprofile.setLocation(440, 250);
        btn_iconprofile.setBackground(new Color(220, 238, 248));
        btn_iconprofile.setBorderPainted(false);
        panList.add(btn_iconprofile); 
   
        
        JButton btn_icongain = new JButton(img_icongain);
        btn_icongain.setSize(200, 200);
        btn_icongain.setLocation(640, 250);
        btn_icongain.setBackground(new Color(220, 238, 248));
        btn_icongain.setBorderPainted(false);
        panList.add(btn_icongain); 
    	
        panCenter.add(panList);
	
        add(panCenter, BorderLayout.CENTER);
       
	}

	
}
