  1 import java.util.Scanner;
  2 class symmetric
  3 {
  4     public static void main(String args[])
  5     {
  6         Scanner sc=new Scanner(System.in);
  7         System.out.println("Enter no of rows: ");
  8         int r=sc.nextInt();
  9         System.out.println("Enter no of cols: ");
 10         int c=sc.nextInt();
 11         int matrix[][]=new int [r][c];
 12         System.out.println("Enter matrix elements: ");
 13         for(int i=0;i<r;i++)
 14         {
 15             for(int j=0;j<c;j++)
 16             {
 17                 matrix[i][j]=sc.nextInt();
 18             }
 19         }
 20     boolean symmetric=true;
 21
 22     for(int i=0;i<r;i++)
 23     {
 24         for(int j=0;j<c;j++)
 25         {
 26             if(matrix[i][j]!=matrix[j][i])
 27             {
 28                 symmetric= false;
 29             }
 30         }
 31     }
 32
 33     if(symmetric)
 34         System.out.println("\nMATRIX IS SYMMETRIC ");
 35     else
 36         System.out.println("\nMATRIX IS NOT SYMMETRIC ");
 37 }
 38 }
