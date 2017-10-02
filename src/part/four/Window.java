package part.four;

public class Window {
    Window(int marker) {
        System.out.print("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // Перед конструктором

    House() {
        // Показывает, что выполняется конструктор:
        System.out.print("House()");
        w3 = new Window(33); // Повторная инициализация w3
    }

    Window w2 = new Window(2); // После конструктора

    void f() {
        System.out.print("f()");
    }

    Window w3 = new Window(3);  // В конце
}

class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Показывает, что объект сконструирован
    }
}