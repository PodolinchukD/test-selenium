package testLessonOne;

import org.testng.annotations.Test;

public class FirstTest {
    private FirstMain firstmain = new FirstMain();

    @Test
    public void getWeatherTest() throws Exception {
        System.out.println(firstmain.getWeather("winter"));
    }

    @Test
    public void getFingerTest() throws Exception {
        System.out.println(firstmain.getFinger(1));
    }

    @Test
    public void getPriceTest() throws Exception {
        System.out.println(firstmain.getPrice(700));
    }

    @Test
    public void getDayTypeTest() throws Exception {
        System.out.println(firstmain.getDayType("Saturday"));
    }

}
