package ejercicio16Factory.ejemplo1.models;

import ejercicio16Factory.ejemplo1.interfaces.IShape;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside circle ::draw() method");
    }
}
