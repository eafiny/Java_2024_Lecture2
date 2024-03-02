package ru.muctr.Exceptions.CustomException;

public class UserExceptionDemo {
    public static void main(String[] args) throws NumberInvalidForFactorialException{
        int value = -4;
        try {
            System.out.println("Факториал " + value + " равен " + Factorial.getFactorial(value));
        } catch (NumberInvalidForFactorialException e){
            System.out.println(e);
        }

        Factorial.getFactorial(5);
    }
}
