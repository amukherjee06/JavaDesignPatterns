package com.arnab.designpatterns.singleton;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        exampleSerialization();
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
