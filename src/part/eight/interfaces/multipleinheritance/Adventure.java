package part.eight.interfaces.multipleinheritance;

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Используем объект в качестве типа CanFight
        u(h); // Используем объект в качестве типа CanSwim
        v(h); // Используем объект в качестве типа CanFly
        w(h); // Используем объект в качестве ActionCharacter

    }
}