package frientrip.order;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

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

public class OrderPanel extends JPanel {
	
	private MainFrame mainFrame = null;
	private ImageIcon img_smalllogo;
	private ImageIcon img_Back;
	private ImageIcon img_ordertitle;
	private JButton btnBack;
	
	
	public OrderPanel() {
		
		setLayout(new BorderLayout());
	    
		setSize(1050, 750);
		setBackground(new Color(220, 238, 248));    //배경색 설정
    
		mainFrame = (MainFrame) MainFrame.getMainFrame();	//메인 프레임 객체 주소 저장
    
		mainFrame.setTitle("GuideList");
    
		makeImageIcon();
    
		makeTitle();
		
		makeCenter();
}
		
		private void makeImageIcon() {
			img_ordertitle = new ImageIcon("Frientrip/img/order/img_ordertitle.png");
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
			JLabel lblTitle = new JLabel(img_ordertitle);
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
	        panCenter.setLayout(new BorderLayout());
	        panCenter.setBackground(new Color(213, 251, 200));
	        
	        JPanel panOrder = new JPanel();
	        panOrder.setLayout(null);
	        panOrder.setBackground(new Color(220, 238, 248));
	        //panOrder.setBounds(100, 40, 650, 500);
	        panOrder.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	        
	        ImageIcon img_orderprofile = new ImageIcon("Frientrip/img/order/img_orderprofile.png");
	        JLabel lbl_orderprofile = new JLabel(img_orderprofile);
	        lbl_orderprofile.setSize(187, 255);
	        lbl_orderprofile.setLocation(20, 30);
	        panOrder.add(lbl_orderprofile);
	        
	        JLabel lbl_orderintro = new JLabel("<html>홍길동님의<br>구매내역입니다.</html>");
	        lbl_orderintro.setSize(187, 255);
	        lbl_orderintro.setLocation(20, 230);
	        lbl_orderintro.setFont(new Font("Noto Sans KR", Font.BOLD, 24));
	        lbl_orderintro.setForeground(new Color(59, 126, 205));
	        panOrder.add(lbl_orderintro);

	        
	        JPanel panOrderList = new JPanel();
	        panOrderList.setLayout(null);
	        panOrderList.setBackground(Color.WHITE);
	        panOrderList.setBounds(220, 0, 815, 592);
	        panOrderList.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	       
	        
	        JScrollPane jsp = new JScrollPane(panOrderList,  //스크롤팬 생성
	        		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
	        		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	        jsp.setSize(815,592);
	        jsp.setLocation(220, 0);
	        jsp.setBorder(new EmptyBorder(0,0,0,0));
	        jsp.setBackground(new Color(213, 251, 200));
	        jsp.getVerticalScrollBar().setUnitIncrement(8);
	        panOrder.add(jsp);
	        
	        
	        

			
	       /* ImageIcon img_location = new ImageIcon("Frientrip/img/order/img_location.png");
	        JLabel lbl_location = new JLabel(img_location);
	        lbl_location.setSize(206, 197);
	        lbl_location.setLocation(0, 0);
	        panOrderList.add(lbl_location);
	        
	        
	        
	        JLabel lbl_place = new JLabel("장소 : ");
	        lbl_place.setSize(206, 30);
	        lbl_place.setLocation(5,200);
	        lbl_place.setFont(new Font("Noto Sans KR", Font.BOLD, 23));
	    	lbl_place.setForeground(new Color(59, 126, 205));
	        panOrderList.add(lbl_place);
	        */

		
	        
	    	
	        
	    	    	
	        panCenter.add(panOrder, BorderLayout.CENTER);
	        
	       
	        add(panCenter, BorderLayout.CENTER);
	    
			
		}

	
	}






