package frientrip.mypage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyPagePanel extends JPanel {
	
	public MyPagePanel() {
		
		Color baseColor = new Color(220, 238, 248);
		Color baseColor2 = new Color(213, 251, 200);

		
      
        JPanel panNorth = new JPanel(); 
        panNorth.setLayout(new BorderLayout());
        panNorth.setBackground(baseColor);
        ImageIcon img_mypagetitle = new ImageIcon("img/mypage/img_mypagetitle.png");
        JLabel lbl_mypagetitle = new JLabel(img_mypagetitle);
        panNorth.add(lbl_mypagetitle, BorderLayout.CENTER); 
        
        ImageIcon img_smalllogo = new ImageIcon("img/guidelist/img_smalllogo.png");
        JLabel lbl_logo = new JLabel(img_smalllogo);
        panNorth.add(lbl_logo, BorderLayout.EAST);
        
        JPanel panCenter = new JPanel(); 
        panCenter.setLayout(null);
        panCenter.setBackground(baseColor2);
        
        JPanel panList = new JPanel();
        panList.setLayout(null);
        panList.setBackground(baseColor);
        panList.setBounds(100, 40, 850, 500);
    	panList.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
    	
    	ImageIcon img_profile = new ImageIcon("img/mypage/img_profile.png");
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
   
        ImageIcon img_iconbiils = new ImageIcon("img/mypage/img_iconbills.png");
    	JButton btn_iconbiils = new JButton(img_iconbiils);
    	btn_iconbiils.setSize(200, 200);
    	btn_iconbiils.setLocation(440, 30);
        btn_iconbiils.setBackground(baseColor);
        btn_iconbiils.setBorderPainted(false);
        panList.add(btn_iconbiils); 
    	
        ImageIcon img_iconrecharge = new ImageIcon("img/mypage/img_iconrecharge.png");
    	JButton btn_iconrecharge = new JButton(img_iconrecharge);
    	btn_iconrecharge.setSize(200, 200);
    	btn_iconrecharge.setLocation(640, 30);
        btn_iconrecharge.setBackground(baseColor);
        btn_iconrecharge.setBorderPainted(false);
        panList.add(btn_iconrecharge); 

        ImageIcon img_iconprofile = new ImageIcon("img/mypage/img_iconprofile.png");
        JButton btn_iconprofile = new JButton(img_iconprofile);
        btn_iconprofile.setSize(200, 200);
        btn_iconprofile.setLocation(440, 250);
        btn_iconprofile.setBackground(baseColor);
        btn_iconprofile.setBorderPainted(false);
        panList.add(btn_iconprofile); 
   
        ImageIcon img_icongain = new ImageIcon("img/mypage/img_icongain.png");
        JButton btn_icongain = new JButton(img_icongain);
        btn_icongain.setSize(200, 200);
        btn_icongain.setLocation(640, 250);
        btn_icongain.setBackground(baseColor);
        btn_icongain.setBorderPainted(false);
        panList.add(btn_icongain); 
    	
        panCenter.add(panList);
	
        add(panNorth, BorderLayout.NORTH);
        add(panCenter, BorderLayout.CENTER);
        setVisible(true);
	}

	
}
