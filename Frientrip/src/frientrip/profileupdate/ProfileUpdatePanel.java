package frientrip.profileupdate;

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

public class ProfileUpdatePanel extends JPanel {
	
	private MainFrame mainFrame = null;
	private ImageIcon img_smalllogo;
	private ImageIcon img_Back;
	private ImageIcon img_ordertitle;
	private JButton btnBack;
	private ImageIcon img_orderextitle;
	private ImageIcon img_location;
	private ImageIcon img_location2;

	private ImageIcon img_GoGuide;
	private ImageIcon img_GoChat;
	private ImageIcon img_updatetitle;
	private ImageIcon img_profile;
	private ImageIcon img_Save;
	
	
	
	public ProfileUpdatePanel() {
		
		setLayout(new BorderLayout());
	    
		setSize(1050, 750);
		setBackground(new Color(220, 238, 248));    //배경색 설정
    
		mainFrame = (MainFrame) MainFrame.getMainFrame();	//메인 프레임 객체 주소 저장
    
		mainFrame.setTitle("OrderExplain");
    
		makeImageIcon();
    
		makeTitle();
		
		makeCenter();
}
		
		private void makeImageIcon() {
			img_updatetitle = new ImageIcon("Frientrip/img/profileupdate/img_updatetitle.png");
			img_smalllogo = new ImageIcon("Frientrip/img/guidelist/img_smalllogo.png");
			img_Back = new ImageIcon("Frientrip/img/guidelist/img_Back.png");
			img_profile = new ImageIcon("Frientrip/img/profileupdate/img_profile.png");
			img_GoGuide= new ImageIcon("Frientrip/img/order/img_GoGuide.png");
			img_GoChat = new ImageIcon("Frientrip/img/order/img_GoChat.png");
			img_Save = new ImageIcon("Frientrip/img/profileupdate/img_save.png");
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
			JLabel lblTitle = new JLabel(img_updatetitle);
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
				
			
		}

		private void makeCenter() {
	        
	        JPanel panCenter = new JPanel(); 
	        panCenter.setLayout(null);
	        panCenter.setBackground(new Color(213, 251, 200));
	        
	       JPanel panPrfUpdate = new JPanel();
	       panPrfUpdate.setLayout(new BorderLayout());
	       panPrfUpdate.setBounds(225, 7, 600, 580);
	       panPrfUpdate.setBackground(new Color(220, 238, 248));
	       
	       JPanel panUpdateWest = new JPanel();
	       panUpdateWest.setLayout(null);
	       panUpdateWest.setPreferredSize(new Dimension(200, 580));	//패널 크기 설정
	       panUpdateWest.setBackground(new Color(220, 238, 248));
	       panUpdateWest.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	      
	       
	       JLabel lbl_ImgProfile = new JLabel(img_profile);
	       lbl_ImgProfile.setSize(200, 190);
	       lbl_ImgProfile.setLocation(0, 3);
	       
	       JLabel lbl_Name = new JLabel("이름" );
	       lbl_Name.setSize(250, 50);
	       lbl_Name.setLocation(10, 190);
	       lbl_Name.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Name.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Name = new JTextArea();
	       ta_Name.setSize(200,40);
	       ta_Name.setBackground(Color.WHITE);
	       ta_Name.setLocation(0, 230);
	       ta_Name.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

	       JLabel lbl_Nation = new JLabel("국적" );
	       lbl_Nation.setSize(250, 50);
	       lbl_Nation.setLocation(10, 270);
	       lbl_Nation.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Nation.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Nation = new JTextArea();
	       ta_Nation.setSize(200,40);
	       ta_Nation.setBackground(Color.WHITE);
	       ta_Nation.setLocation(0, 310);
	       ta_Nation.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

	       
	       JLabel lbl_Year = new JLabel("생년" );
	       lbl_Year.setSize(250, 50);
	       lbl_Year.setLocation(10, 350);
	       lbl_Year.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Year.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Year = new JTextArea();
	       ta_Year.setSize(200,40);
	       ta_Year.setBackground(Color.WHITE);
	       ta_Year.setLocation(0, 390);
	       ta_Year.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

	       JLabel lbl_Company = new JLabel("회사" );
	       lbl_Company.setSize(250, 50);
	       lbl_Company.setLocation(10, 430);
	       lbl_Company.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Company.setForeground(new Color(59, 126, 205));

	       JTextArea ta_Company = new JTextArea();
	       ta_Company.setSize(200,40);
	       ta_Company.setBackground(Color.WHITE);
	       ta_Company.setLocation(0, 470);
	       ta_Company.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JLabel lbl_Save = new JLabel(img_Save);
	       lbl_Save.setSize(150, 100);
	       lbl_Save.setLocation(72, 495);
	       
	       panUpdateWest.add(lbl_ImgProfile);
	       panUpdateWest.add(lbl_Name);
	       panUpdateWest.add(ta_Name);
	       panUpdateWest.add(lbl_Nation);
	       panUpdateWest.add(ta_Nation);
	       panUpdateWest.add(lbl_Year);
	       panUpdateWest.add(ta_Year);
	       panUpdateWest.add(lbl_Company);
	       panUpdateWest.add(ta_Company);
	       panUpdateWest.add(lbl_Save);
	       
	       
	       JPanel panUpdateEast = new JPanel();
	       panUpdateEast.setLayout(null);
	       panUpdateEast.setBackground(Color.WHITE);
	       panUpdateEast.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JLabel lbl_ID = new JLabel("아이디" );
	       lbl_ID.setSize(250, 40);
	       lbl_ID.setLocation(10, 0);
	       lbl_ID.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_ID.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_ID = new JTextArea();
	       ta_ID.setSize(380,40);
	       ta_ID.setBackground(Color.WHITE);
	       ta_ID.setLocation(10, 40);
	       ta_ID.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JLabel lbl_PW = new JLabel("비밀번호" );
	       lbl_PW.setSize(250, 40);
	       lbl_PW.setLocation(10, 80);
	       lbl_PW.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_PW.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_PW = new JTextArea();
	       ta_PW.setSize(380,40);
	       ta_PW.setBackground(Color.WHITE);
	       ta_PW.setLocation(10, 120);
	       ta_PW.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

	       JLabel lbl_Call = new JLabel("전화번호" );
	       lbl_Call.setSize(250, 40);
	       lbl_Call.setLocation(10, 160);
	       lbl_Call.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Call.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Call = new JTextArea();
	       ta_Call.setSize(380,40);
	       ta_Call.setBackground(Color.WHITE);
	       ta_Call.setLocation(10, 200);
	       ta_Call.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

	       JLabel lbl_Passport = new JLabel("여권번호" );
	       lbl_Passport.setSize(250, 40);
	       lbl_Passport.setLocation(10, 240);
	       lbl_Passport.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Passport.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Passport = new JTextArea();
	       ta_Passport.setSize(380,40);
	       ta_Passport.setBackground(Color.WHITE);
	       ta_Passport.setLocation(10, 280);
	       ta_Passport.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

	       JLabel lbl_Email = new JLabel("E-Mail" );
	       lbl_Email.setSize(250, 40);
	       lbl_Email.setLocation(10, 320);
	       lbl_Email.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Email.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Email = new JTextArea();
	       ta_Email.setSize(380,40);
	       ta_Email.setBackground(Color.WHITE);
	       ta_Email.setLocation(10, 360);
	       ta_Email.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JLabel lbl_Intro = new JLabel("한 줄 소개" );
	       lbl_Intro.setSize(250, 40);
	       lbl_Intro.setLocation(10, 400);
	       lbl_Intro.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Intro.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Intro = new JTextArea();
	       ta_Intro.setSize(380,40);
	       ta_Intro.setBackground(Color.WHITE);
	       ta_Intro.setLocation(10, 440);
	       ta_Intro.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JLabel lbl_Language = new JLabel("언어" );
	       lbl_Language.setSize(250, 40);
	       lbl_Language.setLocation(10, 480);
	       lbl_Language.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Language.setForeground(new Color(59, 126, 205));
	       
	       JTextArea ta_Language = new JTextArea();
	       ta_Language.setSize(380,40);
	       ta_Language.setBackground(Color.WHITE);
	       ta_Language.setLocation(10, 520);
	       ta_Language.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       
	       panUpdateEast.add(lbl_ID);
	       panUpdateEast.add(ta_ID);
	       panUpdateEast.add(lbl_PW);
	       panUpdateEast.add(ta_PW);
	       panUpdateEast.add(lbl_Call);
	       panUpdateEast.add(ta_Call);
	       panUpdateEast.add(lbl_Passport);
	       panUpdateEast.add(ta_Passport);
	       panUpdateEast.add(lbl_Email);
	       panUpdateEast.add(ta_Email);
	       panUpdateEast.add(lbl_Intro);
	       panUpdateEast.add(ta_Intro);
	       panUpdateEast.add(lbl_Language);
	       panUpdateEast.add(ta_Language);
	       
	       
	       panPrfUpdate.add(panUpdateWest, BorderLayout.WEST);
	      panPrfUpdate.add(panUpdateEast, BorderLayout.CENTER);
	      
	       panCenter.add(panPrfUpdate);
	        add(panCenter, BorderLayout.CENTER);
	    
			
		}

	
	}






