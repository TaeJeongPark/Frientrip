package frientrip.main;

import frientrip.chat.ChatPanel;
import frientrip.common.Boilerplate;
import frientrip.guidelist.GuideExplainPanel;
import frientrip.guidelist.GuideListPanel;
import frientrip.mypage.MyPagePanel;
import frientrip.order.OrderExplainPanel;
import frientrip.order.OrderPanel;
import frientrip.product.ProductListPanel;
import frientrip.product.ProductUpdatePanel;
import frientrip.profileupdate.ProfileUpdatePanel;

public class Main {

	private static MainFrame mf;	//메인 프레임 객체

	public static void main(String[] args) {
		
		mf = new MainFrame("Login");
		
		Boilerplate.redraw(new MainPanel());
		
	}
	
	public static MainFrame getMf() {
		
		return mf;
		
	}

}
