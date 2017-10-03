package part.ten;

import java.util.ArrayList;

public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        // He препятствует добавлению объекта Orange:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++)
            ((Apple) apples.get(i)).id();
        // Объект Orange обнаруживается только во время выполнения
    }
}