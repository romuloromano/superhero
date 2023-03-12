package io.github.romuloromano.superhero.model;

public class Biography {

    private int id;
    private String name;
    private String fullName;
    private String alterEgos;
    private String aliases;
    private String placeOfBirth;
    private String firstAppearance;
    private String publisher;
    private String alignment;

    public Biography() {
    }

    public Biography(int id, String name, String fullName, String alterEgos, String aliases, String placeOfBirth, String firstAppearance, String publisher, String alignment) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.alterEgos = alterEgos;
        this.aliases = aliases;
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

    public String getAliases() {
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
        return "Super Hero - Biography\n" +
                "Name='" + name + '\n' +
                "Full Name=" + fullName + '\n' +
                "Alter Egos=" + alterEgos + '\n' +
                "Aliases=" + aliases + '\n' +
                "Place Of Birth=" + placeOfBirth + '\n' +
                "First Appearance=" + firstAppearance + '\n' +
                "Publisher=" + publisher + '\n' +
                "Alignment=" + alignment + '\n';
    }
}
