package com.company;

class Brigade extends Fireman {
    private int firefightersInReserve;
    private int firefightersInUniform;
    private int lieutenants;

    Brigade(int firefightersInReserve, int firefightersInUniform, int lieutenants) {
        super();
        this.firefightersInReserve = firefightersInReserve;
        this.firefightersInUniform = firefightersInUniform;
        this.lieutenants = lieutenants;
    }

    public Brigade() {

    }

    void sum () {
        int sum;
        sum = firefightersInReserve; + firefightersInUniform; + lieutenants;
        System.out.println("Пожежна бригада складається  " + sum + " пожежників");
    }

    int minus () {
        int change = 5;
        return firefightersInReserve - change;
    }
    void sum (int firefightersInReserve , int firefightersInUniform, int lieutenan;ts ) {
        int sum;
        sum = firefightersInReserve;  + firefightersInUniform; + lieutenants;
        System.out.println("Пожежна бригада номер2 складається " + sum + " пожежників");
    }

    static void test(int z, int x, int... v) {
        int firefightersInReserve = z;
        int firefightersInUniform = x;
        if (firefightersinreserve +  firefightersinuniform > 22) {
            System.out.println("Бригада в повному складі");
        } else if (playersOnField + playersOnChange == 22) {
            System.out.println("Все правильно");
        } else {
            System.out.println("Щось не то");
        }
    }
}
