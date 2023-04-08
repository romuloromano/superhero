package io.github.romuloromano.superhero.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Appearance {

    private int id;
    private String name;
    private String gender;
    private String race;
    private List<String> height;
    private List<String> weight;
    @SerializedName("eye-color")
    private String eyeColor;
    @SerializedName("hair-color")
    private String hairColor;

    public Appearance() {
    }

    public Appearance(int id, String name, String gender, String race, String eyeColor, String hairColor) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.race = race;
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

    public List<String> getHeight() {
        return height;
    }

    public List<String> getWeight() {
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
        return "**Super Hero - Appearance**\n" +
                "Name= " + name + '\n' +
                "Gender= " + gender + '\n' +
                "Race= " + race + '\n' +
                "Height= " + height + '\n' +
                "Weight= " + weight + '\n' +
                "Eye Color= " + eyeColor + '\n' +
                "Hair Color= " + hairColor + '\n';
    }
}
