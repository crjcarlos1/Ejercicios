package ejercicio3Primos;

public class Primos {

    /*      Solo si es divisible entre 1 y el mismo
             3 -> si
             4 -> no
             5 -> si
             6 -> no
             7 -> si
             13 -> si
     */

    public static boolean esPrimo(int n){
        boolean esPrimoN=true;
        for (int i=2; i<n;i++){
            if ( (n%i) == 0 ){
                esPrimoN=false;
                break;
            }
        }
        return esPrimoN;
    }


}
