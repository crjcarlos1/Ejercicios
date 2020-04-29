package ejercicio1Fibonacci;

public class Fibonacci {
    public static int calculaFibonacci(int n)
    {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        else
            return calculaFibonacci(n-1)+ calculaFibonacci(n-2);

    }
}
