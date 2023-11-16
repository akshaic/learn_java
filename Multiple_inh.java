import java.util.*;


interface Sports
{
final int sportwt=6;
abstract void putwt();
}


class Student
{
int rollno;
void getNumber()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter roll no.");
rollno=sc.nextInt();
}
void putNumber()
{
System.out.println("Roll Number : "+rollno);
}
}


class Test extends Student
{
int term1;
int term2;
void getMarks()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Term1 marks :");
term1=sc.nextInt();
System.out.println("Enter Term2 marks :");
term2=sc.nextInt();
}
void putMarks()
{
System.out.println("Marks obtained...");
System.out.println("Mark of Term 1  : "+term1);
System.out.println("Mark of Term 2  : "+term2);
}
}


class Results extends Test implements Sports
{
public void putwt()
{
System.out.println("Sports weightage : "+sportwt);
int total=term1+term2+sportwt;
System.out.println("Total Score : "+total);
}
}



class Multiple_inh
{
public static void main(String args[])
{
Results ob=new Results();
ob.getNumber();
ob.getMarks();
ob.putNumber();
ob.putMarks();
ob.putwt();
}
}








