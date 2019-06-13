package SequenceDataTypeAddition;

public class SequenceDataTypeAddition {
	int a ;
	 double b;
	 
		 void addition (int d, double e)
		 {
			 a=d;
			 b=e;
			 double add = a+b;
			 System.out.println(add);
		 }
		 void addition (double e, int d )
		 {
			 
			 double add = e+d;
			 System.out.println(add);
		 }
	
	public static void main(String[] args) {
		
		SequenceDataTypeAddition obj = new SequenceDataTypeAddition();
		obj.addition(5, 4.5);
		obj.addition(6.5, 13);
	}

}
