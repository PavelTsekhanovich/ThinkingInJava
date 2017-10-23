//: com.thinkinginjava.polymorphism/shape/Square.java
package com.thinkinginjava.polymorphism.shape;

import static com.thinkinginjava.net.mindview.util.Print.print;

public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
} ///:~
