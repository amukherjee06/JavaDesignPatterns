package com.arnab.designpatterns.singleton;

public class MultiThreadedSingleton {

    private static MultiThreadedSingleton multiThreadedSingletonInstance = null;

    private MultiThreadedSingleton(){

    }

    public static MultiThreadedSingleton getInstance(){

        if(multiThreadedSingletonInstance==null){

            //All threads comes till this point.
            //So we will perform a null check.
            //The purpose is to provide an object to each thread but to create the instance only once.
            synchronized (MultiThreadedSingleton.class){
                if(multiThreadedSingletonInstance==null){
                    multiThreadedSingletonInstance=new MultiThreadedSingleton();
                }
            }
        }
        return multiThreadedSingletonInstance;
    }
}
