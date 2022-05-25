package com.company;

class Firefighters1 {
    private int age;
    private double weight;
    private double height;

    Firefighters1(int age, double weight, double height) {
        super();
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    public Firefighters1() {

    }

    void index1() {
        double index;
        index = weight / (height*height);
        System.out.println("Індекс маси тіла: " + index);
    }

    double ideal1() {
        double ideal;
        ideal = (height + 90) * 0.8;
        return ideal;
    }
    void time(double speed, double TheFireGetsStronger) {
        double t = speed / TheFireGetsStronger;
        if (t > 7) {
            System.out.println("Ліпше тушіть вогонь");
        } else {
            System.out.println("Молодці");
        }
    }

    void index1(double height, double weight) {
        double index;
        index = weight / (height * height);
        System.out.println("Індекс маси тіла2: " + index);
    }
    static void test(int z, int x, int... c) {
        double index1 = z;
        double ideal1 = x;
        if (index1 > ideal1) {
            System.out.println("Шось не то");
        } else {
            System.out.println("Все добре");
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    void back(Firefighters firefighters, Team team1) {
        System.out.println("Територія яка охоплена вогнем" + firefighters.getLength() + ", " + firefighters.getWidth() + ". Пожежники які тушили пожежу " + team1.getFirefightersInReserve());
    }
    void agge() {
        index1();
        int m;
        m = getAge();
        System.out.println("Вік пожежника: " + m);
    }
}