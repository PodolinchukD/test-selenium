package testLessonOne;

import java.util.Arrays;

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

//    public static int[] reverseMethod(int[] array) {
//        for (int i = 0; i < array.length >> 1; i ++) {
//            array[array.length-1-i] ^= array[i] ^= array[array.length-1-i];
//            array[i] ^= array[array.length-1-i];
//        }
//        return array;
//    }

    public static int[] reverseMethod(int[] array) {
        for (int i = 0; i < array.length / 2; i ++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static int maxElementMethod(int[] array2) {
        int max = array2[0];
        for(int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max=array2[i];
            }
        }
        return max;
    }

    public static int minElementMethod(int[] array3) {
        int min = array3[0];
        for(int i = 0; i < array3.length; i++) {
            if (array3[i] < min) {
                min=array3[i];
            }
        }
        return min;
    }

    public static int[] twoMaxElementMethod(int[] array4) {
        int size = array4.length;
        Arrays.sort(array4);
        int maxFirst = array4[size-1];
        int maxSecond = array4[size-2];
        int[] arrayNew = {maxFirst, maxSecond};
        return arrayNew;
    }

    public static int dividingMethod(int[] array5){
        int sum = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 == 0 & !(array5[i] % 3 == 0)) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] counterAndElement(int[] array6){
        int max = 0 ;
        int count[] = new int[array6.length];
        for(int i = 0 ; i <array6.length ; i++) {
            int ch = array6[i];
            count[ch] +=1 ;
        }

        int chh = 0;
        for(int i = 0 ; i <array6.length ;i++)  {
            int ch = array6[i];
            if(count[ch] > max) {max = count[ch] ; chh = ch ;}
        }
        int[] arrayNew1 = {max, chh};
        return arrayNew1;

    }

}