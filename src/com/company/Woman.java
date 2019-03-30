package com.company;

public class Woman extends Human {
    Woman(boolean genderSign, String name, String surname, float growth, float weight) {
        super(genderSign, name, surname, growth, weight);
    }

    @Override
    public String toString() {
        return "Женщина(" +
                "пол=" + isGenderSign() +
                ", имя='" + getName() + '\'' +
                ", фамилия='" + getSurname() + '\'' +
                ", рост=" + getGrowth() +
                ", вес=" + getWeight() +
                ')';
    }

    @Override
    boolean speak(Human human) {
        if (this.isGenderSign()==human.isGenderSign())
            return true;
        else return false;
    }
}
