package com.thinkinginjava.generics;

import java.util.ArrayList;

public class NonCovariantGenerics {
    // Compile Error: incompatible types:
    ArrayList<Apple> flist = new ArrayList<Apple>();
} ///:~
