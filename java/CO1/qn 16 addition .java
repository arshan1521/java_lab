  1 import java.util.Scanner;
  2
  3 public class addition {
  4     public static void main(String args[]) {
  5         Scanner sc = new Scanner(System.in);
  6
  7         System.out.print("Enter number of rows: ");
  8         int rows = sc.nextInt();
  9
 10         System.out.print("Enter number of columns: ");
 11         int cols = sc.nextInt();
 12
 13         int[][] matrix1 = new int[rows][cols];
 14         int[][] matrix2 = new int[rows][cols];
 15         int[][] sum = new int[rows][cols];
 16
 17         System.out.println("Enter elements of first matrix:");
 18         for (int i = 0; i < rows; i++) {
 19             for (int j = 0; j < cols; j++) {
 20                 matrix1[i][j] = sc.nextInt();
 21             }
 22         }
 23
 24         System.out.println("Enter elements of second matrix:");
 25         for (int i = 0; i < rows; i++) {
 26             for (int j = 0; j < cols; j++) {
 27                 matrix2[i][j] = sc.nextInt();
 28             }
 29         }
 30
 31         for (int i = 0; i < rows; i++) {
 32             for (int j = 0; j < cols; j++) {
 33                 sum[i][j] = matrix1[i][j] + matrix2[i][j];
 34             }
 35         }
 36
 37         System.out.println("Sum of matrices:");
 38         for (int i = 0; i < rows; i++) {
 39             for (int j = 0; j < cols; j++) {
 40                 System.out.print(sum[i][j] + " ");
 41             }
 42             System.out.println();
 43         }
 44
 45
 46     }
