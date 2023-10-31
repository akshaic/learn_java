import java.io.*;
import java.util.*;
import java.lang.Math;
class Shape
{
static double area(int r)
{
return 3.14*r*r;
}
static double area(int l,int b)
{
return l*b;
}
static double area(int a,int b,int c)
{
float s=(a+b+c)/2.0f;
double temp=s*(s-a)*(s-b)*(s-c);
return Math.sqrt(temp);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Shapes available : \n\t1. Circle \n\t2. Rectangle\n\t3. Triangle \nEnter your choice : ");
int choice=sc.nextInt();
double result=0;
if (choice==1)
{
System.out.println("Enter radius of the circle :");
int r=sc.nextInt();
result=Shape.area(r);
}
if (choice==2)
{
System.out.println("Enter length and breadth of the rectangle :");
int l=sc.nextInt();
int b=sc.nextInt();
result=Shape.area(l,b);
}
if (choice==3)
{
System.out.println("Enter threee sides of the triangle :");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
result=Shape.area(a,b,c);
}
System.out.printf("AREA : "+result);
}
}


