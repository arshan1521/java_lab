  1 import java.util.Scanner;
  2 class qnsort
  3  {
  4    public static void main(String args[])
  5     {
  6         Scanner sc=new Scanner(System.in);
  7
  8        System.out.print("Enter no of elements: ");
  9          int n=sc.nextInt();
 10
 11         int ar[]=new int[n];
 12         System.out.print("Enter "+n+" elements: ");
 13         for(int i=0;i<n;i++)
 14         {
 15             ar[i]=sc.nextInt();
 16         }
 17         for(int i=0;i<n-1;i++)
 18         {
 19             for(int j=i+1;j<n;j++)
 20             {
 21                 if(ar[i]>ar[j])
 22                 {
 23                     int temp=ar[i];
 24                     ar[i]=ar[j];
 25                     ar[j]=temp;
 26                 }
 27             }
 28         }
 29         System.out.print("Ascending order: ");
 30         for(int i=0;i<n;i++)
 31         {
 32             System.out.print(ar[i]+" ");
 33         }
 34     }
 35  }
