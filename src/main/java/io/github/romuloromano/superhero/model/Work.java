package io.github.romuloromano.superhero.model;

public class Work {

    private int id;
    private String name;
    private String occupation;
    private String baseOfOperation;

    public Work() {
    }

    public Work(int id, String name, String occupation, String baseOfOperation) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.baseOfOperation = baseOfOperation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getBaseOfOperation() {
        return baseOfOperation;
    }

    @Override
    public String toString() {
        return "**Super Hero - Work**\n" +
                "Occupation= " + occupation + '\n' +
                "Base Of Operation= " + baseOfOperation + '\n';
    }
}
