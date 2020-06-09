import java.util.Scanner;

import static java.lang.System.*;

public class Vowel_Consonant { //To check charecter is vowel or consonant
    public static void main(String[]args){
       char ch; //variable declaration
        Scanner scanner = new Scanner(in);
        out.println("Enter the Alphabet :");
         ch=scanner.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println(ch + " is a vowel:");
                break;
            case 'e':
                System.out.println(ch + "is vowel:");
                break;
            case 'i':
                System.out.println(ch + "is a vowel");
                break;
            case 'u':
                System.out.println(ch + "is  vowel");
                break;
            case 'I':
                System.out.println(ch + "is avowel:");
                break;
            case 'O' :
                System.out.println(ch + "is a vowel");
                break;
            case 'U':
                out.println(ch + "This is a vowel");
                break;
            case 'E':
                out.println(ch + "This is a vowel");
                break;
            case 'A':
                out.println(ch + "is a vowel");
                break;
            case 'o':
                out.println(ch + "is a vowel");
                break;
            default:

                System.out.println(ch + " is a consonant");
                break;

        }



    }
}
