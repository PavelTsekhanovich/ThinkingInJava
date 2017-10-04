//: com.thinkinginjava.generics/ExplicitTypeSpecification.java
import com.thinkinginjava.typeinfo.pets.*;
import java.util.*;
import com.thinkinginjava.net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
