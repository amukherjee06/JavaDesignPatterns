package com.arnab.designpatterns.factory;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystems osWindows=OperatingSystemFactory.getInstance("WINDOWS","1","arch_Windows");
        OperatingSystems osLinux=OperatingSystemFactory.getInstance("LINUX","1","arch_Linux");
        //OperatingSystems osMac=OperatingSystemFactory.getInstance("Mac","1","arch_Mac");

        System.out.println("-----WINDOWS--------");
        osWindows.changeDir();
        osWindows.removeDir();
        System.out.println("------------------------------------------------");

        System.out.println("-----LINUX--------");
        osLinux.changeDir();
        osLinux.removeDir();
        System.out.println("------------------------------------------------");

/*
        System.out.println("-----Mac--------");
        osMac.changeDir();
        osMac.removeDir();
        System.out.println("------------------------------------------------");
*/

    }
}
