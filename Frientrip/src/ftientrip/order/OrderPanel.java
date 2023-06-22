package ftientrip.order;

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

import frientrip.mypage.MyPagePanel;

public class OrderPanel extends JFrame {
	public OrderPanel() {
		
		Color baseColor = new Color(220, 238, 248);
		Color baseColor2 = new Color(213, 251, 200);

	
        JPanel panNorth = new JPanel(); 
        panNorth.setLayout(new BorderLayout());
        panNorth.setBackground(baseColor);
        ImageIcon img_ordertitle = new ImageIcon("img/order/img_ordertitle.png");
        JLabel lbl_ordertitle = new JLabel(img_ordertitle);
        panNorth.add(lbl_ordertitle, BorderLayout.CENTER); 
        
        ImageIcon img_smalllogo = new ImageIcon("img/guidelist/img_smalllogo.png");
        JLabel lbl_logo = new JLabel(img_smalllogo);
        panNorth.add(lbl_logo, BorderLayout.EAST);
        
        JPanel panCenter = new JPanel(); 
        panCenter.setLayout(null);
        panCenter.setBackground(baseColor2);
        
        JPanel panOrder = new JPanel();
        panOrder.setLayout(null);
        panOrder.setBackground(baseColor);
        panOrder.setBounds(100, 40, 850, 500);
        panOrder.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));

        JPanel panOrderList = new JPanel();
        panOrderList.setLayout(null);
        panOrderList.setBackground(Color.WHITE);
        panOrderList.setBounds(220, 0, 630, 500);
        panOrderList.setBorder(BorderFactory.createLineBorder(new Color(128, 209, 255), 3));
        panOrder.add(panOrderList);
        
        ImageIcon img_orderprofile = new ImageIcon("img/order/img_orderprofile.png");
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
        
        ImageIcon img_location = new ImageIcon("img/order/img_location.png");
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
        
        
    	
        
    	    	
        panCenter.add(panOrder);
	
        add(panNorth, BorderLayout.NORTH);
        add(panCenter, BorderLayout.CENTER);
        setVisible(true);
	}





}
