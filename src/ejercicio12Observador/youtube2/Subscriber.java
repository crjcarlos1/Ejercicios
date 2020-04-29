package ejercicio12Observador.youtube2;

public class Subscriber implements SubscriberObserver{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateSubscriber() {
        System.out.println("Hola "+name+" se actualizó un nuevo video");
    }

}
