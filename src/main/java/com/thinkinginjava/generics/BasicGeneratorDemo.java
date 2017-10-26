package com.thinkinginjava.generics;

import com.thinkinginjava.net.mindview.util.BasicGenerator;
import com.thinkinginjava.net.mindview.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}