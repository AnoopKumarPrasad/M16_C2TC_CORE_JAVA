package com.indiabix.com;
enum Bike
{
	PULSAR,KTM,R15,Honda;
}
public class Example3 {

	public static void main(String[] args) {
		Bike b=Bike.Honda;
		switch(b)
		{
		case PULSAR:
			System.out.println("You chose Pulsar");
			break;
		case KTM:
			System.out.println("You chose KTM");
			break;
		case R15:
			System.out.println("You chose R15");
			break;
		default:
			System.out.println("Invalid name");
	}
	}
}
