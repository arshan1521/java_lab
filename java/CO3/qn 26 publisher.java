import java.util.Scanner;

class Publisher {
    String pname;
}

class Book extends Publisher {
    String bname;
}

class Literature extends Book {
    void display(){
        System.out.println("Literature: "+bname+" "+pname);
    }
}

class Fiction extends Book {
    void display(){
        System.out.println("Fiction: "+bname+" "+pname);
    }
}

class publisher {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter book name: ");
        String b=sc.nextLine();
        System.out.print("Enter publisher: ");
        String p=sc.nextLine();

        System.out.print("1.Literature 2.Fiction: ");
        int ch=sc.nextInt();

        if(ch==1){
            Literature l=new Literature();
            l.bname=b; l.pname=p;
            l.display();
        } else {
            Fiction f=new Fiction();
            f.bname=b; f.pname=p;
            f.display();
        }
    }
}