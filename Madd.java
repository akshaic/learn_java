import java.io.*;
import java.util.*;
class Madd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of rows and columns of matrix 1 :");
int r1=sc.nextInt();
int c1=sc.nextInt();
System.out.print("Enter number of rows and columns of matrix 2 :");
int r2=sc.nextInt();
int c2=sc.nextInt();
if (r1==r2 && c1==c2)
{
   System.out.println("Addition possible");
int m1[][]=new int [r1][c1],m2[][]=new int [r2][c2],m3[][]=new int [r1][c1];
System.out.println("Enter elements of first matrix :");
for (int i=0;i<r1;i++)
{
   for (int j=0;j<c1;j++)
    { 
      System.out.println("Enter element :");
      m1[i][j]= sc.nextInt();
     }
}

System.out.println("Enter elements of second matrix :");
for (int i=0;i<r1;i++)
{
   for (int j=0;j<c1;j++)
    { 
      System.out.println("Enter element :");
      m2[i][j]= sc.nextInt();
     }
}
System.out.println("\n\nFirst Matrix is :");
for (int i=0;i<r1;i++)
{
   for (int j=0;j<c1;j++)
    { 
      System.out.print(m1[i][j]+"\t");
     }
System.out.print("\n");
}
System.out.println("\n\nSecond Matrix is :");
for (int i=0;i<r1;i++)
{
   for (int j=0;j<c1;j++)
    { 
      System.out.print(m2[i][j]+"\t");
     }
System.out.print("\n");
}
for (int i=0;i<r1;i++)
{
   for (int j=0;j<c1;j++)
    { 
      m3[i][j]=m1[i][j]+m2[i][j];
     }
}
System.out.println("\n\nSum Matrix is :");
for (int i=0;i<r1;i++)
{
   for (int j=0;j<c1;j++)
    { 
      System.out.print(m3[i][j]+"\t");
     }
System.out.print("\n");
}
}
else
   System.out.println("Addition not possible");

}
}
