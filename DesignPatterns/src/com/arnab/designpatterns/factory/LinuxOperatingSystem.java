package com.arnab.designpatterns.factory;

public class LinuxOperatingSystem extends OperatingSystems{


    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir() {
        System.out.println("Linux - directory changed");
    }

    @Override
    public void removeDir() {
        System.out.println("Linux - directory removed");
    }
}
