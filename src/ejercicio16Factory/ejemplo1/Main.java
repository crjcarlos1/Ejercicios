package ejercicio16Factory.ejemplo1;

import ejercicio16Factory.ejemplo1.interfaces.IShape;

public class Main {

    public static void main(String... args) {
        ShapeFactory factory = new ShapeFactory();

        /**GET AN OBJECT OF CIRCLE AND CALL METHOD*/
        IShape circle = factory.getShape("CIRCLE");
        circle.draw();

        System.out.println();

        /**GET AN OBJECT OF RECTANGLE AND CALL METHOD*/
        IShape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        System.out.println();

        /**GET AN OBJECT OF CIRCLE AND CALL METHOD*/
        IShape squere = factory.getShape("SQUERE");
        squere.draw();
    }

}
