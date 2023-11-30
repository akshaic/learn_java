import java.io.*;
import java.util.*;


class Bsort
{
    void sort()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of elements to be sorted : ");
     int n=sc.nextInt();
     int[] arr=new int[n];
     System.out.println("Enter the array : ");
     for (int i=0;i<n;i++)
     {
      int e=sc.nextInt();
      arr[i]=e;
     }
     for (int i=0;i<n;i++)
     {
         for (int j=0;j<n-i-1;j++)
            {
             if(arr[j]>arr[j+1])
              {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
            }      
     }
     System.out.println("Sorted array is : ");
     for (int i=0;i<n;i++)
     {
      System.out.print("\t"+arr[i]);
     }
     System.out.println("\n");
    }
}

class Bubble_sort
{
  public static void main(String args[])
  {
   Bsort obj=new Bsort();
   obj.sort();
  }
}































