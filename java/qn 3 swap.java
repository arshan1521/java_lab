  1 import java.util.Scanner;
  2 class qnswap
  3 {
  4   public static void main(String args[])
  5    {
  6        Scanner sc=new Scanner(System.in);
  7
  8       System.out.print("Enter no of elements: ");
  9         int n=sc.nextInt();
 10
 11        int ar[]=new int[n];
 12        System.out.print("Enter "+n+" elements: ");
 13        for(int i=0;i<n;i++)
 14        {
 15            ar[i]=sc.nextInt();
 16        }
 17        System.out.print("--BEFORE SWAPPING--");
 18        for(int i=0;i<n;i++)
 19        {
 20        System.out.print(ar[i]+" ");
 21        }
 22        int temp=0;
 23        temp=ar[0];
 24        ar[0]=ar[n-1];
 25        ar[n-1]=temp;
 26        System.out.print("\n--AFTER SWAPPING-- ");
 27        for(int i=0;i<n;i++)
 28        {
 29
 30                 System.out.print(ar[i]+" ");
 31        }
 32    }
 33 }
 34
