package com.task;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ObjectFactory {
    private static Container container = new Container();


    public static <T> T getInstance(Class<T> aClass) throws Exception {
        if(container.containsKey(aClass.getName())){
            return (T) container.get(aClass.getName());
        }
        Class implClass;
        if(aClass.isInterface()){
            implClass = Scanner.getImplemention(aClass);
        }
        else{
            implClass = aClass;
        }
        T object = (T) implClass.getConstructor().newInstance();
        container.put(aClass.getName(), object);
        return object;


    }
}
