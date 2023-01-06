package com.arnab.designpatterns.factory;

public class WindowsOperatingSystem  extends OperatingSystems{
    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir() {
        System.out.println("Windows - directory changed");
    }

    @Override
    public void removeDir() {
        System.out.println("Windows - directory removed");
    }
}
