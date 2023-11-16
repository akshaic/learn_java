import java.util.*;
class binary_search
{
public static void main(String args[])
{
int pos=-1;int mid;
Scanner sc=new Scanner(System.in);
System.out.print("Enter array size :");
int n = sc.nextInt();
System.out.println("Enter array in sorted order...");
int arr[]=new int[n];
for (int i=0;i<n;i++)
{
System.out.println("Enter array element :");
arr[i]=sc.nextInt();
}
System.out.print("Enter element to be searched : ");
int ele=sc.nextInt();
int l=0;int u=n-1;
while (l<u)
{
   mid=(l+u)/2;
   if(arr[mid]==ele)
   {
    pos=mid+1;
    break;
   }
   else if(arr[mid]>ele)
   {
    u=mid-1;
   }
   else
   {
   l=mid+1;
   }
}
if (pos==-1)
System.out.println("Element not found");
else
System.out.println("Element found at "+pos);
}
}
