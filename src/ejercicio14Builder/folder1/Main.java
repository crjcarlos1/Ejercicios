package ejercicio14Builder.folder1;

import ejercicio14Builder.folder1.builders.BuilderCoche;
import ejercicio14Builder.folder1.builders.ConstructorCocheBase;
import ejercicio14Builder.folder1.builders.ConstructorCocheFull;
import ejercicio14Builder.folder1.builders.ConstructorCocheMedio;
import ejercicio14Builder.folder1.models.Coche;
import ejercicio14Builder.folder1.models.Director;

public class Main {

    public static void main(String... args) {

        /**     Crear el objeto director        */
        Director director = new Director();

        /**     Crear los objetos concreteBuilder       */
        BuilderCoche base = new ConstructorCocheBase();
        BuilderCoche medio = new ConstructorCocheMedio();
        BuilderCoche full = new ConstructorCocheFull();

        /**     Construir un coche con equipamiento base        */
        director.construir(base);
        Coche cocheBase = base.getCoche();

        /**     Construir un coche con equipamiento medio       */
        director.construir(medio);
        Coche cocheMedio = medio.getCoche();

        /**     Construir un coche con equipamiento full        */
        director.construir(full);
        Coche cocheFull = full.getCoche();

        /**     Mostrar la información de cada coche creado     */
        mostraCaracteristicas(cocheBase);
        mostraCaracteristicas(cocheMedio);
        mostraCaracteristicas(cocheFull);
    }

    private static void mostraCaracteristicas(Coche coche) {
        System.out.println("Motor: "+coche.getMotor());
        System.out.println("Carrocería: "+coche.getCarroceria());
        System.out.println("Elevalunas electríco: "+coche.isElevalunasElec());
        System.out.println("Aire acondicionado: "+coche.isAireAcond());
        System.out.println("========================================================");
    }

}
