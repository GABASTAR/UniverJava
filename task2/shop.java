package task2;
import java.util.ArrayList;
import java.util.Scanner;

public class shop {

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

    public static void main() {
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
}
