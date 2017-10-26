package com.thinkinginjava.typeinfo;

import com.thinkinginjava.net.mindview.util.TypeCounter;
import com.thinkinginjava.typeinfo.pets.Pet;
import com.thinkinginjava.typeinfo.pets.Pets;

import static com.thinkinginjava.net.mindview.util.Print.print;
import static com.thinkinginjava.net.mindview.util.Print.printnb;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}