package cherUpBaby;

import java.sql.Date;

public class MakeDate {
	static final Date sql_Date = new Date(System.currentTimeMillis());

	public static void main(String[] args) {
	java.util.Date util_Date = new java.util.Date(System.currentTimeMillis()); 	
		
	System.out.println(sql_Date);  // 2017-03-27
	System.out.println(util_Date); // Mon Mar 27 14:34:41 KST 2017
	
	}
}
