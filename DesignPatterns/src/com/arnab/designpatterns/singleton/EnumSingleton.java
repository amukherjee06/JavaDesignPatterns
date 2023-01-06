package com.arnab.designpatterns.singleton;

//ENUM constructors are called by JVM and not by user
//We don't have to worry about thread safety for Enum

public enum EnumSingleton {
    INSTANCE;

    public void someMethod(){
        System.out.println("That's cool");
    }
}
