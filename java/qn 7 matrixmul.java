  1 import java.util.Scanner;
  2 public class qnmatrixmul
  3 {
  4     public static void main(String args[])
  5     {
  6         Scanner sc=new Scanner(System.in);
  7         System.out.print("Enter size of matrix(n): ");
  8         int n =sc.nextInt();
  9
 10         int[][] a=new int[n][n];
 11         int[][] b=new int[n][n];
 12         int[][] c=new int[n][n];
 13
 14         System.out.println("Enter first matrix: ");
 15         for(int i=0;i<n;i++)
 16         {
 17             for(int j=0;j<n;j++)
 18             {
 19                 a[i][j]=sc.nextInt();
 20             }
 21         }
 22
 23         System.out.println("Enter second matrix: ");
 24         for(int i=0;i<n;i++)
 25         {
 26             for(int j=0;j<n;j++)
 27             {
 28                 b[i][j]=sc.nextInt();
 29             }
 30         }
 31
 32         for(int i=0;i<n;i++)
 33         {
 34             for(int j=0;j<n;j++)
 35             {
 36                 c[i][j]=0;
 37                 for(int k=0;k<n;k++)
 38                 {
 39                     c[i][j]+=a[i][k]*b[k][j];
 40                 }
 41
 42             }
 43         }
 44         System.out.println("Result Matrix: ");
 45         for(int i=0;i<n;i++)
 46         {
 47             for(int j=0;j<n;j++)
 48             {
 49                 System.out.println(c[i][j]+ " ");
 50             }
 51             System.out.println();
 52         }
 53     }
 54 }
 55
