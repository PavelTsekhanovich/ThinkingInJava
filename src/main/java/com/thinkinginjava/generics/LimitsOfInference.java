package com.thinkinginjava.generics;

import com.thinkinginjava.typeinfo.pets.Person;
import com.thinkinginjava.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        // f(New.map()); // Does not compile
    }
}
