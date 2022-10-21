package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag implements Container<T>
{
    private T t;

    public interface void set(T t)
        {
            this.t = t;
        }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    // Extra credit attempt

    @Override
    public Spliterator<T> spliterator()
    {
        return Container.super.spliterator();
    }

    public void forEach(Consumer<? super T> action)
    {
        Container.super.forEach(action);
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(T item) {

    }

    public interface T get()
        {
            return t;
        }


}
