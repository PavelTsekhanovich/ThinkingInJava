package part.eight.interfaces.interfaceprocessor;

import static part.five.Print.print;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
