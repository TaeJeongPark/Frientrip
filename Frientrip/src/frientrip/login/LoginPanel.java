package frientrip.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LoginPanel extends JPanel{

	public LoginPanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(220,238,248));
		setpanel();
		
	}
	public void setpanel() {
		JPanel panelButton = new JPanel(new BorderLayout());
		JPanel panelLogo = new JPanel(new BorderLayout());
		JPanel panelNorth = new JPanel(new BorderLayout());
		JPanel panel4 = new JPanel(new BorderLayout());
		JPanel panel5 = new JPanel(new BorderLayout());
		JPanel panel6 = new JPanel(new BorderLayout());
		JPanel panel7 = new JPanel(new BorderLayout());
		JPanel panelRadioButton = new JPanel();
		
		panelButton.setBackground(new Color(220,238,248));
		
		panelLogo.setBackground(new Color(220,238,248));
		
		panelNorth.setBackground(new Color(220,238,248));
		
		panel4.setBackground(new Color(0,220,0));
		
		panel5.setBackground(new Color(0,0,220));
		
		panel6.setBackground(new Color(220,0,0));
		
		panel7.setBackground(new Color(0,0,0));
		
		panelRadioButton.setBackground(new Color(220,238,248));
		
		panelButton.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		panel6.setPreferredSize(new Dimension(100,100));
		panel7.setPreferredSize(new Dimension(400,100));
		panelNorth.setPreferredSize(new Dimension(100,200));
		panel4.setPreferredSize(new Dimension(100,200));
		panelLogo.setPreferredSize(new Dimension(600,100));
		
		JButton enter = new JButton(new ImageIcon("Frientrip/img/join/img_enter.png"));
		JLabel logo = new JLabel(new ImageIcon("Frientrip/img/common/img_title.png"));
		
		JRadioButton  tourist = new JRadioButton("관광객");
		JRadioButton  guide = new JRadioButton("가이드");
		tourist.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
		guide.setFont(new Font("Noto Sans KR", Font.BOLD, 18));
		ButtonGroup  group = new ButtonGroup();
		group.add(tourist);  
		group.add(guide);
		
		tourist.setBackground(new Color(220,238,248));
		guide.setBackground(new Color(220,238,248));
		
		enter.setBorderPainted(false); //버튼 테두리 없애기
		enter.setContentAreaFilled(false); //버튼 배경 없애기
		
		panelLogo.add(logo);
		panelButton.add(enter);
		panelButton.add(panel5, BorderLayout.NORTH);
		panelButton.add(panel6, BorderLayout.SOUTH);
		
		panelRadioButton.add(tourist);
		panelRadioButton.add(guide);
		
		panelNorth.add(panelRadioButton, BorderLayout.SOUTH);
		
		panel7.add(panelButton, BorderLayout.EAST);
		panel7.add(panelNorth, BorderLayout.NORTH);
		panel7.add(panel4, BorderLayout.SOUTH);
		
		add(panel7, BorderLayout.EAST);
		add(panelLogo, BorderLayout.WEST);
		
	}
}