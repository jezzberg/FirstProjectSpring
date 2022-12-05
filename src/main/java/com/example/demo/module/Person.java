package com.example.demo.module;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;

    public Person(UUID id, String ame) {
        this.id = id;
        this.name = ame;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
