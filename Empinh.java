import java.io.*;
import java.util.*;
class Employee
{
String name;
int age;
String phone;
String address;
int salary;
void printsalary()
{
   System.out.println("Name : "+name+"\nAge :"+age+"\nPhone number : "+phone+"\nAddress : "+address+"\nSalary :"+salary);
}
}
class Officer extends Employee 
{
String specialisation;
void printof()
{
System.out.println("Specialisation : "+specialisation);
}
}
class Manager extends Employee
{
String department;
void printma()
{
System.out.println("\n\nManager");
System.out.println("Name : "+name+"\nAge :"+age+"\nPhone number : "+phone+"\nAddress : "+address+"\nSalary :"+salary);
System.out.println("Department : "+department);
}
}
class Empinh
{
public static void main(String args[])
{
Officer ob1=new Officer();
ob1.name="Akshai";
ob1.age=19;
ob1.phone="7907907790";
ob1.address="Mundakayam";
ob1.salary=50000;
ob1.specialisation="ML";
ob1.printsalary();
ob1.printof();
Manager ob2=new Manager();
ob2.name="akhil";
ob2.age=24;
ob2.phone="123456789";
ob2.address="Thrissur";
ob2.salary=100000;
ob2.department="CS";
ob2.printma();
}
}



