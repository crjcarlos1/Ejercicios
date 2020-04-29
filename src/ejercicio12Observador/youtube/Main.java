package ejercicio12Observador.youtube;

public class Main {

    public static void main(String...args){
        Channel cralos=new Channel();

        Subscriber subscriber1=new Subscriber("Diana");
        Subscriber subscriber2=new Subscriber("Nancy");
        Subscriber subscriber3=new Subscriber("Ximena");
        Subscriber subscriber4=new Subscriber("María");
        Subscriber subscriber5=new Subscriber("Karen");

        cralos.subscribe(subscriber1);
        cralos.subscribe(subscriber2);
        cralos.subscribe(subscriber3);
        cralos.subscribe(subscriber4);
        cralos.subscribe(subscriber5);

        subscriber1.subscriberChannel(cralos);
        subscriber2.subscriberChannel(cralos);
        subscriber3.subscriberChannel(cralos);
        subscriber4.subscriberChannel(cralos);
        subscriber5.subscriberChannel(cralos);

        cralos.uploadVideo("Android");
        

    }

}
