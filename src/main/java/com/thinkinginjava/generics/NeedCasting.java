package com.thinkinginjava.generics;

import java.io.ObjectInputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class NeedCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
        //List<JRSUIConstants.Widget> shapes = (List<JRSUIConstants.Widget>) in.readObject();
    }
} ///:~
