package part.six;

public class Instrument {
    public void play() {
    }

    static void tune(Instrument i) {
        // ...
        i.play();
    }
}

// Объекты Wind также являются объектами interfaces,
// поскольку они имеют тот же интерфейс:
class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Восходящее преобразование
    }
}