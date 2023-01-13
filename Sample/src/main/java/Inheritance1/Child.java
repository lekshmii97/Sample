package Inheritance1;

public class Child extends Grand
{
	int e=10;
	int f=1;
	int h;
public void div ()
{
	h=e/f;
	System.out.println(h);
}
	public static void main(String[] args)
	
	{
		Child obj=new Child();
		obj.div();
		obj.add();

	}

}
