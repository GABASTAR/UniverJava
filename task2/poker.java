package task2;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class poker {

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
    
    public static void main() {
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
    
}
