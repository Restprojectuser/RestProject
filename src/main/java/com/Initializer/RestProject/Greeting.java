package com.Initializer.RestProject;

public class Greeting {
    private final long id;
    private final String Name;

    public Greeting(long id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
