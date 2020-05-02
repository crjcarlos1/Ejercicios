package ejercicio16Factory.ejemplo1.models;

import ejercicio16Factory.ejemplo1.interfaces.IShape;

public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside rectangle::draw(): method");
    }

}
