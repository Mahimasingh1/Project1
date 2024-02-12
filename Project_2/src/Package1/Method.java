package Package1;

public class Method {

	public void m1()
	{
		System.out.println("Default method");
	}
	public void m2(int a)
	{
		System.out.println("One parameterized method");
	}
	public void m3(int a, int b)
	{
		this.m4(1, 2, 3);
		this.m5(1, 2, 3, 4);
		this.m1();
		this.m2(1);
		System.out.println("Two parameterized method");
	}
	public void m4(int a, int b, int c )
	{
		System.out.println("Three parameterized method");
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("Four parameterized method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Method obj=new Method();
      obj.m3(1, 2);
      	}

}
