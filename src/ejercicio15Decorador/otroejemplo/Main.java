package ejercicio15Decorador.otroejemplo;

import ejercicio15Decorador.otroejemplo.features.LechugaFeature;
import ejercicio15Decorador.otroejemplo.features.QuesoFeature;
import ejercicio15Decorador.otroejemplo.features.TomateFeature;
import ejercicio15Decorador.otroejemplo.models.Hamburguesa;

import java.util.Scanner;

public class Main {

    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("        ==============================      ");
        System.out.println("                HAMBURGUESAS                ");
        System.out.println("        ==============================      ");

        System.out.println("SELECT: ");
        System.out.println("1->lechuga     2->tomate     3->queso      0->terminar");

        Hamburguesa hamburguesa=new Hamburguesa();
        int opc=0;

        do {
            opc=scanner.nextInt();
            switch (opc){
                case 0:
                    break;
                case 1:
                    hamburguesa=new LechugaFeature(hamburguesa);
                    break;
                case 2:
                    hamburguesa= new TomateFeature(hamburguesa);
                    break;
                case 3:
                    hamburguesa=new QuesoFeature(hamburguesa);
                    break;
                    default:
                        System.out.println("Invalid");
                        break;
            }
        }while (opc!=0);
        System.out.println("ENTREGANDO :");
        System.out.println(hamburguesa.getDescripcion());

    }

}
