//: com.thinkinginjava.generics/SimplerPets.java

import com.thinkinginjava.net.mindview.util.New;
import com.thinkinginjava.typeinfo.pets.Person;
import com.thinkinginjava.typeinfo.pets.Pet;

import java.util.Map;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
} ///:~
