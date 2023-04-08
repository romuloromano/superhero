package io.github.romuloromano.superhero.model;

import com.google.gson.annotations.SerializedName;

public class Connections {

    private int id;
    private String name;
    @SerializedName("group-affiliation")
    private String groupAffiliation;
    private String relatives;

    public Connections() {
    }

    public Connections(int id, String name, String groupAffiliation, String relatives) {
        this.id = id;
        this.name = name;
        this.groupAffiliation = groupAffiliation;
        this.relatives = relatives;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public String getRelatives() {
        return relatives;
    }

    @Override
    public String toString() {
        return "**Super Hero - Connections**\n" +
                "Name= " + name + '\n' +
                "Group Affiliation= " + groupAffiliation + '\n' +
                "Relatives= " + relatives + '\n';
    }
}
