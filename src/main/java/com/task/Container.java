package com.task;

import java.util.HashMap;
import java.util.Map;

public class Container {
    private static Map<String, Object> container = new HashMap<String, Object>();

    public Object get(String key){
        return container.get(key);
    }

    public void put(String key, Object value){
        container.put(key, value);
    }

    public boolean containsKey(String key){
       return container.containsKey(key);
    }

}
