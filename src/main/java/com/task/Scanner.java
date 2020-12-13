package com.task;

import org.reflections.Reflections;

import java.util.Set;

public class Scanner {
    private static Reflections scanner = new Reflections("com.task");

    public static <T> Class<? extends T> getImplemention(Class<T> aClass){
        Set<Class<? extends T>> classes = scanner.getSubTypesOf(aClass);
        if (classes.size() != 1){
            throw new RuntimeException(aClass.getName() + " has invalid number of implementations");
        }
        return classes.iterator().next();
    }
}
