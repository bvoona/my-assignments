package com.LambdaAssignment;


public class Practices {

}
interface Calculator
{
void add(int num1,int num2);
}

class Calc
{
public static void addSomething(int num1,int num2) 
{
	System.out.println(num1+"and"+num2+"addition is:"+(num1+num2));
}

public void letsAdd(int num1,int num2)
{
	System.out.println(num1+"and"+num2+"adds to:"+(num1+num2));
}
}
//Functional Interface
interface Messenger{
Message getMessage(String msg);
}
//void getMessage(java.lang.String string);

class Message{
Message(String msg) {
	System.out.println(">>Message is :"+msg);
}

public class MethodReference 
{
 public static void main(String[] args)
 {
	Calc.addSomething(10,20);
	 
	 //1.reference to a static method
	//Calculator cRef = Calc ::addSomething;
	// cRef.add(11,14);
	 
	 //2.reference to a non-static method
	 //object construction Statement for Calc
	// Calc calc = new Calc();
	 //Calculator cRef1 =calc ::letsAdd;
	 //cRef1.add(12,23);
	 
	 //3.Reference to a constructor
	// Messenger mRef = Message::new;
	 //mRef.getMessage("Search the candle rather than cursing the darkness!!");
 }
}
}
