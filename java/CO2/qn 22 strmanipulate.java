import java.util.*;

class StringOp {
    String str;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    void length() {
        System.out.println("Length: " + str.length());
    }

    void reverse() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reverse: " + rev);
    }

    void uppercase() {
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    void lowercase() {
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    void palindrome() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    void countVowels() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
        }
        System.out.println("Vowels: " + count);
    }

    void countWords() {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        System.out.println("Words: " + count);
    }


    void mainMenu() {
        length();
        reverse();
        uppercase();
        lowercase();
        palindrome();
        countVowels();
        countWords();
      
    }

    public static void main(String[] args) {
        StringOp obj = new StringOp();
        obj.input();
        obj.mainMenu();
    }
}
