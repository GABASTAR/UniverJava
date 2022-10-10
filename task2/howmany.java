package task2;
import java.util.Scanner;

public class howmany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandInput = scanner.nextLine();
        System.out.println(commandInput.split("\\+s").length);
        scanner.close();
    }
}
