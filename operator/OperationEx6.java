package day0120.operator;

public class OperationEx6 {

	public static void main(String[] args) {
		int i=10;
		//i++; 이런 형태로 단독으로 사용하는 경우가 많음.
		System.out.println(++i);//선연산 후출력 i=11
		//문장 내 우선순위 1
		System.out.println(i++);//선출력 후연산 11->출력후i=12
		//문장 내 우선순위 제일 마지막
		System.out.println(i);//12
		
		int j = 10;
		int n = j++ % 5;
	//	    2    3    1
		System.out.println(j);
		System.out.println(n);
		System.out.println(j);
		
	}

}
