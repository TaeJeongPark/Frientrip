package frientrip.order;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import frientrip.main.MainFrame;
import frientrip.mypage.MyPagePanel;

public class OrderExplainPanel extends JPanel {
	
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
	
	
	
	public OrderExplainPanel() {
		
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
			img_orderextitle = new ImageIcon("Frientrip/img/order/img_orderextitle.png");
			img_smalllogo = new ImageIcon("Frientrip/img/guidelist/img_smalllogo.png");
			img_Back = new ImageIcon("Frientrip/img/guidelist/img_Back.png");
			img_location2 = new ImageIcon("Frientrip/img/order/img_location2.png");
			img_GoGuide= new ImageIcon("Frientrip/img/order/img_GoGuide.png");
			img_GoChat = new ImageIcon("Frientrip/img/order/img_GoChat.png");
		
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
			JLabel lblTitle = new JLabel(img_orderextitle);
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
	        
	       JPanel panOrderEx = new JPanel();
	       panOrderEx.setLayout(new BorderLayout());
	       panOrderEx.setBounds(225, 7, 600, 580);
	       panOrderEx.setBackground(new Color(220, 238, 248));
	       
	       JPanel panOrderExWest = new JPanel();
	       panOrderExWest.setLayout(null);
	       panOrderExWest.setPreferredSize(new Dimension(250, 580));	//패널 크기 설정
	       panOrderExWest.setBackground(Color.WHITE);
	       panOrderExWest.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	      
	       
	       JLabel lbl_imgLocation = new JLabel(img_location2);
	       lbl_imgLocation.setSize(250, 250);
	       lbl_imgLocation.setLocation(0, 0);
	       
	       JLabel lbl_Location = new JLabel("장소 : " );
	       lbl_Location.setSize(250, 60);
	       lbl_Location.setLocation(10, 250);
	       lbl_Location.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Location.setForeground(new Color(59, 126, 205));

	       JLabel lbl_OrderNumber = new JLabel("주문 번호 : " );
	       lbl_OrderNumber.setSize(250, 60);
	       lbl_OrderNumber.setLocation(10, 300);
	       lbl_OrderNumber.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_OrderNumber.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_GuestName = new JLabel("예약자명 : " );
	       lbl_GuestName.setSize(250, 60);
	       lbl_GuestName.setLocation(10, 350);
	       lbl_GuestName.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_GuestName.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_GuideName = new JLabel("가이드명 : " );
	       lbl_GuideName.setSize(250, 60);
	       lbl_GuideName.setLocation(10, 400);
	       lbl_GuideName.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_GuideName.setForeground(new Color(59, 126, 205));
	     	      
	       
	       panOrderExWest.add(lbl_imgLocation);
	       panOrderExWest.add(lbl_Location);
	       panOrderExWest.add(lbl_OrderNumber);
	       panOrderExWest.add(lbl_GuestName);
	       panOrderExWest.add(lbl_GuideName);
	       
	       JPanel panOrderExEast = new JPanel();
	       panOrderExEast.setLayout(null);
	       panOrderExEast.setBackground(new Color(220, 238, 248));
	       panOrderExEast.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	       JLabel lbl_OrderDate = new JLabel("구매 날짜 : " );
	       lbl_OrderDate.setSize(250, 60);
	       lbl_OrderDate.setLocation(10, 10);
	       lbl_OrderDate.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_OrderDate.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_OrderPrice = new JLabel("구매 가격 : " );
	       lbl_OrderPrice.setSize(250, 60);
	       lbl_OrderPrice.setLocation(10, 70);
	       lbl_OrderPrice.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_OrderPrice.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_Payment = new JLabel("결제 수단 : " );
	       lbl_Payment.setSize(250, 60);
	       lbl_Payment.setLocation(10, 130);
	       lbl_Payment.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Payment.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_TripDate = new JLabel("여행 날짜 : " );
	       lbl_TripDate.setSize(250, 60);
	       lbl_TripDate.setLocation(10, 190);
	       lbl_TripDate.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_TripDate.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_Etc = new JLabel("특이사항 : " );
	       lbl_Etc.setSize(250, 60);
	       lbl_Etc.setLocation(10, 250);
	       lbl_Etc.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Etc.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_Grade = new JLabel("평점 : " );
	       lbl_Grade.setSize(250, 60);
	       lbl_Grade.setLocation(10, 310);
	       lbl_Grade.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	       lbl_Grade.setForeground(new Color(59, 126, 205));
	       
	       JLabel lbl_GoGuide = new JLabel(img_GoGuide);
	       lbl_GoGuide.setSize(250, 150);
	       lbl_GoGuide.setLocation(110, 400);
	       
	       JLabel lbl_GoChat = new JLabel(img_GoChat);
	       lbl_GoChat.setSize(250, 150);
	       lbl_GoChat.setLocation(110, 460);
	       
	       panOrderExEast.add(lbl_OrderDate);
	       panOrderExEast.add(lbl_OrderPrice);
	       panOrderExEast.add(lbl_Payment);
	       panOrderExEast.add(lbl_TripDate);
	       panOrderExEast.add(lbl_Etc);
	       panOrderExEast.add(lbl_Grade);
	       panOrderExEast.add(lbl_GoGuide);
	       panOrderExEast.add(lbl_GoChat);
	       
	       
	       panOrderEx.add(panOrderExWest, BorderLayout.WEST);
	       panOrderEx.add(panOrderExEast, BorderLayout.CENTER);
	      
	       panCenter.add(panOrderEx);
	        add(panCenter, BorderLayout.CENTER);
	    
			
		}

	
	}






