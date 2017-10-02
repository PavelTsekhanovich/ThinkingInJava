package part.four;

public class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // ... remove peel
        return apple; // Peeled
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}