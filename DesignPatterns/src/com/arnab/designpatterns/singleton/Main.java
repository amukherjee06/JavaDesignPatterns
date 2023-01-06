package com.arnab.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //exampleSerialization();
        exampleReflection();
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {

        //using Reflection we are invoking the declared constructor
        // and setting the accessibility to true
        Constructor[] constructors=LazySingleton.class.getDeclaredConstructors();
        Constructor constructor=constructors[0];
        constructor.setAccessible(true);

        LazySingleton lazySingleton= (LazySingleton) constructor.newInstance();
        LazySingleton instance=LazySingleton.getInstance();

        System.out.println("Reflected singleton hashcode :: "+lazySingleton.hashCode());
        System.out.println("Singleton instance hashcode :: "+instance.hashCode());

        //All the solution using EnumSingleton

        EnumSingleton enumSingletonInstance=EnumSingleton.INSTANCE;
        System.out.println("Enum singleton instance hashcode :: "+enumSingletonInstance.hashCode());
    }

    private static void exampleSerialization() throws IOException, ClassNotFoundException {

        //This will break

/*        LazySingleton lazySingleton=LazySingleton.getInstance();

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.obj"));
        oos.writeObject(lazySingleton);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserializedLazySingleton= (LazySingleton) ois.readObject();
        ois.close();*/

        SerializableSingleton serializableSingleton=SerializableSingleton.getInstance();

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.obj"));
        oos.writeObject(serializableSingleton);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableSingleton deserializedLazySingleton= (SerializableSingleton) ois.readObject();
        ois.close();

        System.out.println("Object 1 :: "+serializableSingleton.hashCode());
        System.out.println("Object 2 :: "+deserializedLazySingleton.hashCode());
    }
}
