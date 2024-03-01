package Pack;

public class Cons 
{
public Cons()
{
	this(1,2,3,4);
	System.out.println("Default Cons");
}
public Cons(int a)
{
	
	System.out.println("One Param Cons");
}
public Cons(int a, int b)
{
	this(1,2,3);
	System.out.println("Two Param Cons");
}
public Cons(int a, int b, int c)
{
	System.out.println("Three param Cons");
}
public Cons(int a, int b, int c, int d)
{
	//this();
	System.out.println("Four Param Cons");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons obj = new Cons();
		Cons obj1 = new Cons(1);
		Cons obj2 = new Cons(2,3);

	}

}
