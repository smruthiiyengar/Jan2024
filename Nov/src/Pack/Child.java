package Pack;

public class Child extends Feb18 { // we can call parent var and parent methods using extend
	public void chil1()
	{
		System.out.println("Child class method");
	}
	public void child2() {
		System.out.println("2nd child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.chil1();
		obj.met1();
		obj.met2();
		System.out.println(obj.ab);
	}

}
