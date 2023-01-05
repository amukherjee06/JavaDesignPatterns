package com.arnab.designpatterns.singleton;

import java.io.Serializable;

/**
 * We are creating an instance only after getInstance is invoked.That's why Lazy.
 */
public class LazySingleton implements Serializable {

    //1. Create an instance of the class
    private static LazySingleton lazySingletonInstance = null;

    //2.Make the constructor private
    private LazySingleton(){

    }

    //3.Create a public static method to create the instance once and assign it to the static variable
    public static LazySingleton getInstance(){
        if (lazySingletonInstance==null){
            lazySingletonInstance=new LazySingleton();
        }
        return lazySingletonInstance;
    }
}
