import java.io.IOException;
import java.util.Scanner;

public class FindOutNumber {
    public static void main(String[]args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char key ='a';

        System.out.println("Enter a key");
       key = (char)System.in.read();
switch  (key) {
    case '0':
        System.out.println("You pressed 0.");
        break;
    case '1':
        System.out.println("You pressed 1.");
        break;
    case '2':
        System.out.println("You pressed 2.");
        break;
    case '3':
        System.out.println("You pressed 3.");
        break;
    case '4':
        System.out.println("You pressed 4.");
        break;
    case '5':
        System.out.println("You pressed 5.");
        break;
    case '6':
        System.out.println("You pressed 6.");
        break;
    case '7':
        System.out.println("You pressed 7.");
        break;
    case '8':
        System.out.println("You pressed 8.");
        break;
    case '9':
        System.out.println("You pressed 9.");
        break;

    default:
        System.out.println("Not allowed. :");
}

    }

}
