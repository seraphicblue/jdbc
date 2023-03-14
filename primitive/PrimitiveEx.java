package day0119.variable.primitive;

public class PrimitiveEx {
public static void main(String[] args){
	//변수 선언=값;
	int age = 10;
	
	boolean bool = true;
    System.out.println("bool : "+bool);
    
    char c1='A';
    char c2= 65;
    System.out.println("c1 : "+c1);
    System.out.println("c2 : "+c2);
    
    char c3='가';
    char c4= '\uAC10';
    System.out.println("c3 : "+c3);
    System.out.println("c4 : "+c4);
    
    //리터럴 정수  => int
    //int의 범위를 넘어가면 long으로 자동바뀌는 것이 아니라 error가  발생
    //long i = 21000000000;-> error
    //int의 범위를 넘은 리터럴 정수에 접미사 L을 붙여준다=>
    //해당 데이터는 long 타입이라고 명사
      long i=21000000000L;
      
      int num=10; //10진수
      int bNum=0B1010;//2진수
      int oNum=012;//8진수
      int hNum=0XA;//16진수
      
      //변수에 저장된 값을 꺼내와 출력시 10진수로
      System.out.println("2진수 :" +bNum);
      System.out.println("8진수 :" +oNum);
      System.out.println("16진수 :"+hNum);
      
      double d = 3.14;
      //실수형 리터럴 -> double
      //실수형 리터럴뒤에 접미사F를 붙여주면 float타입 데이터가 된다.
      float f = 3.14F;
      float f1 = 0.10000000001F;//소숫점7자리까지 표현가능 즉0.100000 이런식으로 남으니 뒤에 0은 의미가 없어서 0.1로 출력이 된다
      double d1 = 0.10000000001;//소숫점15자리까지 표현가능
      System.out.println("f1: "+f1);
      System.out.println("d1: "+d1);
      
      var mon="Jan";
      var day= 19;
}
}

