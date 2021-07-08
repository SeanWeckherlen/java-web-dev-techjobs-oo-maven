package com.company;

import java.util.Objects;

public  abstract class JobField {
    private static int nextId = 1;

    private final int id;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this(); // invokes the constructor with no arguments for this class
        this.value = value;
    }

    // ToString / hashCode / equals methods

    @Override
    public String toString() {
        String emptyString = "";
        if (value == emptyString || value == null) {
            value = "Data not available";
        }
        return this.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    // getters & setters

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return this.id;
    }
}
