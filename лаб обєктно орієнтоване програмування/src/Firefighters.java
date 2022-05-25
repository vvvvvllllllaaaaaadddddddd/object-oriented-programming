package com.company;

public class Firefighters extends Fireman {

    Firefighters(int age, double weight, double height) {
        super(age, weight, height);
    }

    public Firefighters() {

    }

    void methodFoot(){
        index1();
        double v;
        v = getWeight() + getHeight();
        System.out.println("Вага і ріст пожежника разом становить: " + v);
    }
    void test() {
        Striker vova = new Striker();
        vova.methodStriker();
    }
    class Striker {
        void methodStriker() {
            System.out.println("Зріст лейтенанта є: " + getHeight());
            methodFoot();
        }
    }
    void wei() {
        agge();
        double w = getWeight();
        System.out.println("Вага лейтенанта є: " + w);
    }
}

