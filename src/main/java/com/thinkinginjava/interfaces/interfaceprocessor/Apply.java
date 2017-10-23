//: com.thinkinginjava.interfaces/interfaceprocessor/Apply.java
package com.thinkinginjava.interfaces.interfaceprocessor;

import static com.thinkinginjava.net.mindview.util.Print.print;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
} ///:~
