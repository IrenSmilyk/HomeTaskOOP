package com.company;

abstract class Human {
    private boolean genderSign;
    private String name;
    private String surname;
    private float growth;
    private float weight;

    Human(boolean genderSign, String name, String surname, float growth, float weight) {
        this.genderSign = genderSign;
        this.name = name;
        this.surname = surname;
        this.growth = growth;
        this.weight = weight;
    }

    boolean isGenderSign() {
        return genderSign;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    float getGrowth() {
        return growth;
    }

    float getWeight() {
        return weight;
    }

    abstract boolean speak(Human human);
   /* abstract boolean tolerate(Human human);
    abstract boolean spendTimeTogether(Human human);
    abstract Human beInArelationship(Human human);*/


}
