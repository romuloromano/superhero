package io.github.romuloromano.superhero.model;

public class Appearance {

    private int id;
    private String name;
    private String gender;
    private String race;
    private String height;
    private String weight;
    private String eyeColor;
    private String hairColor;

    public Appearance() {
    }

    public Appearance(int id, String name, String gender, String race, String height, String weight, String eyeColor, String hairColor) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Super HeroAppearance" + '\n' +
                "Name=" + name + '\n' +
                "Gender='" + gender + '\n' +
                "Race='" + race + '\n' +
                "Height='" + height + '\n' +
                "Weight='" + weight + '\n' +
                "Eye Color='" + eyeColor + '\n' +
                "Hair Color='" + hairColor + '\n';
    }
}
