import java.io.*;
class Fib
{
public static void main(String args[])
{
int a=0;
int b=1;
int c = a+b;
System.out.print("\tThe Fibonacci series upto 100\n\t"+a+"\n\t"+b+"\n");
while (c<100)
{
  System.out.println("\t"+c);
  a=b;
  b=c;
  c=a+b;
}
System.out.println();
}
}
   
  

