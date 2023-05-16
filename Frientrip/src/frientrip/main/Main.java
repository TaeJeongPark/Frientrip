package frientrip.main;

import frientrip.common.Boilerplate;
import frientrip.login.LoginPanel;

/**
* @packageName   : frientrip.main
* @fileName      : Main.java
* @author        : Taejeong Park
* @date          : 2023.05.15
* @description   : 메인 함수 클래스
* ===========================================================
* DATE              AUTHOR            NOTE
* -----------------------------------------------------------
* 2023.05.15        Taejeong Park      최초 생성
* 2023.05.15        Taejeong Park      구현 완료
*/
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
