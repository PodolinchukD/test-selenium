package testLessonOne;

public class FirstMain {

    public static String getWeather(String season) {

        switch (season.toLowerCase()) {
            case "winter":
                return "It is cold";
            case "spring":
                return "It is damp";
            case "summer":
                return "It is hot";
            case "autumn":
                return "It is rainy";
            default:
                return "You write wrong season name!";
        }
    }

    public static String getFinger(int fingerNumber) {
        switch (fingerNumber) {
            case 1:
                return "It's a Thumb finger";
            case 2:
                return "It's a Index finger";
            case 3:
                return "It's a Middle finger";
            case 4:
                return "It's a Ring finder";
            case 5:
                return "It's a Little finger";
            default:
                return "You write a wrong number!";
        }
    }

    public static String getPrice(int moneyQuantity) {
        if (moneyQuantity < 1000) {
            return "Your price is good!";
        } else {
            return "Your price is too big!";
        }
    }

    public static String getDayType(String dayOfWeek) {
        if (dayOfWeek.equals("monday")  || dayOfWeek.equals("tuesday") || dayOfWeek.equals("wednesday") || dayOfWeek.equals("thursday") || dayOfWeek.equals("friday")) {
            return "It's a weekday!";
        } else if (dayOfWeek.equals("saturday") || dayOfWeek.equals("sunday")) {
            return "It's a day off!";
        } else {
            return "You write a wrong word/day!";
        }
    }
}