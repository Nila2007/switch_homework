import java.util.Scanner;

public class Even_oddNumber {
    public static void main(String[]args){
        //int num1= 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=scanner.nextInt();
        switch (num%2){
            case 0:
                System.out.println(num + " is a Even number");
                break;
            case 1:
                System.out.println(num + " is Odd number");
                break;
        }
    }
}
