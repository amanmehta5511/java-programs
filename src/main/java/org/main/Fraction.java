package org.main;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public void add(Fraction fraction){
        int numerator = (fraction.getNumerator() * this.getDenominator()) + (fraction.getDenominator()*this.getNumerator());
        int denominator = fraction.getDenominator() * this.getDenominator();
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public void sub(Fraction fraction){
        int numerator = (fraction.getNumerator() * this.getDenominator()) - (fraction.getDenominator()*this.getNumerator());
        int denominator = fraction.getDenominator() * this.getDenominator();
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public void multiplication(Fraction fraction){
        this.setNumerator(fraction.getNumerator() * this.getNumerator());
        this.setDenominator(fraction.getDenominator() * this.getDenominator());
    }

    public void division(Fraction fraction){
        int numerator = this.getNumerator() * fraction.getDenominator();
        int denominator = this.denominator * fraction.getNumerator();
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }
}
