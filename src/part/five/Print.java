package part.five;

import java.io.PrintStream;

public class Print {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Перевод строки:
    public static void print() {
        System.out.println();
    }

    // Печать без перевода строки:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    // Новая конструкция Java SE5 printf() (from C):
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
