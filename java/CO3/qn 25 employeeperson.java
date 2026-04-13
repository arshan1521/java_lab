import java.util.Scanner;

class Person {
    String name, gender, addr; int age;

    Person(String n,String g,String a,int ag){
        name=n; gender=g; addr=a; age=ag;
    }
}

class Employee extends Person {
    int id; String comp, qual; double sal;

    Employee(String n,String g,String a,int ag,int i,String c,String q,double s){
        super(n,g,a,ag);
        id=i; comp=c; qual=q; sal=s;
    }
}

class Teacher extends Employee {
    String sub, dept; int tid;

    Teacher(String n,String g,String a,int ag,int i,String c,String q,double s,
            String su,String d,int t){
        super(n,g,a,ag,i,c,q,s);
        sub=su; dept=d; tid=t;
    }

    void display(){
        System.out.println(name+" "+dept+" "+sub+" "+sal);
    }
}

class employee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();
        Teacher t[]=new Teacher[n];

        for(int i=0;i<n;i++){
            sc.nextLine();
            String name=sc.nextLine();
            String g=sc.nextLine();
            String a=sc.nextLine();
            int age=sc.nextInt();
            int id=sc.nextInt(); sc.nextLine();
            String c=sc.nextLine();
            String q=sc.nextLine();
            double s=sc.nextDouble(); sc.nextLine();
            String sub=sc.nextLine();
            String d=sc.nextLine();
            int tid=sc.nextInt();

            t[i]=new Teacher(name,g,a,age,id,c,q,s,sub,d,tid);
        }

        for(Teacher x:t) x.display();
    }
}