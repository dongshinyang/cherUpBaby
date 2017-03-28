package cherUpBaby.basic;

public class Char_String {
	public static void main(String[] args) {
		
		String s = "string";
		char[] chars = s.toCharArray();
		for (int i = 0; i <chars.length; i++) {
			System.out.println(chars[i]);
		}
		
	}

}


/**
 *  //주제: 메모리를 사용하는 방법 - 부동소수점 값 저장
  * double v1 = 3.14;
    double v2 = .14;
    double v3 = 3.;
    System.out.printf("v1 = %f\n", v1); // v1 = 3.140000
    System.out.printf("v2 = %f\n", v2); // v2 = 0.140000
    System.out.printf("v3 = %f\n", v3); // v3 = 3.000000
  *
 	//주제: 메모리를 사용하는 방법 - 문자 값 저장
  * char v1 = 0x41;   // 'A'의 Unicode(UTF-16) 값
    char v2 = 0xAC00; // '가'의 Unicode(UTF-16) 값
    char v3 = 0x31;   // '1'의 Unicode(UTF-16) 값
    char v4 = '공'; // '공'의 Unicode(UTF-16) 값
    //1) v4 = '공';
    //2) v4 = 44277; <-- 공 이라는 문자의 Unicode 값이 그 자리에 놓인다.
    //3) v4 메모리에 저장되는 값은 44277이다.

    System.out.printf("v1 = %c\n", v1);		 v1 = A 
    System.out.printf("v2 = %c\n", v2); 	 v2 = 가
    System.out.printf("v3 = %c\n", v3); 	 v3 = 1
    System.out.printf("v4 = %c\n", v4); 	 v4 = 공
    System.out.printf("v4 = %d\n", (int)v4); v4 = 44277

    System.out.printf("A == 65 ? %b\n", 'A' == 65); true
    
      char[] ch = new char[8];
	  ch[0] ='c';   //	c
	  ch[1]= 0xc;   //	
	  ch[2] = 1;    //	
	  ch[3] = 0x1;  //	
	  ch[4] = 2;    //	
	  ch[5] = 0x2;	//	
	  ch[6] = 65; 	//	A
	  ch[7] = 'A';	//	A
	  
	  for (char ch1 : ch) {
		  System.out.println(ch1);
	  } 
	  
 * e.g. String to charArray  
 *   String ch = "string";
 * 	 char[] chars = s.toCharArray();
 *   => [s][t][r][i][n][g] 
 *   
 * e.g. UpperCase, LowerCase  
 *    char[] chars = s.toUpperCase().toCharArray();
 *   => [S][T][R][I][N][G]  
 * 
 * 
 * 
 * 
 * e.g. argument
 *   int value = Integer.parseInt(args[0]);
 *   char[] chars = args[1].toCharArray();
 *   
 * 	  
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 * */
