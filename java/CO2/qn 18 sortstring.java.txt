  1 import java.util.Scanner;
  2
  3 class Sortstring{
  4     public static void main(String args[]){
  5         Scanner sc=new Scanner(System.in);
  6         String a[]=new String[5];
  7
  8         System.out.println("Enter String:");
  9         for(int i=0;i<5;i++)
 10             a[i]=sc.next();
 11         for(int i=0;i<5;i++)
 12             for(int j=i+1;j<5;j++)
 13                 if(a[i].compareTo(a[j])>0){
 14                     String t=a[i];
 15                     a[i]=a[j];
 16                     a[j]=t;
 17                 }
 18
 19
 20         System.out.println("Sorted:");
 21         for(String s : a)
 22             System.out.println(s);
 23     }
 24 }