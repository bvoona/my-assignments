package com.Annotations;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{
int Sequence();
}
class MyClass
{ 
	@Execute(Sequence=2)
	public void myMethod2() {
		}
	@Execute(Sequence=1)
	public void myMethod1() {
		}
	@Execute(Sequence=3)
	public void myMethod3() {
		}
}
public class Annotation3 {
	public static void main(String[] args)throws Exception
	{
	MyClass c=new MyClass();
	Method m=c.getClass().getMethod("myMethod2");
	Method m1=c.getClass().getMethod("myMethod1");
	Method m2=c.getClass().getMethod("myMethod3");
	Execute e=m.getAnnotation(Execute.class);
	Execute e1=m1.getAnnotation(Execute.class);
	Execute e2=m2.getAnnotation(Execute.class);
	System.out.println(e.Sequence());
	System.out.println(e1.Sequence());
    System.out.println(e2.Sequence());

	}
}

	
