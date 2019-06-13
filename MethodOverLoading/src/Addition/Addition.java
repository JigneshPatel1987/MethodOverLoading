package Addition;

public class Addition {

	int a;
	int b;
	int x;
	void addition (int c, int d)
	{
		a=c;
		b=d;
		int add = a+b;
		System.out.println(add);
	}
	
	void addition (int num1, int num2, int num3)
	{
		a= num1;
		b= num2;
		x= num3;
		int add = a+b+x;
		System.out.println(add);
	}
	
	
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.addition(10, 4);
		obj.addition(10, 20, 30);

	}

}
