package task3;

public class types {
    public static void main() {
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
}
