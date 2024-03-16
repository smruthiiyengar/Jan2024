package Pack;

public class Automation {
	public Automation()
	{	
		this(1,2,4);
		System.out.println("Parent Default Constructor");
	}
	public Automation(int a)
	{
		System.out.println("Parent single parameterized constructor");
	}
	public Automation(int a,int b)
	{
		this(1);
		System.out.println("Parent Two parameterized constructor");
	}
	public Automation(int a,int b,int c)
	{
		//this();
		System.out.println("Parent three parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obk = new Automation();

	}

}
