package cherUpBaby.basic;

public class typeConversion {
	public static void main(String[] args) {
		
 
	    int a = 5;
	    int b = 2;

	  System.out.println(5%2);
	  System.out.println((double)5%2);
	}
}

/**
 * e.g.
 * Integer 
 * 	int a = 1;
 *  int b = 2;
 *  int c = a + b;
 *  System.out.println(c); //  3
 * 
 * Float point	
 *  double d = 1.5;
 *  double e = 2.5;
 *  double g = d + e;
 *  System.out.println(g); // 4.0
 * 
 *  ============  (Implicit Cast)  ==========>>>>>>>        
 *char, byte = > short = > int = > long => float => double
 *  <<<<<<<<====  (Explicit Cast)  ==================
 *  
 * e.g. Implicit
 *  int a = 1;
 *  double b = 2.5;
 *  double c = a + c;
 *  System.out.println(c) // 3.5
 *  //automatically  double c = (double)a + b;  
 *  //it just makes Temporary memory(1.0) + b(2.5)
 *  //a is still int 
 *  
 * 
 * e.g. Explicit(값이 짤릴수 있다)
 *  int a = 1;
 *  double b = 2.5;
 *  int c = a + (int)b;
 *  System.out.println(c); // 3
 *  
 *  
 * e.g. Implicit + Explicit
 *  int a = 5;
 *  int b = 2;
 *  
 *  System.out.println(5/2); 2
 *  System.out.println((double)5/2); 2.5
 *  
 *  
 * */
