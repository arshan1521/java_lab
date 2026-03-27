  1 import java.util.Scanner;
  2 class qnsortdesc
  3 {
  4   public static void main(String args[])
  5    {
  6        Scanner sc=new Scanner(System.in);
  7       System.out.print("Enter no of elements: ");
  8         int n=sc.nextInt();
  9        int ar[]=new int[n];
 10        System.out.print("Enter "+n+" elements: ");
 11        for(int i=0;i<n;i++)
 12        {
 13            ar[i]=sc.nextInt();
 14        }
 15        for(int i=0;i<n-1;i++)
 16         {
 17             for(int j=i+1;j<n;j++)
 18             {
 19                 if(ar[i]<ar[j])
 20                 {
 21                     int temp=ar[i];
 22                     ar[i]=ar[j];
 23                     ar[j]=temp;
 24                 }
 25             }
 26         }
 27         System.out.print("Descending order: ");
 28         for(int i=0;i<n;i++)
 29         {
 30             System.out.print(ar[i]+" ");
 31         }
 32     }
 33  }
