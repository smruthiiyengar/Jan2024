package Pack;

public class Selenium extends Automation{
	public Selenium()
	{
		System.out.println("child default Cons");
	}
	public Selenium(int a)
	{
		System.out.println("child one param Cons");
	}
	public Selenium(int a, int b)
	{
		System.out.println("child two param Cons");
	}
	public Selenium(int a, int b,int c)
	{
		System.out.println("child three param Cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium obj = new Selenium();
		Selenium obj1 = new Selenium(10,2);

	}
	

}
