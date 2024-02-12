package Package1;

public class Airthmetic {

	public int add(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
			}
	public int mul(int p, int q)
	{
		int r;
		r=p*q;
		return r;
	}
	public int div(int m, int n)
	{
		int o;
		o=m/n;
		return o;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Airthmetic obj=new Airthmetic();
	   int result1=obj.add(10, 2);
       int result2=obj.add(result1, 2) ;
       int result3=obj.sub(result2, 2);
       int result4=obj.mul(result3, 2);
       int final_result=obj.div(result4, 2);
     
   	System.out.println("Final result of ((((10+2)+2)-2)*2)/2):" +obj.div(result4, 2));     
       
       }
}
