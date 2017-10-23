package com.thinkinginjava.containers;//: com.thinkinginjava.containers/IndividualTest.java

import com.thinkinginjava.holding.MapOfList;
import com.thinkinginjava.typeinfo.pets.Individual;
import com.thinkinginjava.typeinfo.pets.Pet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndividualTest {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<Individual>();
        for (List<? extends Pet> lp :
                MapOfList.petPeople.values())
            for (Pet p : lp)
                pets.add(p);
        System.out.println(pets);
    }
}