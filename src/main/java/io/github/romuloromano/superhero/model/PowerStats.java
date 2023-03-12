package io.github.romuloromano.superhero.model;

public class PowerStats {

    private int id;
    private String name;
    private String intelligence;
    private String strength;
    private String speed;
    private String durability;
    private String power;
    private String combat;

    public PowerStats() {

    }

    public PowerStats(int id, String name, String intelligence, String strength, String speed, String durability, String power, String combat) {
        this.id = id;
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
        this.combat = combat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public String getStrength() {
        return strength;
    }

    public String getSpeed() {
        return speed;
    }

    public String getDurability() {
        return durability;
    }

    public String getPower() {
        return power;
    }

    public String getCombat() {
        return combat;
    }

    @Override
    public String toString() {
        return "**Super Hero - Power Stats**\n" +
                "Name= " + name + '\n' +
                "Intelligence= " + intelligence + '\n' +
                "Strength= " + strength + '\n' +
                "Speed= " + speed + '\n' +
                "Durability= " + durability + '\n' +
                "Power= " + power + '\n' +
                "Combat= " + combat + '\n';
    }
}
