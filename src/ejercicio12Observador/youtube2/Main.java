package ejercicio12Observador.youtube2;

public class Main {

    public static void main(String...args){
        /** Creamos canal   */
        Channel cRalos=new Channel("cRalos");

        /**     Creamos subscribers     */
        Subscriber subscriber1=new Subscriber("Diana");
        Subscriber subscriber2=new Subscriber("Nancy");
        Subscriber subscriber3=new Subscriber("Ximena");
        Subscriber subscriber4=new Subscriber("Linda");
        Subscriber subscriber5=new Subscriber("Karen");

        /**     Enlazamos       */
        cRalos.addSubscriber(subscriber1);
        cRalos.addSubscriber(subscriber2);
        cRalos.addSubscriber(subscriber3);
        cRalos.addSubscriber(subscriber4);
        cRalos.addSubscriber(subscriber5);

        /**     Creamos nuevo video     */
        cRalos.updateVideo("Android 10");

    }
}
