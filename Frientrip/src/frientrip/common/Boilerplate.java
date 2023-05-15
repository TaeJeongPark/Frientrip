package frientrip.common;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

import javax.swing.JPanel;

import frientrip.main.Main;

/**
* @packageName   : frientrip.common
* @fileName      : Boilerplate.java
* @author        : Taejeong Park
* @date          : 2023.05.15
* @description   : 보일러플레이트
* ===========================================================
* DATE              AUTHOR				NOTE
* -----------------------------------------------------------
* 2023.05.15        Taejeong Park		최초 생성
* 2023.05.15		Taejeong Park		구현 완료
*/
public class Boilerplate {
	
	//유효성 검사
	
	//ID 유효성 검사 : 영문, 숫자 조합의 5자리 이상 12자리 이하로 사용 가능하며, 첫 자리에 숫자 사용 불가능
	public static boolean idValidation(String str) {
		
		return Pattern.matches("^[a-zA-Z0-9]{5,12}$", str) && !Pattern.matches("^[0-9]$", str.substring(0, 1));
		
	}
	
	//PW 유효성 검사 : 영문, 숫자, 특수문자 조합의 8자리 이상 15자리 이하로 사용 가능
	public static boolean pwValidation(String str) {
		
		return Pattern.matches("^[a-zA-Z0-9!@#$]{8,15}$", str);
		
	}
	
	//휴대폰번호 유효성 검사 : 숫자 10자리 이상 11자리 이하로 사용 가능
	public static boolean phonNumValidation(String str) {
		
		return Pattern.matches("^[0-9]{10,11}$", str);
		
	}
	
	//인증번호 유효성 검사 : 숫자 6자리
	public static boolean certifiNumValidation(String str) {
		
		return Pattern.matches("^[0-9]{6,6}$", str);
		
	}
	
	
	//생성
	
	//숫자 6자리 인증번호 생성
	public static int certificationNum() {
		
        return ThreadLocalRandom.current().nextInt(100000, 1000000);
        
    }
	
	//천단위 구분 기호 생성
	public static String setComma(int num) {
		
		DecimalFormat df = new DecimalFormat("###,###");
		String money = df.format(num);
		
		return money;
		
	}
	
	//패널 화면 전환
	public static void redraw(JPanel panel) {
		
		if(Main.getMf() != null) Main.getMf().remove(Main.getMf().getCurrentPanel());
		Main.getMf().setCurrentPanel(panel);
		Main.getMf().add(Main.getMf().getCurrentPanel());
		Main.getMf().getContentPane().setVisible(false);
		Main.getMf().getContentPane().setVisible(true);
		
	}
	
}
