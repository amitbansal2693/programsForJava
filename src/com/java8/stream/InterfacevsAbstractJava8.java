package com.java8.stream;

public class InterfacevsAbstractJava8 extends anyAbstractClass implements anyInterface{

	@Override
	 void  abstractmethod() {
	}
	
	public static void main(String[] args) {
		InterfacevsAbstractJava8 ins=new InterfacevsAbstractJava8();
		anyInterface any=new InterfacevsAbstractJava8();
		//ins.abstractmethod();
		anyInterface.staticMethod();
		any.defaultMethod();
	}
	
	
	@Override
	public void abstractMethodinterface() {
		// TODO Auto-generated method stub
		anyInterface.staticMethod();
	}

}

interface anyInterface
{
    int i = 10;            //By default, interface fields are public, static and final
     
     void abstractMethodinterface();          //Interface can have abstract method, default is abstract public
     
    default void defaultMethod()
    {
        System.out.println("Interface can have default method");
    }
     
    static void staticMethod() 
    {
        System.out.println("Interface can have static method");
    }
     
    //No constructors in an interface
    //No non-static and non-final variables in an interface
    //No private fields and methods in an interface
    //No protected fields and methods in an interface
    //No final methods in an interface
}
 
abstract class anyAbstractClass
{
    private int a;          //Abstract class can have private field
     
    protected int b;        //Abstract class can have protected field
     
    public int c;           //Abstract class can have public field
     
    static int d;           //Abstract class can have static field
     
    final int e = 10;       //Abstract class can have final field
     
    int f;                  //Abstract class can have non-static and non-final field
     
    public anyAbstractClass() 
    {
        System.out.println("Abstract class can have constructors");
    }
      
     abstract void abstractmethod();    //Abstract class can have abstract method
     
    private static void staticMethod() 
    {
        System.out.println("Abstract class can have private and static method");
    }
     
    public void nonStaticMethod()
    {
        System.out.println("Abstract class can have public and non-static method");
    }
     
    protected void protectedMethod() 
    {
        System.out.println("Abstract class can have protected method");
    }
     
    final void finalMethod()
    {
        System.out.println("Abstract class can have final method");
    }
     
    //No default method in an abstract class
}