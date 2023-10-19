import java.io.*;
import java.util.*;
class Num
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter n : ");
int n= sc.nextInt();
int sum=0;
for (int i=1;i<=n;i++)
{
 System.out.println(i);
 sum=sum+i;
}
System.out.println("SUM : "+sum);
}
}


