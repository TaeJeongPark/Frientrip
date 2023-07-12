package frientrip.guidelist;

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
import javax.swing.border.EmptyBorder;

import frientrip.main.MainFrame;

	public class GuideExplainPanel extends JPanel{
	private MainFrame mainFrame = null;
	private ImageIcon img_guideexlaintitle;
	private ImageIcon img_smalllogo;
	private ImageIcon img_Back;
	private JButton btnBack;
	
public GuideExplainPanel() {
	
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
	
	img_guideexlaintitle = new ImageIcon("Frientrip/img/guideexplain/img_guideexplaintitle.png");
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
		JLabel lblTitle = new JLabel(img_guideexlaintitle);
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
        
        ImageIcon img_EXprofile = new ImageIcon("Frientrip/img/guideexplain/img_EXprofile.png");
    	JLabel lbl_profile = new JLabel(img_EXprofile);
    	lbl_profile.setSize(137, 160);
    	lbl_profile.setLocation(10, 10);
        panCenter.add(lbl_profile);        
        
        JLabel lbl_name = new JLabel("이름: ");
        lbl_name.setSize(425, 25);
        lbl_name.setLocation(150, 10);
        lbl_name.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_name.setForeground(new Color(19, 133, 99));
        panCenter.add(lbl_name); 
   
    	JLabel lbl_language = new JLabel("언어: ");
    	lbl_language.setSize(425, 25);
    	lbl_language.setLocation(150, 40);
    	lbl_language.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_language.setForeground(new Color(19, 133, 99));
    	panCenter.add(lbl_language); 

    	JLabel lbl_location = new JLabel("지역: ");
    	lbl_location.setSize(425, 25);
    	lbl_location.setLocation(150, 70);
    	lbl_location.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_location.setForeground(new Color(19, 133, 99));
    	panCenter.add(lbl_location); 

    	JLabel lbl_score = new JLabel("평점: ");
    	lbl_score.setSize(425, 25);
    	lbl_score.setLocation(150, 100);
    	lbl_score.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_score.setForeground(new Color(19, 133, 99));
    	panCenter.add(lbl_score); 
    	
    	JPanel panLeft = new JPanel();
    	panLeft.setLayout(null);
    	panLeft.setBackground(new Color(255, 255, 255));
    	panLeft.setSize(231,400);
    	panLeft.setLocation(10, 175);
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
    	
    	ImageIcon img_gochat = new ImageIcon("Frientrip/img/guideexplain/img_gochat.png");
    	JButton btn_gochat = new JButton(img_gochat);
    	
    	btn_gochat.setBounds(89, 340, 138, 46);
    	panLeft.add(btn_gochat);
    	
    	JPanel panRight = new JPanel();
    	panRight.setLayout(null);
    	panRight.setBackground( new Color(220, 238, 248));
    	panRight.setSize(775,565);
    	panRight.setLocation(250, 10);
    	panRight.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255, 100), 3)); 
    	
    	JLabel lbl_prouductintro = new JLabel("상품 소개: ");
    	lbl_prouductintro.setSize(200, 50 );
    	lbl_prouductintro.setLocation(10, 0);
    	lbl_prouductintro.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_prouductintro.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_prouductintro); 

        JLabel lbl_time = new JLabel("예상 시간: ");
        lbl_time.setSize(200, 50 );
        lbl_time.setLocation(10, 50);
        lbl_time.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_time.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_time); 

        JLabel lbl_cost = new JLabel("예상 비용: ");
        lbl_cost.setSize(200, 50 );
        lbl_cost.setLocation(10, 100);
        lbl_cost.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_cost.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_cost); 
    	
        JLabel lbl_etc = new JLabel("특이 사항: ");
        lbl_etc.setSize(200, 50 );
        lbl_etc.setLocation(10, 150);
        lbl_etc.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
        lbl_etc.setForeground(new Color(59, 126, 205));
        panRight.add(lbl_etc); 
    	
        ImageIcon img_productimage = new ImageIcon("Frientrip/img/guideexplain/img_productimage.png");
    	JLabel lbl_productimage = new JLabel(img_productimage);
    	lbl_productimage.setSize(381, 360);
    	lbl_productimage.setLocation(0, 200);
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
        
        JScrollPane jsp = new JScrollPane(panPlan, 
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setSize(20, 565);
		jsp.setLocation(380, 0);
		jsp.setBackground(new Color(255, 255, 255));
		jsp.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255, 100), 3));
	//	jsp.getVerticalScrollBar().setUnitIncrement(8); //스크롤바 안나오는 이유..
    	
    	panPlan.add(panPlanList);
     	panRight.add(panPlan);
    	
    	panCenter.add(panLeft);
    	panCenter.add(panRight);
    	
	
    
        add(panCenter, BorderLayout.CENTER);
        setVisible(true);
	}
	
	
	

	
}

