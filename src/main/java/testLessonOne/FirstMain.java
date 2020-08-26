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
        if (dayOfWeek.equalsIgnoreCase("monday")  || dayOfWeek.equalsIgnoreCase("tuesday") || dayOfWeek.equalsIgnoreCase("wednesday") || dayOfWeek.equalsIgnoreCase("thursday") || dayOfWeek.equalsIgnoreCase("friday")) {
            return "It's a weekday!";
        } else if (dayOfWeek.equalsIgnoreCase("saturday") || dayOfWeek.equalsIgnoreCase("sunday")) {
            return "It's a day off!";
        } else {
            return "You write a wrong word/day!";
        }
    }

    public static int[] reverseMethod(int[] array) {
        for (int i = 0; i < array.length >> 1; i ++) {
            array[array.length-1-i] ^= array[i] ^= array[array.length-1-i];
            array[i] ^= array[array.length-1-i];
        }
        return array;
    }

    public static int maxElementMethod(int[] arrayExample2) {
        int max = arrayExample2[0];
        for(int i = 0; i < arrayExample2.length; i++) {
            if (arrayExample2[i] > max) {
                max=arrayExample2[i];
            }
        }
        return max;
    }
}