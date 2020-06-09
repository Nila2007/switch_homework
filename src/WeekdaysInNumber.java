import java.util.Scanner;
// week days using number 0 to 6
public class WeekdaysInNumber {
    public static void main(String[]args) { // main method
        int day;
        Scanner scanner = new Scanner(System.in); // use scanner for input  the number
        System.out.println("Enter a weekday number (0 to 6) : ");
        day=scanner.nextInt();
        switch (day){
            case 0 :
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid"); 
                break;
        }



    }
}
