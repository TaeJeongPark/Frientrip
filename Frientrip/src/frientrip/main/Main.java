package frientrip.main;

import frientrip.common.Boilerplate;
import frientrip.guidelist.GuideExplainPanel;
import frientrip.guidelist.GuideListPanel;
import frientrip.mypage.MyPagePanel;
import frientrip.order.OrderPanel;

public class Main {

	private static MainFrame mf;	//메인 프레임 객체

	public static void main(String[] args) {
		
		mf = new MainFrame("Login");
		
		Boilerplate.redraw(new OrderPanel());
		
	}
	
	public static MainFrame getMf() {
		
		return mf;
		
	}

}
