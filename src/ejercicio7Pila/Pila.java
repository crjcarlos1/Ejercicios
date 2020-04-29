package ejercicio7Pila;

public class Pila {

    private String []array;
    private int maxSize;
    private int top;

    public Pila(int size) {
        this.maxSize=size;
        this.top=0;
        this.array=new String[maxSize];
    }

    public boolean empty() {
        if (top == 0) return true;
        else return false;
    }

    public String peek(){
        if (top == 0){
            return null;
        }
        else
            return array[top-1];
    }

    public void push(String string){
        if (top<maxSize){
            array[top]=string;
            top++;
        }
    }

    public String pop(){
        if (top == 0){
            return null;
        }
        else {
            String value=array[top-1];
            array[top-1]=null;
            top--;
            return value;
        }
    }

}
