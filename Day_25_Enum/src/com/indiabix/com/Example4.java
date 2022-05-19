package com.indiabix.com;
interface Pizza
{
	void display();
	
}
enum size implements Pizza
{
	small,medium,large,extralarge;

	@Override
	public void display()
	{
		System.out.println("Size is:" +this);
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.extralarge.display();
		
	}

}
