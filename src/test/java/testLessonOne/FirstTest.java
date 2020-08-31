package testLessonOne;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FirstTest {
    private static FirstMain firstmain = new FirstMain();

    @Test
    public void getWeatherTest() throws Exception {
        String season = "winter";
        System.out.println(FirstMain.getWeather(season));
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
        String day = "SUNdaY";
        System.out.println(firstmain.getDayType(day));
    }

    @Test
    public void reverseMethod() throws Exception {
        int[] arrayExample = {7, 10, 5, 13, 2, 21};
        System.out.println(Arrays.toString(firstmain.reverseMethod(arrayExample)));
    }

    @Test
    public void maxElementMethod() throws Exception {
        int[] arrayExample2 = {17, 110, 15, 113, 12, 121};
        System.out.println(firstmain.maxElementMethod(arrayExample2));
    }

    @Test
    public void minElementMethod() throws Exception {
        int[] arrayExample3 = {12, 32, 67, 100, 67, 1, 27};
        System.out.println(firstmain.minElementMethod(arrayExample3));
    }

}
