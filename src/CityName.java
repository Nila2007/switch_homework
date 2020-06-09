import java.util.Scanner;

public class CityName { // print the city name in odrder of alphabet a to f.
    private static char a;

    public static void main(String[]args){ // main method
        Scanner scanner = new Scanner(System.in); //  input city name to use scanner
        char ch;
        System.out.println("Please Enter any alphabet:");
        ch=scanner.next().charAt(0); // use char method


        switch (ch) {
            case 'a':
                System.out.println(a+"Ahmadabad ");
                break;
            case 'b' :
                System.out.println("Birmingham");
                break;
            case 'c':
                System.out.println("Cardiff");
                break;
            case 'd':
                System.out.println("Derby");
                break;
            case 'e':
                System.out.println("Edinburgh");
                break;
            case 'f':
                System.out.println("Fuji");
                break;
            default:
                System.out.println("Invalid Entry");


        }







    }
}
