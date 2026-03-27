  1 import java.util.Scanner;
  2
  3 class Fibonacci {
  4
  5     void display(int n)
  6     {
  7         int a = 0, b = 1, c;
  8
  9         System.out.println("Fibonacci Series:");
 10
 11         while (a <= n) {
 12             System.out.print(a + " ");
 13             c = a + b;
 14             a = b;
 15             b = c;
 16         }
 17     }
 18 }
 19
 20 public class fib
 21 {
 22     public static void main(String args[])
 23     {
 24         Scanner sc = new Scanner(System.in);
 25
 26         System.out.print("Enter limit: ");
 27         int n = sc.nextInt();
 28
 29         Fibonacci f = new Fibonacci();
 30         f.display(n);
 31     }
 32 }
