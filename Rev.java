import java.io.*;
import java.util.*;
class Rev
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number : ");
int n= sc.nextInt();
int d,rev=0;
while (n>0)
{
 d=n%10;
 n=n/10;
 rev=rev*10+d;
}
System.out.print("Reversed Number : "+rev);
}
}
