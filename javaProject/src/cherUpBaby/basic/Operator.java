package cherUpBaby.basic;

public class Operator {
	public static void main(String[] args) {
		
		
		
		
	}
}
	
/**
 *    ㅋㅋㅋ
 *  
 *  
 * e.g. ++prefix
 *  int a = 10;               //10     start
 *  System.out.println(a++);  //10++   put
 *  System.out.println(a);	  //11	   increase		
 *  int b = a++;			  //11++   put
 *  System.out.println(a);    //12	   increase		
 *  System.out.println(b);	  //11	   put	
 *  System.out.println(b);	  //11	   put
 *  
 * e.g. postfix++
 *  in case of postfix, it works as you think 
 *  increasing value of variable and being placed after
 *  
 *  int a = 10;               //10     start
 *  System.out.println(++a);  //10++   increase
 *   System.out.println(a);	  //11	   put	
 *   
 * e.g.
 *  int a = 1; 
 *  int b = a++ + a++ + a++ + a++;
 *  System.out.printf("a=%d, b=%d\n", a, b); a = 5 b = 10
 *  =========================================>
 *  a = 1;
 *  a(1) = 1 + 1 + 1 + 1 
 *  
 *  b() = a++ + a++ + a++ + a++                             
 *  b(1)  = [1] + a++ + a++ + a++              1
 *  b(3)  = [1] + [(2)+1] + a++ + a++          1 + 2
 *  b(6)  = [1] + [(2)+1] + [(3)+1] + a++      1 + 2 + 3
 *  b(10) = [1] + [(2)+1] + [(3)+1] + [(4)+1]  1 + 2 + 3 + 4
 *                                         
 *  int a = 1;                                            
 *  System.out.printf("a=%d, c=%d\n", a++, a);  // a=1, a=2
 *  System.out.printf("a=%d, c=%d\n", a, a++);  // a=1, a=1
 * 
 * e.g. boolean return true or false
 *  System.out.printf("10 == 20 ? %b\n", 10 == 20);
 *  System.out.printf("10 != 20 ? %b\n", 10 != 20);
 *  System.out.printf("10 < 20 ? %b\n", 10 < 20);
 *  System.out.printf("10 <= 20 ? %b\n", 10 <= 20);
 *  System.out.printf("10 > 20 ? %b\n", 10 > 20);
 *  System.out.printf("10 >= 20 ? %b\n", 10 >= 20);
 *         
 *  System.out.printf("T && T ? %b\n", true && true);
 *  System.out.printf("T && F ? %b\n", true && false);
 *  System.out.printf("F && T ? %b\n", false && true);
 *  System.out.printf("F && F ? %b\n", false && false); //F && F ? false
 *  System.out.println();
 *  System.out.printf("T || T ? %b\n", true || true);
 *  System.out.printf("T || F ? %b\n", true || false);
 *  System.out.printf("F || T ? %b\n", false || true);
 *  System.out.printf("F || F ? %b\n", false || false); //F || F ? false
 *  
 *  
 * e.g. condition ? expression A : expression B
 * 	System.out.printf("the number is %s \n", (10 % 1 == 0) ? "even" : "odd");
 * 	 //the number is even
 * e.g.int age = 22;
 *  System.out.printf(" %s\n", (age < 18) ? "young" : 
 *    ((age >= 18 && age < 50) ? "adult" : 
 *    ((age >= 50 && age < 65) ? "middle-age" : "old")));
 *  
 * 
 *   +=, -=, *=, /=, %=
 *   
 *   
 *   
 * *
 */