//: com.thinkinginjava.enumerated/menu/TypeOfFood.java
package com.thinkinginjava.enumerated.menu;

import static com.thinkinginjava.enumerated.menu.Food.*;

public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
} ///:~
