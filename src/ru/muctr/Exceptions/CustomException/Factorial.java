package ru.muctr.Exceptions.CustomException;

public class Factorial {
    static int x;
    static int f = 1;

    public static int getFactorial(int x) throws NumberInvalidForFactorialException {
        if (x < 1) throw new NumberInvalidForFactorialException(x);
//        if (x < 1) throw new NumberInvalidForFactorialException("Невозможно рассчитать факториал числа " + x);
        if (x > 1) f = x * getFactorial(x - 1);
        return f;
    }
}
