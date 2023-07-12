package frientrip.chat;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import frientrip.main.MainFrame;

public class ChatPanel extends JPanel {
	
	private MainFrame mainFrame = null;
	private ImageIcon img_smalllogo;
	private ImageIcon img_Back;
	private JButton btnBack;
	private ImageIcon img_chattitle;
	
	
	
	public ChatPanel() {
		
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
			img_chattitle = new ImageIcon("Frientrip/img/chat/img_chattitle.png");
			img_smalllogo = new ImageIcon("Frientrip/img/guidelist/img_smalllogo.png");
			img_Back = new ImageIcon("Frientrip/img/guidelist/img_Back.png");
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
			JLabel lblTitle = new JLabel(img_chattitle);
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
	        
	       JPanel panChatBack = new JPanel();
	       panChatBack.setLayout(null);
	       panChatBack.setBounds(175, 6, 700, 580);
	       panChatBack.setBackground(new Color(220, 238, 248));
	       
	       JPanel panChatWest = new JPanel();
	       panChatWest.setLayout(null);
	       panChatWest.setBounds(0,0, 250, 580);	//패널 크기 설정
	       panChatWest.setBackground(new Color(220, 238, 248));
	       panChatWest.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JPanel panChatEast = new JPanel();
	       panChatEast.setLayout(null);
	       panChatEast.setBounds(250, 0, 450, 520);
	       panChatEast.setBackground(Color.WHITE);
	       panChatEast.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JTextArea ta_Chat = new JTextArea();
	       ta_Chat.setLayout(null);
	       ta_Chat.setBackground(Color.WHITE);
	       ta_Chat.setBounds(250, 520, 350, 60);
	       ta_Chat.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JButton btnChat = new JButton("전송");
	       btnChat.setBackground(new Color(220, 238, 248));
	       btnChat.setBounds(600, 520, 100, 60);
	       btnChat.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       btnChat.setForeground(new Color(59, 126, 205));
	       btnChat.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	    		   
	      panChatBack.add(panChatWest);
	      panChatBack.add(panChatEast);
	      panChatBack.add(ta_Chat);
	      panChatBack.add(btnChat);
	      
	       panCenter.add(panChatBack);
	        add(panCenter, BorderLayout.CENTER);
	    
			
		}

	
	}






