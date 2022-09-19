import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class work2 {
    static public class Author {
        private String name, email;
        private char gender;
        public Author (String name, String email, char gender) {
            this.email = email;
            this.name = name;
            this.gender = gender;
        }
        public String getName() {
            return this.name;
        }
        public String getEmail() {
            return this.email;
        }
        public char getGender() {
            return this.gender;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String toString() {
            return "Author: {\n\tname: "+this.name+",\n\temail: "+this.email+",\n\tgender: "+this.gender+"\n}";
        }
    }

    static public void prog1() {
        Author TestAuthor = new Author("Ivan", "megaVanya@mega.kryt", 'm');
        System.out.println(TestAuthor.getEmail() + "\n" + TestAuthor.getName() + "\n" + TestAuthor.getGender());
        TestAuthor.setEmail("noviyIvan@ya.ru");
        System.out.println(TestAuthor.toString());
    }

    static public class Ball {
        private double x = 0, y = 0;
        public Ball (double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Ball () {}
        public double getX() {
            return this.x;
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
        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public void move(double xDisp, double yDisp) {
            this.x += xDisp;
            this.y += yDisp;
        }
        public String toString() {
            return "Ball: {\nX:\t"+this.x+",\nY:\t"+this.y+"\n}";
        }
    }
    static public void prog2() {
        Ball TestBall = new Ball(4, 6);
        System.out.println(TestBall.getX() + "\n" + TestBall.getY());
        TestBall.setX(8);
        TestBall.setY(9);
        System.out.println(TestBall.toString());
        TestBall.move(2, 4);
        System.out.println(TestBall.toString());
        TestBall.setXY(1, 1);
        System.out.println(TestBall.toString());
    }

    static public class Computer {
        String model;

        public Computer(String model) {
            this.model = model;
        }

        public String toString() {
            return "Computer: {\nmodel:\t" + model + "\n}";
        }
    }

    static public class Shop {
        ArrayList<Computer> computerArrayList = new ArrayList<>();

        public void addComputer(Computer computer) {
            computerArrayList.add(computer);
        }

        public void removeComputer(Computer computer) {
            computerArrayList.remove(computer);
        }

        public Computer search(String model) {
            for (Computer computer : computerArrayList) {
                if (computer.model.equals(model)) {
                    return computer;
                }
            }
            return null;
        }
    }

    public static void prog3() {
        System.out.println("Enter 4 puter names:");
        Scanner scanner = new Scanner(System.in);
        Computer computer1 = new Computer(scanner.nextLine());
        Computer computer2 = new Computer(scanner.nextLine());
        Computer computer3 = new Computer(scanner.nextLine());
        Computer computer4 = new Computer(scanner.nextLine());
        Shop shop = new Shop();
        shop.addComputer(computer1);
        shop.addComputer(computer2);
        shop.addComputer(computer3);
        shop.addComputer(computer4);
        shop.removeComputer(computer1);
        System.out.println("Searching for...");
        String search = scanner.nextLine();
        scanner.close();
        System.out.println(shop.search(search));
    }

    public static void reverser() {
        String[] strings = {"Some", "Random", "Weird", "Stuff"};
        String temp;
        int i2;
        for (int i = 0; i < strings.length / 2; i++) {
            temp = strings[i];
            i2 = strings.length - 1 - i;
            strings[i] = strings[i2];
            strings[i2] = temp;
        }
        System.out.println(strings);
    }

    public static void poker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players:");
        int n = scanner.nextInt();
        if (n > 9) {
            System.out.println("Too many players for poker, max 9");
            System.exit(1);
        }
        ArrayList<Card> deck = new ArrayList<>();
        Random random = new Random();
        for (int suit = 1; suit <= 4; suit++) {
            for (int v = 2; v <= 14; v++) {
                deck.add(new Card(suit, v));
            }
        }
        int index;
        for (int j = 0; j < 5 * n; j++) {
            if (j % 5 == 0) {
                System.out.println("\nPlayer " + (j/5 + 1) + ":");
            }
            index = random.nextInt(0, deck.size());
            System.out.println("\t"+deck.get(index));
            deck.remove(index);
        }
        scanner.close();
        System.out.println(deck);
    }
    
    static public class Card {
        private int suit, value;
        static char[] high = {'J', 'Q', 'K', 'A'};
        static String[] suits = {"Hearts", "Tiles", "Clovers", "Pikes"};
    
        public Card(int suit, int value) {
            this.suit = suit;
            this.value = value;
        }
    
        public String toString() {
            if (value > 10) {
                return suits[suit - 1] + ", " + high[value - 11];
            }
            return suits[suit - 1] + ", " + value;
        }
    }

    public static void HowMany(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandInput = scanner.nextLine();
        System.out.println(commandInput.split("\\+s").length);
        scanner.close();
    }
    
    public static void main(String[] args) {
        // prog1();
        // prog2();
        // prog3();
        // reverser();
        // poker();
        // HowMany(args);
    }
}
