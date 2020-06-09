import java.util.Scanner;
// Reverse string
public class ReverseString {
    public static void main(String[]args){
       System.out.println("Enter string to revers :"); // input string to use scanner
        Scanner scanner = new Scanner(System.in);
        String svr = scanner.nextLine();
        StringBuilder sb = new StringBuilder(svr); // use StringBilder formula.

        System.out.println("Reversed string is:"); // string will reverse.

        System.out.println(sb.reverse().toString());


    }
}
