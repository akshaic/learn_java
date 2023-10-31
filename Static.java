import java.io.*;
class Static
{
static void method1()
{
System.out.println("static methodd");
}
void method2()
{
System.out.println("non static methodd");
}
static
{
 System.out.println("static block");
}
static String a="static variable";
String b="non static variable";
public static void main(String args[])
{
method1();
System.out.println(a);
Static ob=new Static();
ob.method2();
System.out.println(ob.b);
}
}

 
