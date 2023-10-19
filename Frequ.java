import java.io.*;
import java.util.*;
class Frequ
{
public static void main(String args[])
{
int flag=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string :");
String s=sc.nextLine();
int len=s.length();
System.out.println("Enter character :");
char c=sc.next().charAt(0);
for (int i=0;i<len;i++)
{
   if (s.charAt(i)==c)
       flag++;
}
System.out.println("Frequency of "+c+" is "+flag);
}
}
