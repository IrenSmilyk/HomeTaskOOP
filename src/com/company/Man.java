package com.company;

class Man extends Human {
    Man(boolean genderSign, String name, String surname, float growth, float weight) {
        super(genderSign, name, surname, growth, weight);
    }

    @Override
    public String toString() {
        return "Мужчина(" +
                "пол=" + isGenderSign() +
                ", имя='" + getName() + '\'' +
                ", фамилия='" + getSurname() + '\'' +
                ", рост=" + getGrowth() +
                ", вес=" + getWeight() +
                ')';
    }
}
