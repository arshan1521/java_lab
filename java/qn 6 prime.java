  1 import java.util.Scanner;
  2 public class qnprime
  3 {
  4     public static void main(String args[])
  5     {
  6         Scanner sc=new Scanner(System.in);
  7         System.out.println("Enter no. of elements: ");
  8         int n=sc.nextInt();
  9         int ar[]=new int[n];
 10         System.out.println("Enter elements: ");
 11         for(int i=0;i<n;i++)
 12         {
 13             ar[i]=sc.nextInt();
 14         }
 15         System.out.println("Prime nos: ");
 16         for(int i=0;i<n;i++)
 17         {
 18             int num=ar[i];
 19             int count=0;
 20             for(int j=1;j<=num;j++)
 21                     {
 22                         if(num%j==0)
 23                         {
 24                             count++;
 25                         }
 26                     }
 27                     if(count==2)
 28                     {
 29                         System.out.print(num+" ");
 30                     }
 31         }
 32     }
 33 }
