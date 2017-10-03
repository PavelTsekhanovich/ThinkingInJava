package part.seven.polymorphism.music;

public class Brass extends Instrument {
    public void play(Note n) {
        System.out.println("Brass.play()" + n);
    }
}
