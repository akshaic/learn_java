import java.io.*;
import java.util.*;
class Employee
{
   void display()
    {
         System.out.println("Class Employee");
    }
   void calcsalary()
    {
        System.out.println("Salary of Employee is 10,000");
    }
}

class Engineer extends Employee
{
   void display()
   {
       super.display();
       System.out.println("Class Engineer");
   }
   void calcsalary()
   {
      super.calcsalary();
      System.out.println("Salary of Engineer is 20,000");
   }
}
class Superkey
{
public static void main(String args[])
{
Engineer ob=new Engineer();
ob.display();
ob.calcsalary();
}
}
