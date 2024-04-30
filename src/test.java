package org.example;

public class test
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int product(int a, int b)
    {
        return a * b;
    }
    public static int division(int a, int b)
    {
        return a / b;
    }
    public static int num(int n) {
        if (n > 0) {
            System.out.println("Positive");
            return n;
        } else {
            System.out.println("Negative");
            return n;
        }
    }
}
