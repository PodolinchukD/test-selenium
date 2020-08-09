import java.util.Scanner;

public class InputOutputTask3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number of a finger:");
        int fingerNumber = in.nextInt();
        switch (fingerNumber){
            case 1:
                System.out.println("It's a Thumb finger");
                break;
            case 2:
                System.out.println("It's a Index finger");
                break;
            case 3:
                System.out.println("It's a Middle finger");
                break;
            case 4:
                System.out.println("It's a Ring finder");
                break;
            case 5:
                System.out.println("It's a Little finger");
                break;
            default:
                System.out.println("You write a wrong number!");
        }
    }
}
