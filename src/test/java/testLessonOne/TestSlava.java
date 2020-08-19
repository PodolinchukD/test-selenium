package testLessonOne;

import org.testng.annotations.Test;

public class TestSlava {
    public static String getWeather(String season) {

        switch (season.toLowerCase()) {
            case "winter": return "It is cold";
            case "spring": return "It is damp";
            case "summer": return "It is hot";
            case "autumn": return "It is rainy";
            default: return "You write wrong season name!";
        }
    }

    @Test
    public void testMethod() {
        System.out.println(getWeather("Winter"));
    }
}
