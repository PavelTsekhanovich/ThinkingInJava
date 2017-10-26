package com.thinkinginjava.generics;

import com.thinkinginjava.net.mindview.util.New;
import com.thinkinginjava.typeinfo.pets.Person;
import com.thinkinginjava.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {

    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
}
