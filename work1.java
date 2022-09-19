import java.util.Scanner;
public class work1 {
    static public void prog1 () {
        System.out.println("Prog1");
        double[] array = {1, 2, 3, 4, 5, 6};
        double summa = 0;
        for (double elem : array) {
            summa+=elem;
        }
        double avgNum = summa/array.length;
        System.out.println(avgNum);
        System.out.println(summa);
    }
    static public void prog2 () {
        System.out.println("Prog2");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] splited = str.split("\\s+");
        int copunt = 0;
        double summ = 0;
        double min = 0;
        double max = 0;
        while (copunt < splited.length) {
            double num = Double.parseDouble(splited[copunt]);
            summ+=num;
            if (copunt == 0) {
                min = num;
                max = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            copunt++;
        }
        sc.close();
        System.out.println(summ);
        System.out.println(min);
        System.out.println(max);
    }
    static public void prog3(String[] args) {
        System.out.println("Prog3");
        for (String elem: args) {
            System.out.println(elem);
        }

    }
    static public void prog4() {
        System.out.println("Prog4");
        double elem = 1;
        double i = 1;
        while (i <= 10) {
            i++;
            System.out.println(elem);
            elem+=1/i;
        }

    }
    static public void prog5(int num) {
        int finalNum = 1;
        for (int n = num; n>0; n--) {
            finalNum*=n;
        }
        System.out.println(finalNum);
    }
    public static void main(String[] args) {
        // prog1();
        // prog2();
        // prog3(args);
        prog4();
        prog5(5);
    }
}