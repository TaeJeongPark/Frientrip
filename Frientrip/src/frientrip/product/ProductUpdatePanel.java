package frientrip.product;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import frientrip.main.MainFrame;

	public class ProductUpdatePanel extends JPanel{
	private MainFrame mainFrame = null;
	private ImageIcon img_smalllogo;
	private ImageIcon img_Back;
	private JButton btnBack;
	private ImageIcon img_productupdatetitle;
	private ImageIcon img_updatecomplete;
	
public ProductUpdatePanel() {
	
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
	
	img_productupdatetitle = new ImageIcon("Frientrip/img/product/img_productupdatetitle.png");
	img_smalllogo = new ImageIcon("Frientrip/img/guidelist/img_smalllogo.png");
	img_Back = new ImageIcon("Frientrip/img/guidelist/img_Back.png");
	img_updatecomplete = new ImageIcon("Frientrip/img/product/img_updatecomplete.png");
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
		JLabel lblTitle = new JLabel(img_productupdatetitle);
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

    
	
		Color baseColor =new Color(220, 238, 248);
		Color baseColor2 = new Color(213, 251, 200);

        
        JPanel panCenter = new JPanel(); 
        panCenter.setLayout(null);
        panCenter.setBackground(new Color(213, 251, 200));
        
        JLabel lbl_guest = new JLabel("<html>새로운 상품을<br>등록합니다</html>");
    	lbl_guest.setSize(425, 60);
    	lbl_guest.setLocation(10, 50);
    	lbl_guest.setFont(new Font("Noto Sans KR", Font.BOLD, 25));
    	lbl_guest.setForeground(new Color(19, 133, 99));
    	panCenter.add(lbl_guest); 
    	
    	JPanel panLeft = new JPanel();
    	panLeft.setLayout(null);
    	panLeft.setBackground(new Color(255, 255, 255));
    	panLeft.setSize(231,400);
    	panLeft.setLocation(10, 170);
    	panLeft.setBorder(BorderFactory.createLineBorder(new Color(19, 133, 99, 100), 3)); 
    	
    	JLabel lbl_boxchk = new JLabel("<html>버튼을 선택하여<br>선택한 상품보기</html>" );
    	lbl_boxchk.setSize(425, 60);
    	lbl_boxchk.setLocation(10, 0);
    	lbl_boxchk.setFont(new Font("Noto Sans KR", Font.BOLD, 15));
    	lbl_boxchk.setForeground(new Color(19, 133, 99, 50));
    	panLeft.add(lbl_boxchk); 
    	
    	ButtonGroup bg  = new ButtonGroup(); //라디오 버튼이 하나만 선택될 수 있게 그룹 생성
    	
    	JRadioButton rb_products1 = new JRadioButton("상품 1");
    	rb_products1.setSize(207, 45);
    	rb_products1.setLocation(10, 60);
    	rb_products1.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	rb_products1.setForeground(new Color(19, 133, 99));
    	rb_products1.setBackground(new Color(255, 255, 255));
        rb_products1.setBorderPainted(false); 
    	bg.add(rb_products1); 
    	panLeft.add(rb_products1);
    	
    	JRadioButton rb_products2 = new JRadioButton("상품 2");
    	rb_products2.setSize(207, 45);
    	rb_products2.setLocation(10, 100);
    	rb_products2.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	rb_products2.setForeground(new Color(19, 133, 99));
    	rb_products2.setBackground(new Color(255, 255, 255));
    	rb_products2.setBorderPainted(false); //버튼 테두리 없애기
    	bg.add(rb_products2); 
    	panLeft.add(rb_products2);

    	JRadioButton rb_products3 = new JRadioButton("상품 3");
    	rb_products3.setSize(207, 45);
    	rb_products3.setLocation(10, 140);
    	rb_products3.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	rb_products3.setForeground(new Color(19, 133, 99));
    	rb_products3.setBackground(new Color(255, 255, 255));
    	rb_products3.setBorderPainted(false); //버튼 테두리 없애기
    	bg.add(rb_products3); 
    	panLeft.add(rb_products3);
    	
    	JRadioButton rb_products4 = new JRadioButton("상품 4");
    	rb_products4.setSize(207, 45);
    	rb_products4.setLocation(10, 180);
    	rb_products4.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	rb_products4.setForeground(new Color(19, 133, 99));
    	rb_products4.setBackground(new Color(255, 255, 255));
    	rb_products4.setBorderPainted(false); //버튼 테두리 없애기
    	bg.add(rb_products4); 
    	panLeft.add(rb_products4);
    	
    	JButton btn_updatecomplete = new JButton(img_updatecomplete);
    	
    	btn_updatecomplete.setBounds(85, 340, 138, 46);
    	panLeft.add(btn_updatecomplete);
    	
    	JPanel panRight = new JPanel();
    	panRight.setLayout(null);
    	panRight.setBackground( new Color(220, 238, 248));
    	panRight.setSize(775,565);
    	panRight.setLocation(250, 5);
    	panRight.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255, 100), 3)); 
    	
    	JLabel lbl_prouductintro = new JLabel("상품 소개");
    	lbl_prouductintro.setSize(200, 20 );
    	lbl_prouductintro.setLocation(10, 5);
    	lbl_prouductintro.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_prouductintro.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_prouductintro); 
        
        JTextArea ta_prouductintro = new JTextArea();
	    ta_prouductintro.setSize(360,30);
	    ta_prouductintro.setBackground(Color.WHITE);
	    ta_prouductintro.setLocation(10, 25);
	    ta_prouductintro.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	    panRight.add(ta_prouductintro);
	    
        JLabel lbl_time = new JLabel("예상 시간");
        lbl_time.setSize(200, 20 );
        lbl_time.setLocation(10, 60);
        lbl_time.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_time.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_time); 
        
        JTextArea ta_time = new JTextArea();
	    ta_time.setSize(360,30);
	    ta_time.setBackground(Color.WHITE);
	    ta_time.setLocation(10, 80);
	    ta_time.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	    panRight.add(ta_time);

        JLabel lbl_cost = new JLabel("예상 비용");
        lbl_cost.setSize(200, 20 );
        lbl_cost.setLocation(10, 110);
        lbl_cost.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_cost.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_cost); 
        
        JTextArea ta_cost = new JTextArea();
	    ta_cost.setSize(360,30);
	    ta_cost.setBackground(Color.WHITE);
	    ta_cost.setLocation(10, 130);
	    ta_cost.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	    panRight.add(ta_cost);
    	
        JLabel lbl_etc = new JLabel("특이 사항");
        lbl_etc.setSize(200, 20 );
        lbl_etc.setLocation(10, 160);
        lbl_etc.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_etc.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_etc); 
        
        JTextArea ta_etc = new JTextArea();
	    ta_etc.setSize(360,30);
	    ta_etc.setBackground(Color.WHITE);
	    ta_etc.setLocation(10, 180);
	    ta_etc.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
	    panRight.add(ta_etc);
    	
        ImageIcon img_productimage = new ImageIcon("Frientrip/img/guideexplain/img_productimage.png");
    	JLabel lbl_productimage = new JLabel(img_productimage);
    	lbl_productimage.setSize(381, 360);
    	lbl_productimage.setLocation(0, 220);
    	lbl_productimage.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255, 100), 3));
        panRight.add(lbl_productimage); 
        
      
        JPanel panPlan = new JPanel();
        panPlan.setLayout(null);
    	panPlan.setBackground(new Color(255, 255, 255));
    	panPlan.setBounds(381, 0, 380, 565);
    	panPlan.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255, 100), 3)); 
    	
    	JPanel panPlanList = new JPanel();
        panPlanList.setLayout(null);
     	panPlanList.setBackground(new Color(255, 255, 255));
     	panPlanList.setBounds(0, 0, 380, 170);
     	panPlanList.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255, 100), 3)); 
    	
     	JLabel lbl_Planlocation = new JLabel("장소: ");
        lbl_Planlocation.setSize(200, 50 );
        lbl_Planlocation.setLocation(10, 0);
        lbl_Planlocation.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_Planlocation.setForeground(new Color(59, 126, 205));
        panPlanList.add(lbl_Planlocation); 

        JLabel lbl_Planintro = new JLabel("소개: ");
        lbl_Planintro.setSize(200, 50 );
        lbl_Planintro.setLocation(10, 30);
        lbl_Planintro.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_Planintro.setForeground(new Color(59, 126, 205));
        panPlanList.add(lbl_Planintro); 

        JLabel lbl_Plancost = new JLabel("예상 비용: ");
        lbl_Plancost.setSize(200, 50 );
        lbl_Plancost.setLocation(10, 60);
        lbl_Plancost.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_Plancost.setForeground(new Color(59, 126, 205));
        panPlanList.add(lbl_Plancost); 
    	
        JLabel lbl_Plantime = new JLabel("예상 시간: ");
        lbl_Plantime.setSize(200, 50 );
        lbl_Plantime.setLocation(10, 90);
        lbl_Plantime.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_Plantime.setForeground(new Color(59, 126, 205));
        panPlanList.add(lbl_Plantime); 
    	
        JLabel lbl_Planmove = new JLabel("이동 거리: ");
        lbl_Planmove.setSize(200, 50 );
        lbl_Planmove.setLocation(10, 120);
        lbl_Planmove.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_Planmove.setForeground(new Color(59, 126, 205));
        panPlanList.add(lbl_Planmove); 
        
        JScrollPane jsp = new JScrollPane(panPlanList, 
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setSize(20, 565);
		jsp.setLocation(680, 0);
		jsp.setBackground(new Color(255, 255, 255));
		jsp.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255, 100), 3));
		jsp.getVerticalScrollBar().setUnitIncrement(8); 
    	
    	panPlan.add(panPlanList);
     	panRight.add(panPlan);
     	panRight.add(jsp);
    	
    	panCenter.add(panLeft);
    	panCenter.add(panRight);
    	
	
    
        add(panCenter, BorderLayout.CENTER);
        setVisible(true);
	}
	
	
	

	
}

