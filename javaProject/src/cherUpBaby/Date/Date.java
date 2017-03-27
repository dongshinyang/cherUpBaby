package cherUpBaby.Date;

public class Date {
 

	public static void main(String[] args) {
	   
		java.util.Date udilDate = new java.util.Date(System.currentTimeMillis());
		System.out.println(udilDate);
		
		java.sql.Date SqlDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println(SqlDate);
		
	}
}
