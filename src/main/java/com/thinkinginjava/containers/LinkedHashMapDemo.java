package com.thinkinginjava.containers;

import com.thinkinginjava.net.mindview.util.CountingMapData;

import java.util.LinkedHashMap;

import static com.thinkinginjava.net.mindview.util.Print.print;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedMap =
                new LinkedHashMap<Integer, String>(
                        new CountingMapData(9));
        print(linkedMap);
        // Least-recently-used order:
        linkedMap =
                new LinkedHashMap<Integer, String>(16, 0.75f, true);
        linkedMap.putAll(new CountingMapData(9));
        print(linkedMap);
        for (int i = 0; i < 6; i++) // Cause accesses:
            linkedMap.get(i);
        print(linkedMap);
        linkedMap.get(0);
        print(linkedMap);
    }
}