import java.io.*;
import java.util.*;

class trycatch
{
     void divthrow(int a,int b) throws ArithmeticException
     {
          if (b==0)
          {
             throw new ArithmeticException("Division by Zero not possible!!!");      
          }  
          else
          {
            System.out.println("result is :"+a/b);
          }
     }
     
     
     void divte(int a,int b)
     {
         try
         {
            System.out.println("result is :"+a/b);      
         }
         catch(ArithmeticException e)
         {
            System.out.println("Exception occured!!!"+e);
         }
         finally
         {
            System.out.println("Rest of code....");
         }
     }
}

class Exception
{
   public static void main(String args[])
   {
   trycatch ob=new trycatch();
   ob.divte(10,5);
   ob.divte(10,0);
   ob.divthrow(10,5);
   ob.divthrow(10,0);
   }
}
