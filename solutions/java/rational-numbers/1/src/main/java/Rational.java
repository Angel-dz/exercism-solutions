import java.util.Objects;
import java.lang.Math;

class Rational {

    private final int numerator;
    private final int denominator;

    Rational(int numerator, int denominator) {
        int gcd = getGCD(Math.abs(numerator), Math.abs(denominator));
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        if (gcd > 0 ) {
            this.numerator = numerator/gcd;
            this.denominator = denominator/gcd;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    int getGCD(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    int getNumerator() {
        return this.numerator;
    }

    int getDenominator() {
        return this.denominator;
    }

    Rational add(Rational other) {
        int numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int denominator = numerator == 0 ? 1 : other.denominator * this.denominator;
        Rational result = new Rational(numerator, denominator);
        return result;
    }

    Rational subtract(Rational other) {
        int numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int denominator = numerator == 0 ? 1 : other.denominator * this.denominator;
        Rational result = new Rational(numerator, denominator);
        return result;
    }

    Rational multiply(Rational other) {
        int numerator = this.numerator * other.numerator;
        int denominator = numerator == 0 ? 1 : other.denominator * this.denominator;
        Rational result = new Rational(numerator, denominator);
        return result;
    }

    Rational divide(Rational other) {
        int numerator = this.numerator * other.denominator;
        int denominator = numerator == 0 ? 1 : other.numerator * this.denominator;
        Rational result = new Rational(numerator, denominator);
        return result;
    }

    Rational abs() {
        int numerator = Math.abs(this.numerator); 
        int denominator = Math.abs(this.denominator);
        Rational result = new Rational(numerator, denominator);
        return result;
    }

    Rational pow(int power) {
        if (power == 0) {
            return new Rational(1, 1);
        }

        Rational base = this;

        if (power < 0) {
        base = new Rational(this.denominator, this.numerator);
        power = -power;
    }
        int num = intPow(Math.abs(base.numerator), power);
        int den = intPow(base.denominator, power);

        if (base.numerator < 0 && power % 2 != 0) {
            num = -num;
        }

        return new Rational(num, den);
    }

    private static int intPow(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    double exp(double exponent) {
        return Math.pow(exponent, (double) this.numerator / this.denominator);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.getNumerator(), this.getDenominator());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rational other) {
            return this.getNumerator() == other.getNumerator()
                    && this.getDenominator() == other.getDenominator();
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNumerator(), this.getDenominator());
    }
}
