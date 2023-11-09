import java.util.*;
class Employee
{
int emp_id;
String emp_name;
int emp_age;
String emp_gen;
String emp_des;
int emp_salary;
String emp_add;
Employee(int emp_id,String emp_name,int emp_age,String emp_gen,String emp_des,int emp_salary,String emp_add)
{
this.emp_id=emp_id;
this.emp_name=emp_name;
this.emp_age=emp_age;
this.emp_gen=emp_gen;
this.emp_des=emp_des;
this.emp_salary=emp_salary;
this.emp_add=emp_add;
}
}
class Testemp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of employees : ");
int n=sc.nextInt();
int arr[]=new int [n];
for (int i=0;i<n;i++)
{
System.out.print("Enter employee id : ");
int id=sc.nextInt();
System.out.print("Enter name of employee : ");
String str=sc.nextLine();
System.out.print("Enter age of employee : ");
int age=sc.nextInt();
System.out.print("Enter gender of employee : ");
String g=sc.nextLine();
System.out.print("Enter designation of employee : ");
String des=sc.nextLine();
System.out.print("Enter salary of employee : ");
int sal=sc.nextInt();
System.out.print("Enter address of employee : ");
String add=sc.nextLine();
Employee object{i}=new Employee(id,str,age,g,des,sal,add);
arr[i]=object{i};
}
System.out.print("Enter required employee id : ");
int reqid=sc.nextInt();
for (int i=0;i<n;i++)
{
if (arr[i].emp_id==reqid)
{
System.out.println(" employee id : "+arr[i].emp_id);
System.out.println("Name of employee : "+arr[i].emp_name);
System.out.println("Age of employee : "+emp_age);
System.out.println("Gender : "+emp_gen);
System.out.println("Designation : "+emp_des);
System.out.println("Salary of employee : ",+emp_salary);
System.out.println("Address of employee : "+emp_add);
}
}
}
}






