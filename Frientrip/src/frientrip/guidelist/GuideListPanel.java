package frientrip.guidelist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GuideListPanel extends JPanel {
	
	public GuideListPanel() {
		
		Color baseColor =new Color(220, 238, 248);
		Color baseColor2 = new Color(213, 251, 200);
        
        JPanel panNorth = new JPanel(); 
        panNorth.setLayout(new BorderLayout());
        panNorth.setBackground(baseColor);
        ImageIcon img_guidetitle = new ImageIcon("img/guidelist/img_guidetitle.png");
        JLabel lbl_guidetitle = new JLabel(img_guidetitle);
        panNorth.add(lbl_guidetitle, BorderLayout.CENTER); 
        
        ImageIcon img_smalllogo = new ImageIcon("img/guidelist/img_smalllogo.png");
        JLabel lbl_logo = new JLabel(img_smalllogo);
        panNorth.add(lbl_logo, BorderLayout.EAST);
        
        JPanel panCenter = new JPanel(); 
        panCenter.setLayout(null);
        panCenter.setBackground(baseColor2);
        
        JPanel panList = new JPanel();
        panList.setLayout(null);
        panList.setBackground(baseColor);
        panList.setBounds(177, 10, 600, 560);
    	panList.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

    	ImageIcon img_EXprofile = new ImageIcon("img/guidelist/img_EXprofile.png");
    		
    	JLabel lbl_profile = new JLabel(img_EXprofile);
    	lbl_profile.setSize(168, 198);
    	lbl_profile.setLocation(0, 0);
    		
    	JLabel lbl_guidename = new JLabel("이름:");
    	lbl_guidename.setSize(425, 25);
    	lbl_guidename.setLocation(168, 5);
    	lbl_guidename.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_guidename.setForeground(new Color(59, 126, 205));
    	
    	JLabel lbl_guidelocation = new JLabel("가이드 지역:");
    	lbl_guidelocation.setSize(425, 25);
    	lbl_guidelocation.setLocation(168+100, 5);
    	lbl_guidelocation.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_guidelocation.setForeground(new Color(59, 126, 205));
    	
    	ImageIcon img_goprofile = new ImageIcon("img/guidelist/img_goprofile.png");
    	JButton btn_goprofile = new JButton(img_goprofile);
    	btn_goprofile.setBounds(540, 5, 30, 30);
    	btn_goprofile.setBackground(baseColor);
        btn_goprofile.setBorderPainted(false);  
        
        JLabel lbl_introduce = new JLabel("* 소개:");
    	lbl_introduce.setSize(425, 25);
    	lbl_introduce.setLocation(168, 30);
    	lbl_introduce.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_introduce.setForeground(new Color(59, 126, 205));
   
    	JLabel lbl_guidetheme = new JLabel("* 가이드 테마:");
    	lbl_guidetheme.setSize(425, 25);
    	lbl_guidetheme.setLocation(168, 90);
    	lbl_guidetheme.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_guidetheme.setForeground(new Color(59, 126, 205));

    	JLabel lbl_review = new JLabel("* 이용 후기:");
    	lbl_review.setSize(425, 25);
    	lbl_review.setLocation(168, 150);
    	lbl_review.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
    	lbl_review.setForeground(new Color(59, 126, 205));
    	
    	/*JScrollPane scr = new JScrollPane(panList, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS, JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    	scr.setBounds(22, 590);*/
    	
    		
    		
    		panList.add(lbl_profile);
    		panList.add(lbl_guidename);
    		panList.add(lbl_guidelocation);
    		panList.add(btn_goprofile);
    		
    		panList.add(lbl_introduce);
    		panList.add(lbl_guidetheme);
    		panList.add(lbl_review);
    		//panList.add(scr);
    		
    		panCenter.add(panList);
        
        //리스트와 스크롤바 해결
        
        panCenter.add(panList);
        
        
        JPanel panEast = new JPanel(); 
        panEast.setLayout(new GridLayout(0, 1));
        panEast.setBackground(baseColor2);
        
        
        ImageIcon img_SL = new ImageIcon("img/guidelist/img_SL.png");
        ImageIcon img_GGIC = new ImageIcon("img/guidelist/img_GGIC.png");
        ImageIcon img_GW = new ImageIcon("img/guidelist/img_GW.png");
        ImageIcon img_JLCC = new ImageIcon("img/guidelist/img_JLCC.png");
        ImageIcon img_GSBS = new ImageIcon("img/guidelist/img_GSBS.png");
        ImageIcon img_JJ = new ImageIcon("img/guidelist/img_JJ.png");
        
        JButton btn_SL = new JButton(img_SL);
        JButton btn_GGIC = new JButton(img_GGIC);
        JButton btn_GW = new JButton(img_GW);
        JButton btn_JLCC = new JButton(img_JLCC);
        JButton btn_GSBS = new JButton(img_GSBS);
        JButton btn_JJ = new JButton(img_JJ);
        
        JButton btns[] = {btn_SL, btn_GGIC, btn_GW, btn_JLCC, btn_GSBS, btn_JJ} ;
        for(int i = 0; i < 6; i++) {
        btns[i].setBackground(baseColor);
        btns[i].setBorderPainted(false);//버튼 테두리 없애기
        btns[i].setContentAreaFilled(false); //버튼 영역 채우기 안함
        panEast.add(btns[i], BorderLayout.EAST);
        }
        
        
	
	
	
        add(panNorth, BorderLayout.NORTH);
        add(panCenter, BorderLayout.CENTER);
        add(panEast, BorderLayout.EAST);
        setVisible(true);
	}
	

}
