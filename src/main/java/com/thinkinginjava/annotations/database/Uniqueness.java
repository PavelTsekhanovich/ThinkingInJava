//: com.thinkinginjava.annotations/database/Uniqueness.java
// Sample of nested com.thinkinginjava.annotations
package com.thinkinginjava.annotations.database;

public @interface Uniqueness {
    Constraints constraints()
            default @Constraints(unique = true);
} ///:~
