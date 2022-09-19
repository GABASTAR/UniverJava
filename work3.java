import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class work3 {

    public static void prog1() {
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

    public static class Container {
        private Circle[] circles;
        private int size;
    
        public Circle[] getCircles() {
            return circles;
        }
    
        public void setCircles(Circle[] circles) {
            this.circles = circles;
        }
    
        public int getSize() {
            return size;
        }
    
        public void setSize(int size) {
            this.size = size;
        }
    
        public void sortCircles() {
            Arrays.sort(circles);
        }
    }
    
    public static class Point {
        private double x, y;
    
        public double getX() {
            return x;
        }
    
        public void setX(double x) {
            this.x = x;
        }
    
        public double getY() {
            return y;
        }
    
        public void setY(double y) {
            this.y = y;
        }
    
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    
    public static class Circle implements Comparable<Circle> {
        private Point center;
        private double radius;
    
        public Point getCenter() {
            return center;
        }
    
        public void setCenter(Point center) {
            this.center = center;
        }
    
        public double getRadius() {
            return radius;
        }
    
        public void setRadius(double radius) {
            this.radius = radius;
        }
    
        public String toString() {
            return "Circle{" +
                    "center=" + center +
                    ", radius=" + radius +
                    '}';
        }
    
        public int compareTo(Circle o) {
            return Double.compare(radius, o.radius);
        }
    }

    public static void prog2() {
        Random random = new Random();
        Point point = new Point();
        point.setX(0);
        point.setY(0);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        circle1.setCenter(point);
        circle2.setCenter(point);
        circle3.setCenter(point);
        circle4.setCenter(point);
        circle1.setRadius(random.nextDouble());
        circle2.setRadius(random.nextDouble());
        circle3.setRadius(random.nextDouble());
        circle4.setRadius(random.nextDouble());
        Container container = new Container();
        int size = 4;
        Circle[] circles = new Circle[size];
        circles[0] = circle1;
        circles[1] = circle2;
        circles[2] = circle3;
        circles[3] = circle4;
        container.setCircles(circles);
        container.setSize(size);
        System.out.println(Arrays.toString(container.getCircles()));
        container.sortCircles();
        System.out.println(Arrays.toString(container.getCircles()));
    }

    public static void prog3() {
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

    public static void prog4() {
        Random rnd = new Random();
        Boolean flag = true;
        int n = 0;
        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                n = Integer.parseInt(str);
                flag = false;
                sc.close();
            } catch (Exception e) {
                System.out.println("Incorrect input, try again");
            }
        }
        int[] arrInt = new int[n];
        int secArrNum = 0;
        for (int l = 0; l < arrInt.length; l++) {
            arrInt[l] = rnd.nextInt(n + 1);
            if (arrInt[l]%2 == 0) {
                secArrNum ++;
            }
            System.out.print(arrInt[l] + " ");
        }
        System.out.println();
        if (secArrNum > 0) {
            int[] secArr = new int[secArrNum];
            int nl = 0;
            for (int l = 0; l < arrInt.length; l++) {
                if (arrInt[l]%2 == 0) {
                    secArr[nl] = arrInt[l];
                    nl++;
                }
            }
            System.out.println(Arrays.toString(secArr));
        }
    }
    public static void prog5() {
        Double d1 = Double.valueOf("3.14");
        String s1 = "1.414";
        double d2 = Double.parseDouble(s1);
        byte b1 = d1.byteValue();
        short sh1 = d1.shortValue();
        int i1 = d1.intValue();
        long l1 = d1.longValue();
        float f1 = d1.floatValue();
        String s2 = Double.toString(d2);
        System.out.println("Double " + d1.doubleValue());
        System.out.println("float " + f1);
        System.out.println("long " + l1);
        System.out.println("int " + i1);
        System.out.println("short " + sh1);
        System.out.println("byte " + b1);
        System.out.println("String " + s2);
    }

    static final double USD_MULTIPLIER = 60.5;
    public static double convertToRUB(double a) {
        return a * USD_MULTIPLIER;
    }
    public static double convertToUSD(double a) {
        return a / USD_MULTIPLIER;
    }
    
    public static class Product {
        private String name;
        private double price;
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getPrice() {
            return price;
        }
    
        public void setPrice(double price) {
            this.price = price;
        }
    
        @Override
        public String toString() {
            return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
        }
    }
    
    public static class InternetShop {
        static NumberFormat numberFormatUSD = NumberFormat.getCurrencyInstance(Locale.US);
        static final String RUB_SYMBOL = "\u20BD";
        private ArrayList<Product> products;
    
        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }
    
        public void showProducts() {
            System.out.print("| ");
            for (Product product : products) {
                System.out.print(product.getName() + " | ");
            }
            System.out.print('\n');
        }
    
        public Product searchProducts(String choice) {
            for (Product product : products) {
                if (product.getName().equals(choice)) {
                    return product;
                }
            }
            return null;
        }
    }
    public static void prog6() {
        NumberFormat numberFormatUSD = NumberFormat.getCurrencyInstance(Locale.US);
        final String RUB_SYMBOL = "\u20BD";
        System.out.println("Choose mode:\n1. USD -> RUB\n2. RUB -> USD");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        double a, b;
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the amount in USD:");
                a = scanner.nextDouble();
                b = convertToRUB(a);
                System.out.println(numberFormatUSD.format(a) + " = " + b + RUB_SYMBOL);
            }
            case 2 -> {
                System.out.println("Enter the amount in RUB:");
                a = scanner.nextDouble();
                b = convertToUSD(a);
                System.out.println(a + RUB_SYMBOL + " = " + numberFormatUSD.format(b));
            }
            default -> {
                System.out.println("Incorrect input");
                scanner.close();
                System.exit(1);
            }
        }
        
        Product product1 = new Product();
        product1.setName("Pen");
        product1.setPrice(69.99);
        Product product2 = new Product();
        product2.setName("Pencil");
        product2.setPrice(19.99);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        InternetShop internetShop = new InternetShop();
        internetShop.setProducts(products);
        System.out.println("What are you willing to buy?");
        System.out.println("List of possible options:");
        internetShop.showProducts();
        Scanner sc = new Scanner(System.in);
        String productChoice = sc.nextLine();
        Product result = internetShop.searchProducts(productChoice);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("No such product found");
            sc.close();
            System.exit(1);
        }
        System.out.println("Choose payment method:\n1. USD\n2. RUB\n");
        int currencyChoice = sc.nextInt();
        switch (currencyChoice) {
            case 1 ->
                    System.out.println("It'll be " + InternetShop.numberFormatUSD.format(convertToUSD(result.getPrice())));
            case 2 -> System.out.printf("It'll be %f%s\n", result.getPrice(), InternetShop.RUB_SYMBOL);
            default -> {
                System.out.println("Incorrect input");
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        prog1();
        prog2();
        prog3();
        prog4();
        prog5();
        prog6();
    }
}
