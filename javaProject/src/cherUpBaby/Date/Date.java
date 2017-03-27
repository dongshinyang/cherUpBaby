package cherUpBaby.Date;

public class Date {



	public static void main(String[] args) {

		java.util.Date udilDate = new java.util.Date(System.currentTimeMillis());
		System.out.println(udilDate); //Mon Mar 27 18:14:28 KST 2017

		java.sql.Date SqlDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println(SqlDate); //2017-03-27

		

		}



	}
