import java.util.*;
abstract class Shape
{
abstract void noofsides();
}
class Triangle extends Shape
{
void noofsides()
{
System.out.println("Three sides");
}
}
class Rectangle extends Shape
{
void noofsides()
{
System.out.println("Four sides");
}
}
class Hexagon extends Shape
{
void noofsides()
{
System.out.println("Six sides");
}
}
class abstractcl
{
public static void main(String args[])
{
Shape ob1=new Rectangle();
ob1.noofsides();
Shape ob2=new Triangle();
ob2.noofsides();
Shape ob3=new Hexagon();
ob3.noofsides();
}
}
