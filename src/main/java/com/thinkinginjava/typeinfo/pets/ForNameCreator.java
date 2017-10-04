//: com.thinkinginjava.typeinfo/pets/ForNameCreator.java
package com.thinkinginjava.typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "com.thinkinginjava.typeinfo.pets.Mutt",
    "com.thinkinginjava.typeinfo.pets.Pug",
    "com.thinkinginjava.typeinfo.pets.EgyptianMau",
    "com.thinkinginjava.typeinfo.pets.Manx",
    "com.thinkinginjava.typeinfo.pets.Cymric",
    "com.thinkinginjava.typeinfo.pets.Rat",
    "com.thinkinginjava.typeinfo.pets.Mouse",
    "com.thinkinginjava.typeinfo.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
