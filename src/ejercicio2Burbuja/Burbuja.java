package ejercicio2Burbuja;

import java.util.List;

public class Burbuja {
    public static List<Integer> ordenarBurbuja1(List<Integer> array) {
        int i = 1;
        int n=array.size();
        boolean ordenado = false;

        while ( i<n && ordenado == false){
            i++;
            ordenado=true;
            for (int j=0; j<=n-i;j++){
                if (array.get(j) > array.get(j+1)){
                    ordenado=false;
                    int aux=array.get(j);
                    array.set(j,array.get(j+1));
                    array.set(j+1,aux);
                }
            }
        }

        return array;
    }

    public static List<Integer> ordenarBurbuja2(List<Integer> array){
        int i=1;
        int n=array.size();
        boolean ordenado;
        do {
            i++;
            ordenado=true;
            for (int j =0;j<=n-i;j++){
                ordenado=false;
                int aux=array.get(j);
                array.set(j,array.get(j+1));
                array.set(j+1,aux);
            }
        }while ( (i<n) || (ordenado) );

        return array;
    }
}
