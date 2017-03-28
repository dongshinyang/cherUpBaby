package cherUpBaby.basic;

public class Array {
	public static void main(String[] args) {

 	}
}
/**
 * Array does not make memory but point the reference in memory 
 * So do not use immediately
 * 
 * int type array   <---only integer 
 * e.g.  int[] oneScores;        
 *   oneScores = new int[3]; 
     oneScores[0] = 100;
     oneScores[1] = 90;
     oneScores[2] = 80;
 * e.g.  
     int[] twoScores;
     twoScores = new int[]{100, 90, 80};
 * e.g.  
     int[] threeScores = {100, 90 ,80};
     
 * e.g. You can not omit new int[] sentence after declaring an array variable like this  	
	  int[] scores2;
	  scores2 = {80, 70, 60
	  
 * Two Dimension Array
 * e.g. 
 *  [col][row]  	 
    int[][] oneScores = {
      {90,   90,   90},		0,0   0,1   0,2
      {80,   80,   80},     1,0   1,1   1,2 
      {70,   70,   70},     2,0   2,1   2,2
      {60,   60,   60}.     3,0   3,1   3,2 	
      {50,   50,   50}      4,0   4,1   4,2
    };
                               0   0    0     1   1   1      2   2   2      3   3   3      4   4   4
      int[][] twoScores = {   {90, 90, 90},  {80, 80, 80},  {70, 70, 70},  {60, 60, 60},  {50, 50, 50},};  
                                0   1   2      0   1   2      0   1   2      0   1   2      0   1    2
	  
 * e.g.	  
        String[] names = {"홍길동", "임꺽정", "유관순"};

	    // 문자열 2차원 배열
	    String[][] names2 = {
	      {"송성은", "양찬", "전도연", "김도훈", "윤인수"},
	      {"백권호", "이상원", "문선애", "김용현"},
	      {"유현규", "권태임", "원지선", "류세현", "이승도"},
	      {"양동신", "이호형", "함지호", "문성룡"},
	      {"한동수", "손덕현", "공승환", "박나현"},
	      {"배철한", "유기용"}
	    };

	    System.out.println(names.length); // 1차원 배열의 항목 수
	    System.out.println(names2.length); // 2차원 배열의 행 수
	    System.out.println(names2[0].length); // 2차원 배열에서 행의 열 수
 * *
 */

