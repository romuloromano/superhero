package io.github.romuloromano.superhero.model;

import java.util.Arrays;
import java.util.List;

public class Biography {

    private int id;
    private String name;
    private String fullName;
    private String alterEgos;
    private List<String> aliases;
    private String placeOfBirth;
    private String firstAppearance;
    private String publisher;
    private String alignment;

    public Biography() {
    }

    public Biography(int id, String name, String fullName, String alterEgos, String placeOfBirth, String firstAppearance, String publisher, String alignment) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.alterEgos = alterEgos;
        this.placeOfBirth = placeOfBirth;
        this.firstAppearance = firstAppearance;
        this.publisher = publisher;
        this.alignment = alignment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAlterEgos() {
        return alterEgos;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAlignment() {
        return alignment;
    }

    @Override
    public String toString() {
        return "**Super Hero - Biography**\n" +
                "Name= " + name + '\n' +
                "Full Name= " + fullName + '\n' +
                "Alter Egos= " + alterEgos + '\n' +
                "Aliases= " + Arrays.toString(aliases.toArray()) + '\n' +
                "Place Of Birth= " + placeOfBirth + '\n' +
                "First Appearance= " + firstAppearance + '\n' +
                "Publisher= " + publisher + '\n' +
                "Alignment= " + alignment + '\n';
    }
}
