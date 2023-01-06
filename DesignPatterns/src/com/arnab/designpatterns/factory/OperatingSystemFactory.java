package com.arnab.designpatterns.factory;

public class OperatingSystemFactory {

    //Make the constructor private
    private OperatingSystemFactory(){

    }

    public static OperatingSystems getInstance(String type,String version,String architecture){

        switch (type){
            case "WINDOWS":
                return new WindowsOperatingSystem(version,architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not Supported");
        }

    }
}
