package com.thinkinginjava.innerclasses;

import java.util.Collection;

public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    public static class Tester<L extends Collection<E>> {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}