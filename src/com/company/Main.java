package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human human1 = inputHuman();
        Human human2 = inputHuman();
        System.out.println(human1);
        System.out.println(human2);

    }

    private static Human inputHuman() {
        Human human;
        boolean genderSign;
        String name;
        String surname;
        float growth;
        float weight;
        System.out.println("Введите данные о человеке:");
        System.out.print("Введите пол человека (true - мужчина, false - женщина):");
        Scanner sc = new Scanner(System.in);
        genderSign = sc.nextBoolean();
        System.out.print("Введите "+(genderSign ? "мужское" : "женское")+" имя: ");
        sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Введите фамилию человека:");
        //sc = new Scanner(System.in);
        surname = sc.nextLine();
        System.out.print("Введите рост человека:");
        //sc = new Scanner(System.in);
        growth = sc.nextFloat();
        System.out.print("Введите вес человека:");
       // sc = new Scanner(System.in);
        weight = sc.nextFloat();
        if (!genderSign) {
            human = new Woman(false, name, surname, growth, weight);

        } else {
            human = new Man(true, name, surname, growth, weight);

        }
        return human;
    }
}
