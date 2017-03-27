package cherUpBaby.basic;

public class PrimitiveValues {

	public static void main(String[] args) {
	    System.out.printf("int ====>%d\n", 85);     // 정수 값 [int]
	    System.out.printf("float ==>%f\n", 3.14);   // 부동소수점 값 [float][double] 
	    System.out.printf("boolean=>%b\n", true);   // 논리 값 [boolean]
	    System.out.printf("boolean=>%b\n", false);  // 논리 값 [boolean]
	    System.out.printf("char====>%c\n", 'A');    // 문자 [char]
	    System.out.printf("String=>%s\n", "문");    // 문자열. 한 자 이상의 문자들. [String]
	    System.out.printf("String=>%s\n", "문자열");// 문자열. 한 자 이상의 문자들. [String]
	    //주제: 표현 가능한 값의 범위 - 정수 값의 표현 범위를 초과한 경우
	    //주제: 표현 가능한 값의 범위 - 고정 소수점 값 표현
	    //주제: 표현 가능한 값의 범위 - 부동 소수점 값 표현
	    System.out.println(3.14);
	    System.out.println(314E-2); // = 314 * 10^-2
	    System.out.println(0.0314e2); // = 0.0314 * 10^2
	    
	    //주제: 표현 가능한 값의 범위 - 논리값
	    System.out.println(true);
	    System.out.println(false);
	    System.out.println(10 < 20); // true
	    System.out.println(10 > 20); // false
	    System.out.println(10 == 20); // false
	    System.out.println(10 != 20); // true
	    System.out.println("Hello, world!");
	    System.out.println("Hello, \bworld!"); // backspace
	    System.out.println("Hello, \tworld!"); // tab
	    System.out.println("Hello, \nworld!"); // line feed
	    System.out.println("Hello, \fworld!"); // form feed
	    
	    //주제: 표현 가능한 값의 범위 - 문자 표현
	    System.out.println(0x41); // 숫자로 간주하고 10진수 65를 출력.
	    System.out.println(65);
	    System.out.println((char)0x41); // 주어진 코드 값의 문자 출력.
	    System.out.println((char)65); // 주어진 코드 값의 문자 출력
	    // 따옴표를 사용하면 (char) 명령이 필요 없다.
	    System.out.println('A'); 
	    
	    //주제: 표현 가능한 값의 범위 - 문자열과 특수 명령(escape character)
	    System.out.println("Hello, \rworld!"); // carriage return
	    System.out.println("Hello, \"world!"); // double quote
	    System.out.println("Hello, \'world!"); // single quote
	    System.out.println("Hello, \\world!"); // backslash
	    
	    //주제: 표현 가능한 값의 범위 - 문자열과 특수 명령(escape character)
	    System.out.println("Hello, world!");
	    System.out.println("Hello, \bworld!"); // backspace
	    System.out.println("Hello, \tworld!"); // tab
	    System.out.println("Hello, \nworld!"); // line feed
	    System.out.println("Hello, \fworld!"); // form feed
	    System.out.println("Hello, \rworld!"); //carrage return
	    System.out.println("Hello, \"world!"); // double quote
	    System.out.println("Hello, \'world!"); // single quote
	    System.out.println("Hello, \\world!"); // backslash
	}

}
/**
 * # 리터럴(literal)
- 자바 언어로 표현한 값.

# 주의!
- 자바 언어는 대소문자를 구분한다.

 * # 정수 표현 범위
- 약 -21억 ~ +21억


# 정수를 표현할 수 있는 범위가 제한된 이유
- JVM이 정수 값을 다루기 위해 메모리에 저장할 때
  32비트 메모리를 사용하기 때문이다.

# 메모리 크기(비트 개수)와 값의 범위
1) 1 비트
- on 또는 off : 1 또는 0 : 2가지 상태
- 2개의 수를 표현할 수 있다.

2) 2비트
- 2 * 2 = 4 가지 상태
- 4개의 수를 표현할 수 있다.

3) n비트
- 2^n 개의 수를 표현할 수 있다.
- 음수까지 고려한다면 2로 나누면 된다.
 * */


