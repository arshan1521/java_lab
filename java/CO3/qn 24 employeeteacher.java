import java.util.Scanner;

class Employee {
    int id; String name, addr; double sal;

    Employee(int i,String n,String a,double s){
        id=i; name=n; addr=a; sal=s;
    }
}

class Teacher extends Employee {
    String dept, sub;

    Teacher(int i,String n,String a,double s,String d,String su){
        super(i,n,a,s);
        dept=d; sub=su;
    }

    void display(){
        System.out.println(id+" "+name+" "+dept+" "+sub+" "+sal);
    }
}

class employee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();
        Teacher t[]=new Teacher[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter id,name,addr,sal,dept,sub:");
            int id=sc.nextInt(); sc.nextLine();
            String name=sc.nextLine();
            String addr=sc.nextLine();
            double sal=sc.nextDouble(); sc.nextLine();
            String d=sc.nextLine();
            String s=sc.nextLine();

            t[i]=new Teacher(id,name,addr,sal,d,s);
        }

        for(Teacher x:t) x.display();
    }
}