package com.arnab.designpatterns.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static SerializableSingleton serializableSingletonInstance = null;

    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        if(serializableSingletonInstance==null){
            serializableSingletonInstance=new SerializableSingleton();
        }
        return serializableSingletonInstance;
    }

    protected Object readResolve(){
        return serializableSingletonInstance;
    }
}
