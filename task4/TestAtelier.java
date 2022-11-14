package task4;

import java.util.ArrayList;

public class TestAtelier {
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();
        TShirt tShirt = new TShirt(Size.M, 249.99, "white");
        Pants pants = new Pants(Size.XS, 2099.99, "black");
        Skirt skirt = new Skirt(Size.L, 1599.99, "blue");
        Tie tie = new Tie(Size.S, 599.99, "brown");
        clothes.add(tShirt);
        clothes.add(pants);
        clothes.add(skirt);
        clothes.add(tie);
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWomen(clothes);
    }
}


enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this.equals(XXS)) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }
    
    public String toString() {
        return "Size{" + this.name() +
                ", euroSize=" + euroSize +
                '}';
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    private Size size;
    private double price;
    private String color;

    enum Gender {
        MALE,
        FEMALE,
        BOTH
    }

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    abstract public Gender getClothesGender();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public Gender getClothesGender() {
        return Gender.BOTH;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressWomen() {
        System.out.println("T-shirt is put on woman");
    }

    @Override
    public void dressMan() {
        System.out.println("T-shirt is put on man");
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public Gender getClothesGender() {
        return Gender.BOTH;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressWomen() {
        System.out.println("Pants are put on woman");
        
        
    }

    @Override
    public void dressMan() {
        System.out.println("Pants are put on man");
        
        
    }
}

class Skirt extends Clothes implements WomenClothing {

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public Gender getClothesGender() {
        return Gender.FEMALE;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt is put on woman");
        
    }
}

class Tie extends Clothes implements MenClothing {

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public Gender getClothesGender() {
        return Gender.MALE;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressMan() {
        System.out.println("Tie is put on man");
        
    }
    
}
class Atelier {

    public void dressMan(ArrayList<Clothes> clothes) {
        for (Clothes element : clothes) {
            if (element instanceof MenClothing) {
                ((MenClothing) element).dressMan();
            }
        }
    }

    public void dressWomen(ArrayList<Clothes> clothes) {
        for (Clothes element : clothes) {
            if (element instanceof WomenClothing) {
                ((WomenClothing) element).dressWomen();
            }
        }
    }
}

