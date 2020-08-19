package testLessonOne;

import org.testng.annotations.Test;

public class FirstTest {
    private FirstMain firstmain = new FirstMain();

    @Test
    public void getWeatherTest() throws Exception {
        System.out.println(firstmain.getWeather("winter"));
    }

}
