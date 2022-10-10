package task3;
import java.util.Random;

public class increaseArr {
    public static void main() {
        int[] intArr = new int[4];
        Random rnd = new Random();
        String str = "";
        Boolean flag = true;
        for (int l = 0; l<intArr.length; l++) {
            intArr[l] = rnd.nextInt(90) + 10;
            str += String.valueOf(intArr[l]) + " ";
            if (l > 0 && intArr[l-1] > intArr[l]) {
                flag = false;
            }
        }
        System.out.println(str);
        System.out.println("Is array increasing: " + flag);
    }
}
