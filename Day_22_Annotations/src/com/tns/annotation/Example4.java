package com.tns.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Annotation1
{
	String sound();
}
class P
{
	@Annotation1(sound="Error resolved")
	public void display()
	{
		System.out.println("Annotations");
	}
}
public class Example4 {

	public static void main(String[] args) throws NoSuchMethodException, RuntimeException {
		P obj=new P();
		Method m=obj.getClass().getMethod("display");
		Annotation1 a=m.getAnnotation(Annotation1.class);
		System.out.println(a.sound());
		

	}

}