package com.company;

import java.util.Objects;

public class Location extends JobField{
//    private static int nextId = 1;
//
//    private final int id;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The constructors should also call the empty constructor in order to initialize the 'id' field.
    public Location(String value){
        super(value);

    }

    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        String emptyString = "";
//        if(value == null || value == emptyString){
//            value = "Data not available";
//        }
//        return this.value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Location location = (Location) o;
//        return id == location.id;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    // Getters and Setters:
//
//    public int getId() { return this.id; }
//
//    public String getValue() { return this.value; }
//
//    public void setValue(String value) { this.value = value; }
}
