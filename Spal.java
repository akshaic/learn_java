import java.io.*;
import java.util.*;
class Spal
{
public static void main(String args[])
{
int flag=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :");
String s=sc.nextLine();
int len=s.length();
for (int i=0;i<len;i++)
{
   if (s.charAt(i)!=s.charAt(len-i-1))
     {
       System.out.println(s+" is not a Palindrome");
       flag=1;
       break;
      }
}
if(flag==0)
System.out.println(s+" is a Palindrome");
}
}
