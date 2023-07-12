package frientrip.guidelist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import frientrip.main.MainFrame;

public class GuideListPanel extends JPanel implements MouseListener {
	
	private MainFrame mainFrame = null;
	private ImageIcon img_guidetitle;
	private ImageIcon img_smalllogo;
	private ImageIcon img_EXprofile;
	private ImageIcon img_goprofile;
	private ImageIcon img_SL;
	private ImageIcon img_GGIC;
	private ImageIcon img_GW;
	private ImageIcon img_JLCC;
	private ImageIcon img_GSBS;
	private ImageIcon img_JJ;	//메인 프레임 객체
	private JPanel pnBackground;
	private JPanel pnListBack;
	private JPanel pnList;
	private int iListnum;
	private JButton btnBack;
	private JPanel pnListNothing;
	private ImageIcon img_Back;
	
	public GuideListPanel() {
		
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
		img_guidetitle = new ImageIcon("Frientrip/img/guidelist/img_guidetitle.png");
		img_smalllogo = new ImageIcon("Frientrip/img/guidelist/img_smalllogo.png");
		img_EXprofile = new ImageIcon("Frientrip/img/guidelist/img_EXprofile.png");
		img_goprofile = new ImageIcon("Frientrip/img/guidelist/img_goprofile.png");
		img_SL = new ImageIcon("Frientrip/img/guidelist/img_SL.png");
		img_GGIC = new ImageIcon("Frientrip/img/guidelist/img_GGIC.png");
		img_GW = new ImageIcon("Frientrip/img/guidelist/img_GW.png");
		img_JLCC = new ImageIcon("Frientrip/img/guidelist/img_JLCC.png");
		img_GSBS = new ImageIcon("Frientrip/img/guidelist/img_GSBS.png");
		img_JJ = new ImageIcon("Frientrip/img/guidelist/img_JJ.png");
		img_Back = new ImageIcon("Frientrip/img/guidelist/img_Back.png");
	}
		
	

	//타이틀 영역 생성
	private void makeTitle() {

		JPanel pnTitleBackground = new JPanel();
		pnTitleBackground.setLayout(new BorderLayout());
		pnTitleBackground.setBackground(new Color(220, 238, 248));		//패널 색상 배경색과 동일하게 설정
		
		
		//타이틀 생성
		JPanel pnTitle = new JPanel();
		pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnTitle.setBorder(new EmptyBorder(0, 150, 0, 120));	//패널 패딩 설정
		pnTitle.setBackground(new Color(220, 238, 248));		//패널 색상 배경색과 동일하게 설정
		JLabel lblTitle = new JLabel(img_guidetitle);
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
		pnBackground = new JPanel();
		pnBackground.setLayout(new BorderLayout());
		pnBackground.setBackground(new Color(213, 251, 200));		//패널 색상 배경색과 동일하게 설정
		
		pnListBack = new JPanel();
		pnListBack.setLayout(null);
		pnListBack.setLocation(100, 20);
		pnListBack.setBackground(new Color(213, 251, 200));
		
		pnList = new JPanel();
		pnList.setLayout(null);
		pnList.setBackground(Color.WHITE);
		
		addListPanels();
		
		if(iListnum>=8) pnList.setPreferredSize(new Dimension(850, 100*iListnum));
		//가이드프로필 개수에 따라 세로로 스크롤할 수 있는 크기로 패널을 설정
		else if(iListnum>=0&&iListnum<8) pnList.setPreferredSize(new Dimension(850, 100*5));
		//가이드 프로필의 개수가 0 이상이면서 8 미만이면,
		//pnList 패널의 크기를 new Dimension(850, 100*5)으로 설정
		//가이드 프로필의 개수에 상관없이 세로로 7개의 아이템을 보여줄 수 있는 크기로 패널을 설정
		
		JScrollPane jsp = new JScrollPane(pnList,  //스크롤팬 생성
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setSize(900,562);
		jsp.setLocation(0, 5);
		jsp.setBorder(new EmptyBorder(0,50,0,0));
		jsp.setBackground(new Color(213, 251, 200));
		jsp.getVerticalScrollBar().setUnitIncrement(8);
		pnListBack.add(jsp);
		
		pnBackground.add(pnListBack, BorderLayout.CENTER);
		
		JPanel pnBtns = new JPanel(); 
	    pnBtns.setLayout(new GridLayout(6, 1));
	    pnBtns.setBackground(new Color(213, 251, 200));
	        
	    JButton btn_SL = new JButton(img_SL);
	    JButton btn_GGIC = new JButton(img_GGIC);
	    JButton btn_GW = new JButton(img_GW);
	    JButton btn_JLCC = new JButton(img_JLCC);
	    JButton btn_GSBS = new JButton(img_GSBS);
	    JButton btn_JJ = new JButton(img_JJ);
	        
	    JButton btns[] = {btn_SL, btn_GGIC, btn_GW, btn_JLCC, btn_GSBS, btn_JJ} ;
	    for(int i = 0; i < 6; i++) {
	    btns[i].setBackground(new Color(220, 238, 248));
	    btns[i].setBorderPainted(false);//버튼 테두리 없애기
	    btns[i].setContentAreaFilled(false); //버튼 영역 채우기 안함
	    pnBtns.add(btns[i], BorderLayout.EAST);
	    pnBtns.setBorder(new EmptyBorder(0,0,0,0));
	    
	    pnBackground.add(pnBtns, BorderLayout.EAST);
	    }
	    
		add(pnBackground, BorderLayout.CENTER);
		
	}


	private void addListPanels() {
		if(iListnum==0)  //조회된 예약 개수가 없을 경우
		{
			pnListNothing = new JPanel();
			pnListNothing.setLayout(null);
			pnListNothing.setSize(837,100*5);
			pnListNothing.setLocation(0,0);
			pnListNothing.setBackground(Color.WHITE);
			
			JLabel lblNothing = new JLabel("주문 내역이 없습니다");
			lblNothing.setSize(250,20);
			lblNothing.setLocation(20, 20);
			lblNothing.setFont(new Font("D2Coding",Font.PLAIN,15));
			pnListNothing.add(lblNothing);
			
			pnList.add(pnListNothing);
			return;
		}
		
		/*	//pnListInner 라는 큰 배열에 정보를 담은 다른 라벨 배열들 넣기
		    pnListInner = new JPanel[iListnum]; 
		    for (int i = 0; i < iListnum; i++) {
			pnListInner[i] = new JPanel();  //리스트 패널 한 칸 생성
			pnListInner[i].setLayout(null);
			pnListInner[i].setSize(850,100);
			pnListInner[i].setLocation(0, 44*i);
			pnListInner[i].setBackground(Color.WHITE);
			pnListInner[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
			pnListInner[i].addMouseListener(this);
			
			lblResvNum[i] = new JLabel(sResvNum[i]); //리스트 패널에 예약번호 추가
			lblResvNum[i].setSize(147,20);
			lblResvNum[i].setLocation(85, 12);
			lblResvNum[i].setFont(new Font("D2Coding",Font.PLAIN,15));
			pnListInner[i].add(lblResvNum[i]);
			
			lblResvLoc[i] = new JLabel(sResvLoc[i]); //리스트 패널에 예약 위치 추가 
			lblResvLoc[i].setSize(147,20);
			lblResvLoc[i].setLocation(320, 12);
			lblResvLoc[i].setFont(new Font("D2Coding",Font.PLAIN,15));
			pnListInner[i].add(lblResvLoc[i]);
			
			lblResvUniv[i] = new JLabel(sResvUniv[i]); //리스트 패널에 대학명 추가
			lblResvUniv[i].setSize(173,20);
			lblResvUniv[i].setLocation(490, 12);
			lblResvUniv[i].setFont(new Font("D2Coding",Font.PLAIN,15));
			pnListInner[i].add(lblResvUniv[i]);

			lblResvStatus[i] = new JLabel(sResvStatus[i]); //리스트 패널 에약 상태 추가
			lblResvStatus[i].setSize(173,20);
			lblResvStatus[i].setLocation(700, 12);
			lblResvStatus[i].setFont(new Font("D2Coding",Font.PLAIN,15));
			pnListInner[i].add(lblResvStatus[i]);
			
			pnList.add(pnListInner[i]);
			
			
		}*/
		

	
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
