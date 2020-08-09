import java.util.Scanner;

public class InputOutputTask4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a day of week, pls(Use a capital letter):");
        String dayWeek = in.next();

        if (dayWeek.equals("Monday") || dayWeek.equals("Tuesday") || dayWeek.equals("Wednesday") || dayWeek.equals("Thursday") || dayWeek.equals("Friday")){
            System.out.println("It's a weekday!");
        }
        else if (dayWeek.equals("Saturday") || dayWeek.equals("Sunday")){
            System.out.println("It's a day off!");
        }
        else{
            System.out.println("You write a wrong word/day!");
        }

    }
}