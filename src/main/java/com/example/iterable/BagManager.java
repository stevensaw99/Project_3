package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BagManager
{
    public static void main(String[] args)
    {
        Container<String> stringBag = new Bag<>();
        List<String> stringBag = new ArrayList<>();

        stringBag.add("Apple");
        stringBag.add("Orange");
        stringBag.add("Banana");
        stringBag.add("Tangerine");
        stringBag.add("Peach");

        stringBag.forEach(System.out::println);
        System.out.println();

        System.out.println("Empty? " + stringBag.isEmpty());
        System.out.println("Bag size: " + stringBag.size());
        System.out.println();

        Iterator<String> iter = stringBag.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }


}
