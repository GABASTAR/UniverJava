package task3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class shop {
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
    
    public static class Employee {
        private String fullName;
        private double salary;
    
        public String getFullName() {
            return fullName;
        }
    
        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    
        public double getSalary() {
            return salary;
        }
    
        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
    
    public static class Report {
        public static void generateReport(ArrayList<Employee> employees) {
            for (Employee employee : employees) {
                System.out.printf("%-5s %10.2f%n", employee.getFullName(), employee.getSalary());
            }
        }
    }

    public static void main() {
        NumberFormat numberFormatUSD = NumberFormat.getCurrencyInstance(Locale.US);
        final String RUB_SYMBOL = " rub";
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

        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setFullName("John");
        employee1.setSalary(17000);
        Employee employee2 = new Employee();
        employee2.setFullName("Elvis");
        employee2.setSalary(34000);
        Employee employee3 = new Employee();
        employee3.setFullName("Kenny");
        employee3.setSalary(20000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        Report.generateReport(employees);
    }
}
