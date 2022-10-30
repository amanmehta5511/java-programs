package org.main;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1,4);
        Fraction fraction2 = new Fraction(1,2);
        fraction1.add(fraction2);
        System.out.println("Add : " + fraction1.toString());
        fraction1.sub(fraction2);
        System.out.println("Sub : " + fraction1.toString());
        fraction1.multiplication(fraction2);
        System.out.println("Multiplication : " + fraction1.toString());
        fraction1.division(fraction2);
        System.out.println("Division : " + fraction1.toString());
    }
}