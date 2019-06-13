package DataTypeAddition;

public class DataTypeAddition {
 int a ;
 int b;
 double c;
	 void addition (int d, int e)
	 {
		 a=d;
		 b=e;
		 int add = a+b;
		 System.out.println(add);
	 }
	 void addition (int num1, double num2)
	 {
		 double add1 = num1 + num2;
;		 System.out.println(add1);
	 }
	
	public static void main(String[] args) {
		DataTypeAddition obj = new DataTypeAddition();
		obj.addition(5, 7);
		obj.addition(3, 4.5);
	}

}
