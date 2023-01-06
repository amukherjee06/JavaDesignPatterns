package com.arnab.designpatterns.factory;

public abstract class OperatingSystems {

    private String version;
    private String architecture;

    public String getVersion() {
        return version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public OperatingSystems(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public abstract void changeDir();
    public abstract void removeDir();
}
