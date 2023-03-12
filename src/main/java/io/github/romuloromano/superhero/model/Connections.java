package io.github.romuloromano.superhero.model;

public class Connections {

    private int id;
    private String name;
    private String groupAffiliation;
    private String Relatives;

    public Connections() {
    }

    public Connections(int id, String name, String groupAffiliation, String relatives) {
        this.id = id;
        this.name = name;
        this.groupAffiliation = groupAffiliation;
        Relatives = relatives;
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
        return Relatives;
    }

    @Override
    public String toString() {
        return "Connections\n" +
                "Name=" + name + '\n' +
                "Group Affiliation=" + groupAffiliation + '\n' +
                "Relatives='" + Relatives + '\n';
    }
}
