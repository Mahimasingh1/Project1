package Package1;

public class Airthmetic2 
{

	public float div(float a, float b)
	{
		float c;
		c=a/b;
		return c;
	}
	public float sub(float x, float y)
	{
	    float z;
		z=x-y;
		return z;
	}
	public float add(float p, float q)
	{
		float r;
		r=p+q;
		return r;
	}
	public static void main(String[] args)
	{
		Airthmetic2 obj=new Airthmetic2();
		float result1=obj.div(10, 2);
		float result2=obj.sub(result1, 2);
		float result3=obj.add(result2, 2);
		float result4=obj.sub(result3, 2);
		float Final_result=obj.div(result4, 2);
		System.out.println("Final result of ((((10/2)-2)+2)-2)/2):" +obj.div(result4, 2));     	       
		}
	}
