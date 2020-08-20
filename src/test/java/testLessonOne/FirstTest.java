package testLessonOne;

import org.testng.annotations.Test;

import java.util.Locale;

public class FirstTest {
    private FirstMain firstmain = new FirstMain();

    @Test
    public void getWeatherTest() throws Exception {
        String season = "winter";
        System.out.println(firstmain.getWeather(season));
    }

    @Test
    public void getFingerTest() throws Exception {
        int finger = 1;
        System.out.println(firstmain.getFinger(finger));
    }

    @Test
    public void getPriceTest() throws Exception {
        int money = 700;
        System.out.println(firstmain.getPrice(money));
    }

    @Test
    public void getDayTypeTest() throws Exception {
        String day = "saturday";
        System.out.println(firstmain.getDayType(day.toLowerCase()));
    }

}
