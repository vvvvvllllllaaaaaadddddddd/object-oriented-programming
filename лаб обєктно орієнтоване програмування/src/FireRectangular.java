package com.company;

class Firerectangular extends Fireman{
    private double length;
    private double width;

    Firerectangular(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Пожежний прямокутник; " + perimeter);
    }

    double square() {
        double square = length * width;
        return square;
    }

    int square(int length, int width) {
        int square = length * width;
        return square;
    }

    Firerectangular(double v) {
        length = width = v;
    }

    Firerectangular(Firerectangular fires) {
        length = fires.length;
        width = fires.width;
    }

    Firerectangular(int length, int width) {
        this.length = length;
        this.width = width;
    }

    static void test(int v, int c, int... z) {
        int length = v;
        int width = c;
        if (length * width > 250) {
            System.out.println("Площа першої пожежі");
        } else {
            System.out.println("Площа другої пожежі");
        }
    }
}


