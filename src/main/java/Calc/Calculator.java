package Calc;

public class Calculator {

    public double add(double a, double b) {
        return a+b;
    }

    public double subtract(double a, double b) {
        return a-b;
    }

    public double multiply (double a, double b) {
        return a*b;
    }

    public double divide (double a, double b) {
        if (b == 0) {
            return (int) a / (int) b;
        } else {
            return a / b;
        }
    }

   public long MathPow (double a, double b) {
        return (long)Math.pow(a,b);
    }
}

