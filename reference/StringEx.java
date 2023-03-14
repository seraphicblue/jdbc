package day0119.variable.reference;

public class StringEx {
  public static void main(String args[]) {
	  //String 클래스 : java.lang패키지 클래스
	  //              문자열을 표현하기 위해 만든 클래스. "" 로 표현
      //참조형 데이터는 클래스이름을 타입으로 가진다.
	  String str = "문자열 표현";
      String empty ="";//빈문자열
      String blank =" ";//공백 두글자
	  
      //String과  + 연산자가 만나면 이어쓰기(결합). -, *, / 사용불가
      //새로운 문자열이 만들어진다.
      String add="hello "+"String";
      System.out.println(add);
      
      //String과 다른 타입(기본형)간의 + 연산시
      //다른 타입은 String으로 바꾼 후 연산한다. (결합)
      String name = "soldesk";
      int classNumber =504;
      
      String fullname = name + classNumber;
	  System.out.println(fullname);
	  
	  String a = 7 + " ";//"7 "
	  String b = " "+7;  //" 7"
	  String c = 7 + ""; //"7" int-> String 변환:빈 문자열을 더해준다 (""는->내용이 없다) 
	  String d = "" + 7; //"7"
	  
	  String e = 7+7+"";
	  String f = ""+7+7;
	  //빈문자열이 옴에 따라서 String으로 변환된다 순서에 유의
	  
	  System.out.println(e);
	  System.out.println(f);
  }
}
