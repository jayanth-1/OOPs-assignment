class A{
	
	private int a = 5;
	public int b = 3;
	protected int c = 2;
}

class B extends A{
	
	B obj = new A();
	System.out.println(obj.c);// error because we cant access private
}

class C
{
	A obj = new A();
	System.out.println(obj.c); // error because in sub class we can access protected but in another class we cant access
	System.out.println(obj.c); // we can access public
}
