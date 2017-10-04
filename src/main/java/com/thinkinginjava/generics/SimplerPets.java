//: com.thinkinginjava.generics/SimplerPets.java
import com.thinkinginjava.typeinfo.pets.*;
import java.util.*;
import com.thinkinginjava.net.mindview.util.*;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
