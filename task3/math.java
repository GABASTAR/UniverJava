package task3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class math {
    public static void main() {
        System.out.println("Using Math.random()");
        ArrayList<Double> arr = new ArrayList<Double>();
        for (int i = 0; i<=10; i++) {
            BigDecimal bd = new BigDecimal(Math.random()*10).setScale(2, RoundingMode.HALF_UP);
            double rndNum = bd.doubleValue();
            arr.add(rndNum);
        }
        System.out.println(arr + " - not sorted");
        Collections.sort(arr);
        System.out.println(arr + " - sorted");
        System.out.println("Using Random class");
        Random rnd = new Random();
        ArrayList<Double> arrRand = new ArrayList<Double>();
        for (int i = 0; i<=10; i++) {
            BigDecimal bd = new BigDecimal(rnd.nextDouble(0, 100)).setScale(2, RoundingMode.HALF_UP);
            double rndNum = bd.doubleValue();
            arrRand.add(rndNum);
        } 
        System.out.println(arrRand + " - not sorted");
        Collections.sort(arrRand);
        System.out.println(arrRand + " - sorted");
    }
}
