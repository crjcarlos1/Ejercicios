package ejercicio10Singleton;

public class MySingleton {

    private static MySingleton instance=null;
    private String message=null;

    private MySingleton() {
    }

    public synchronized static MySingleton getInstance(){
        if (instance==null) instance=new MySingleton();
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
