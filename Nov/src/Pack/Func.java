package Pack;

public class Func {
	public int add(int a,int b)
	{
		int c;
		c = a+b;
		return c;
	}
	public int mul(int z, int d) 
	{
	 int y;
	 y = z*d;
	 return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func obj = new Func();
		int sum = obj.add(10, 20);
		int mul = obj.mul(10, 33);
		System.out.println(sum);
		System.out.println(mul);
		
	}

}
