package Package1;

public class Student {
int rollNo=10, age=15;

public void Display1()
{
System.out.println("Welcome to all of you");	
}

public void Display2()
{
	System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student Obj1=new Student();
        Obj1.Display1();
        Obj1.Display2();
     System.out.println("rollNo:" +Obj1.rollNo);
     System.out.println("age:" +Obj1.age);
	}
}
