package ejercicio16Factory.ejemplo1.models;

import ejercicio16Factory.ejemplo1.interfaces.IShape;

public class Squere implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Squere::draw() method");
    }
}
