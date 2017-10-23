//: com.thinkinginjava.polymorphism/shape/Triangle.java
package com.thinkinginjava.polymorphism.shape;

import static com.thinkinginjava.net.mindview.util.Print.print;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
} ///:~
