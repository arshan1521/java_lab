 1 class student
  2 {
  3     int rollno;
  4     String name;
  5     int sub1,sub2;
  6
  7     student()
  8     {
  9         rollno=0;
 10         name="";
 11         sub1=0;
 12         sub2=0;
 13     }
 14     student(int r,String n,int s1,int s2)
 15     {
 16         rollno=r;
 17         name=n;
 18         sub1=s1;
 19         sub2=s2;
 20     }
 21    void display()
 22    {
 23       System.out.println("Rollno: "+rollno);
 24       System.out.println("Name: "+name);
 25       System.out.println("Mark1: "+sub1);
 26       System.out.println("Mark2: "+sub2);
 27    }
 28  public static void main(String args[])
 29  {
 30    student s1=new student();
 31  s1.rollno=1;
 32  s1.name="Rahul";
 33  s1.sub1=80;
 34  s1.sub2=70;
 35
 36  student s2=new student(2,"Anu",90,85);
 37  student s3=new student(3,"Arjun",75,95);
 38
 39  System.out.println("STUDENT DETAILS\n");
 40
 41 s1.display();
 42 System.out.println("");
 43 s2.display();
 44 System.out.println("\n");
 45 s3.display();
 46
 47 double avg1=(s1.sub1+s2.sub1+s3.sub1)/3.0;
 48 double avg2=(s1.sub2+s2.sub2+s3.sub2)/3.0;
 49
 50 System.out.println("\nAverage sub1= "+avg1);
 51 System.out.println("Average sub2= "+avg2);
 52
 53  }
 54     }
 55
