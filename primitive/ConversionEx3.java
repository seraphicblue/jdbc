package day0119.variable.primitive;

public class ConversionEx3 {

	public static void main(String[] args) {
		
		double d=100;//자동으로 100.0  정수->실수
		int i = (int)d;//기존에 있던 100.0->100 (소수점자리는 버림)  실수->정수 int로 캐스팅한다. 
		
		System.out.println(d);
		System.out.println(i);
		

	}

}
