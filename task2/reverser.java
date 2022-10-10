package task2;

public class reverser {
    public static void main() {
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
}
