  1 class product
  2 {
  3     int pcode;
  4     String pname;
  5     double price;
  6
  7     product(int c,String n,double p)
  8     {
  9         pcode=c;
 10         pname=n;
 11         price=p;
 12     }
 13     void display()
 14     {
 15         System.out.println("Product code: "+pcode);
 16         System.out.println("Product name: "+pname);
 17         System.out.println("Price: "+price);
 18     }
 19     public static void main(String args[])
 20     {
 21         product p1=new product(101,"Laptop",55000);
 22         product p2=new product(102,"Mouse",500);
 23         product p3=new product(103,"Keyboard",1500);
 24
 25         product lowest=p1;
 26         if(p2.price<lowest.price)
 27         {
 28             lowest=p2;
 29         }
 30         if(p3.price<lowest.price)
 31         {
 32             lowest=p3;
 33         }
 34         System.out.println("Product with Lowest price");
 35         lowest.display();
 36     }
 37 }
