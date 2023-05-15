package frientrip.main;

import frientrip.common.Boilerplate;
import frientrip.login.LoginPanel;

public class Main {

	private static MainFrame mf;	//메인 프레임 객체

	public static void main(String[] args) {
		
		mf = new MainFrame("Login");
		
		Boilerplate.redraw(new LoginPanel());
		
	}
	
	public static MainFrame getMf() {
		
		return mf;
		
	}

}