public class InputOutputTask1 {

    public static void main(String[] args) {
        System.out.println(getWeather("Winter"));
    }
    public static String getWeather(String season) {

        switch (season.toLowerCase()) {
            case "winter": return "It is cold";
            case "spring": return "It is damp";
            case "summer": return "It is hot";
            case "autumn": return "It is rainy";
            default: return "You write wrong season name!";
        }
    }
}
