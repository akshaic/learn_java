import java.io.*;
import java.util.*;
class Pal
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number : ");
int n= sc.nextInt();
int d,sum=0;
int ac=n;
while (n>0)
{
 d=n%10;
 n=n/10;
 sum=sum*10+d;
}
if (sum==ac)
System.out.print("PALINDROME");
else
System.out.print("NOT PALINDROME");
}
}


