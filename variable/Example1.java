package day0120.test.variable;

public class Example1 {

	public static void main(String[] args) {
		 int x=3;
		 int y=7;
		 
		 int temp=y;
		 System.out.printf("y는%d\n" ,y);
		 y=x;
		 x=temp;
		 
		 System.out.printf("x는 %d\n",x);
		 System.out.printf("y는 %d\n",y);
		 System.out.printf("x: %d, y: %d",x,y);

	}

}
