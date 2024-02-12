package Package1;

public class cons {

	public cons()
	{	
		this(1,2,3);
		System.out.println("Default constructor");	
	}
	
	public cons(int x)
	{
        this();
		System.out.println("one parameterized constructor");
	}

	public cons(int a, int b)
	{
	    this(1);
		System.out.println("two parameterized constructor");
	}
	
	public cons(int p, int q, int r)
	{
		System.out.println("three parameterized constructor");
	}
	public cons(int s, int t, int u, int v)
	{
		this(1, 2);
		System.out.println("four parameterized constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cons obj=new cons(1, 2, 3, 4);
			}

}
