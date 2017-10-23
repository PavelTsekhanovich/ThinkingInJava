/*package com.thinkinginjava.xml;//: com.thinkinginjava.xml/People.java
// {Requires: nu.xom.Node; You must install
// the XOM library from http://www.xom.nu }
// {RunFirst: Person}

import com.oracle.webservices.internal.api.databinding.Databinding;
import com.thinkinginjava.typeinfo.pets.Person;
import nu.xom.*;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import java.util.ArrayList;

public class People extends ArrayList<Person> {
    public People(String fileName) throws Exception {
        Document doc = new Databinding.Builder().build(fileName);
        Elements elements =
                doc.getRootElement().getChildElements();
        for (int i = 0; i < elements.size(); i++)
            add(new Person(elements.get(i)));
    }

    public static void main(String[] args) throws Exception {
        People p = new People("People.com.thinkinginjava.xml");
        System.out.println(p);
    }
} */