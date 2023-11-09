import java.util.*;
class Patient
{
int id_num,age;
int blood_data;
Patient()
{
int id=0;
int age_=0;
int blood=0;
}
Patient(int id_num,int age,int  blood_data)
{
this.id_num=id_num;
this.age=age;
this.blood_data=blood_data;
}
void get_id()
{
System.out.println("Patient ID is : "+id_num);
}
void get_age()
{
System.out.println("Patient age is : "+age);
}
void get_blood()
{
System.out.println("Patient blood data is : "+blood_data);
}
}
class Testpatient
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Id : ");
int i =sc.nextInt();
System.out.print("Enter age : ");
int a =sc.nextInt();
System.out.print("Enter blood data : ");
int bd =sc.nextInt();

Patient p=new Patient(i,a,bd);
p.get_id();
p.get_age();
p.get_blood();
}
}



