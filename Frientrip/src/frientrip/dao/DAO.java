package frientrip.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import frientrip.main.MainFrame;

/**
* @packageName   : frientrip.dao
* @fileName      : DAO.java
* @author        : Taejeong Park
* @date          : 2023.05.16
* @description   : 데이터베이스 접근 클래스
* ===========================================================
* DATE              AUTHOR            NOTE
* -----------------------------------------------------------
* 2023.05.15        Taejeong Park      최초 생성
* 2023.05.15		Taejeong Park      구현 완료
* 2023.05.16		Taejeong Park      오류 Alert 기능 추가
*/
public class DAO {

	public static Connection conn;
	public static Statement stmt;

	public static void init() {
		
		try {
			//MySQL DB용 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//DB연결
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/frientrip?serverTimezone=UTC", 
					"root", 
					"Mbctp2149**");
			
			stmt = conn.createStatement();
			
			System.out.println("(DB) DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("(DB) 예외 발생 : 해당 드라이버가 없습니다.");
			e.printStackTrace();
			connFailAlert();
		} catch (SQLException e) {
			System.out.println("(DB) 예외 발생 : 접속 정보 확인이 필요합니다.");
			e.printStackTrace();
			connFailAlert();
		}
		
	}

	//조회용
	public static ResultSet getResult(String sql) {
		try {
			stmt = conn.createStatement();
			System.out.println("(DB) Statement 객체 생성 성공");
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("(DB) 예외 발생 : DB 조회에 실패했습니다.");
			e.printStackTrace();
			connFailAlert();
			return null;
		}
	}
	
	//수정용
	public static void executeSQL(String sql) {
		try {
			stmt = conn.createStatement();
			System.out.println("(DB) Statement 객체 생성 성공");
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("(DB) 예외 발생 : DB 수정에 실패했습니다.");
			e.printStackTrace();
			connFailAlert();
		}
	}
	
	//DB 연결 종료
	public static void closeDB(Connection conn, Statement stmt) {
		try {
			stmt.close();
			conn.close();
			System.out.println("(DB) DB 연결 종료 성공");
		} catch (SQLException e) {
			System.out.println("(DB) 예외 발생 : DB 연결 종료에 실패했습니다.");
			e.printStackTrace();
			connFailAlert();
		}
	}
	
	//오류 메시지 출력 Alert
	private static void connFailAlert() {
		JOptionPane.showMessageDialog((MainFrame) MainFrame.getMainFrame(), "서버 접속에 실패했습니다.\n다시 시도해주세요.", "접속 실패", JOptionPane.ERROR_MESSAGE);
	}
	
}
