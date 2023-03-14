package day0120.operator;

public class OperatorEx1 {
     //부호 연산자 + / - 변수 
	public static void main(String[] args) {
		int num = -10;
		
		System.out.println(+num); //+(-10)
		System.out.println(-num); //-(-10), 부호가 바뀜
		System.out.println(num);  //-10
        //값을 꺼내오기만 했으므로 부호가 안바뀜 
		
		num = -num;//num에 저장된 데이터를 바꾸려면 항상 저장(=)까지 해야한다.
		System.out.println(num);
	}

}
