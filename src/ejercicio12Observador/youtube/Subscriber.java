package ejercicio12Observador.youtube;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hola "+name+" video uploaded");
    }

    public void subscriberChannel(Channel channel) {
        this.channel = channel;
    }

}
