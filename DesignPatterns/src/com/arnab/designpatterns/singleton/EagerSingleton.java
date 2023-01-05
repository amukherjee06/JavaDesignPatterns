package com.arnab.designpatterns.singleton;

/**
 * We are creating the instance during initialization of the static variable
 */
public class EagerSingleton {

    //1.Create a static instance variable to initialize the instance
    private static EagerSingleton eagerSingletoninstance=new EagerSingleton();
    //2.Make the constructor private
    private EagerSingleton(){

    }
    //3.Create a public static method to return the instance created.
    public static EagerSingleton getInstance(){
        return eagerSingletoninstance;
    }
}
