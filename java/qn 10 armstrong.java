  1 import java.util.Scanner;
  2 class Armstrong
  3 {
  4     int num, sum = 0, temp;
  5     void get(int n)
  6     {
  7         num = n;
  8         temp = num;
  9     }
 10
 11     void check()
 12     {
 13         while (temp > 0)
 14         {
 15             int r = temp % 10;
 16             sum = sum + (r * r * r);
 17             temp = temp / 10;
 18         }
 19
 20         if (sum == num)
 21             System.out.println("Armstrong Number");
 22         else
 23             System.out.println("Not Armstrong Number");
 24     }
 25 }
 26
 27 public class arstrong
 28 {
 29     public static void main(String args[])
 30     {
 31         Scanner sc = new Scanner(System.in);
 32
 33         System.out.print("Enter a number: ");
 34         int n = sc.nextInt();
 35
 36         Armstrong ob = new Armstrong();
 37         ob.get(n);
 38         ob.check();
 39     }
 40 }
