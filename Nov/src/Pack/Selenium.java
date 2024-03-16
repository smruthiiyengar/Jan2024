package Pack;

public class Selenium extends Automation{
	public Selenium()
	{
		super(2,4);
		System.out.println("child default Cons");
	}
	public Selenium(int a)
	{
		this(1,2,3);
		System.out.println("child one param Cons");
	}
	public Selenium(int a, int b)
	{
		this();
		System.out.println("child two param Cons");
	}
	public Selenium(int a, int b,int c)
	{
		this(2,3);
		System.out.println("child three param Cons");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Selenium obj = new Selenium(10);
		//Selenium obj1 = new Selenium();
	}
	

}
