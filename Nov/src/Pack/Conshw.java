package Pack;

public class Conshw {
	//public Conshw(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	//}
	public Conshw()
	{
		System.out.println("Default Cons");
	}
	public Conshw(int a)
	{
		this();
		System.out.println("One param Constructor");
	}
	public Conshw(int a, int b)
	{
		System.out.println("Two parametrized Constructor");
	}
	public Conshw(int a,int b,int c)
	{
		System.out.println("Three param constructor");
	}
	public Conshw(int a, int b, int c, int d)
	{
		System.out.println("Four param Constructors");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Conshw obj1 = new Conshw(10,30,20);
		//System.out.println(obj1);
		Conshw ob2 = new Conshw(1,2,2,3);
		Conshw ob3 = new Conshw(1);
		Conshw ob4 = new Conshw(1,2);
	}

}
