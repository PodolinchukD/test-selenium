import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a season, pls:");
        String seasonName = in.nextLine();
        switch (seasonName){
            case "winter":
                System.out.println("It is cold");
                break;
            case "spring":
                System.out.println("It is damp");
                break;
            case "summer":
                System.out.println("It is hot");
                break;
            case "autumn":
                System.out.println("It is rainy");
                break;
            default:
                System.out.println("You write wrong season name!");
        }
    }
}
