package day0119.variable.primitive;

public class ConversionEx2 {

	public static void main(String[] args) {
	
		byte b = 10;//                         00001010
	//	byte -> int 자동 캐스팅         그대로 내려옴->  
		int i = b;//00000000 00000000 00000000 00001010
		
		System.out.println(b);
		System.out.println(i);
		
		int i2=300;//00000000 00000000 00000001 00101100
	//	byte b2=i2;//                  자리없음    00000000   error
		byte b2=(byte)i2;//손실이 발생하더라도 형변환한다.
	//          <-	
		System.out.println(i2);//원본 데이터는 변하지 않음
		                       // 변수 사용시 변수에 저장된 값만 꺼내서 쓴다.
		System.out.println(b2);
		
	}

}
