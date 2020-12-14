package com.task;

public class SynchronizedObjectFactory {
    private static Container container = new Container();
    public static <T> T getInstance(Class<T> aClass) throws Exception {
        T object;

        if(container.containsKey(aClass.getName())){
            return (T) container.get(aClass.getName());
        }
        Class implClass;
        synchronized (aClass){
            if(aClass.isInterface()){
                implClass = Scanner.getImplemention(aClass);
            }
            else{
                implClass = aClass;
            }
            object = (T) implClass.getConstructor().newInstance();
            container.put(aClass.getName(), object);
        }

        return object;


    }
}
