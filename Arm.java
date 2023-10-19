import java.io.*;
import java.util.*;
class Arm
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter 3 digit number : ");
int n= sc.nextInt();
int d,sum=0,ac;
ac=n;
while (n>0)
{
d=n%10;
n=n/10;
sum=sum+(d*d*d);
}
if (sum==ac)
System.out.println("Armstrong number");
else
System.out.println("Not an Armstrong number");
}
}

