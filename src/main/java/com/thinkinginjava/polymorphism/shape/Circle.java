//: com.thinkinginjava.polymorphism/shape/Circle.java
package com.thinkinginjava.polymorphism.shape;

import static com.thinkinginjava.net.mindview.util.Print.print;

public class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        print("Circle.erase()");
    }
} ///:~
