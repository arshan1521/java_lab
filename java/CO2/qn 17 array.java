  1 import java.util.Scanner;
  2
  3 public class array {
  4     public static void main(String[] args) {
  5         Scanner sc = new Scanner(System.in);
  6
  7         System.out.print("Enter size: ");
  8         int n = sc.nextInt();
  9
 10         int[] arr = new int[n];
 11
 12         System.out.println("Enter elements:");
 13         for (int i = 0; i < n; i++) {
 14             arr[i] = sc.nextInt();
 15         }
 16
 17         System.out.print("Enter number to search: ");
 18         int key = sc.nextInt();
 19
 20         int found = 0;
 21
 22         for (int i = 0; i < n; i++) {
 23             if (arr[i] == key) {
 24                 found = 1;
 25             }
 26         }
 27
 28         if (found == 1) {
 29             System.out.println("Found");
 30         } else {
 31             System.out.println("Not Found");
 32         }
 33     }
 34 }
