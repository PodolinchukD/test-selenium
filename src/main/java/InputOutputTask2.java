import java.util.Scanner;

public class InputOutputTask2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you want for this product?");
        int price = in.nextInt();
        if(price < 1000) {
            System.out.println("Your price is good!");
        }
        else {
            System.out.println("Your price is too big!");
        }
    }
}
