package day0120.test.variable;

public class MyInfo {

	public static void main(String[] args) {
	  
	  String name= "이이지";
	  int age=26;
	  String mbti="intp";
	  String email="ggj05037@gmail.com";
	  
	  System.out.println("이름 :"+name);
	  System.out.println("\n나이 :"+age);
	  System.out.println("\nmbti :"+mbti);
	  System.out.println("email :"+email);
      // "\n" 줄바뀜
	  System.out.printf("제 이름은 %s이고 나이는 %d입니다. \nmbti는 %s이며 email주소는 %s입니다."
			  , name, age, mbti, email);
	  
	  
	}

}
