package util;

public class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(Box3<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}