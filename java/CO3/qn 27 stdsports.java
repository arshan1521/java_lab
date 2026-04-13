import java.util.Scanner;

class Student {
    int mark;
}

class Sports {
    int score;
}

class Result extends Student {
    Sports s = new Sports();

    void display(){
        System.out.println("Mark: "+mark);
        System.out.println("Sports: "+s.score);
    }
}

class stdsports {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Result r=new Result();

        System.out.print("Enter mark: ");
        r.mark=sc.nextInt();

        System.out.print("Enter sports score: ");
        r.s.score=sc.nextInt();

        r.display();
    }
}