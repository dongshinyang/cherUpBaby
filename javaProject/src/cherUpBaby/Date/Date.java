package cherUpBaby.Date;

import java.text.DateFormat;
import java.util.Calendar;

public class Date {
 
	

	public static void main(String[] args) {
	   
		java.util.Date udilDate = new java.util.Date(System.currentTimeMillis());
		System.out.println(udilDate); //Mon Mar 27 18:14:28 KST 2017
		
		java.sql.Date SqlDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println(SqlDate); //2017-03-27
		
	    Calendar cal = Calendar.getInstance(); // 현재 날짜 및 시간 정보를 가진 달력 객체 생성.
	    
	    //1) 기본 출력 형식 => 현재 OS에 설정된 국가, 언어, 날짜 형식으로 따른다. 
	    DateFormat df = DateFormat.getDateInstance();
	    String str = df.format(cal.getTime());
	    System.out.println(str); //2017. 3. 27
	    
	    //2) 다른 출력 형식
	    df = DateFormat.getDateInstance(DateFormat.FULL);
	    str = df.format(cal.getTime());
	    System.out.println(str); //2017년 3월 27일 월요일
	}
}
