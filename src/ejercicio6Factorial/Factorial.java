package ejercicio6Factorial;

public class Factorial {

    public static int facRecursivo(int n){
        if (n == 1)
            return 1;
        else
            return facRecursivo(n-1)*n;
    }

    public static int facIterativo(int n){
        int result=1;
        for (int i=1;i<=n;i++)
            result*=i;
        return result;
    }

}
