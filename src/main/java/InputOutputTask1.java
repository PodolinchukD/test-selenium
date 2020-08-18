public class InputOutputTask1 {

    public static void main(String[] args) {
        String a = "winter";
        String b = "spring";
        String c = "summer";
        String d = "autumn";

        switch (a) {
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
