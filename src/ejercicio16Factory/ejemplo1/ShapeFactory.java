package ejercicio16Factory.ejemplo1;

import ejercicio16Factory.ejemplo1.interfaces.IShape;
import ejercicio16Factory.ejemplo1.models.Circle;
import ejercicio16Factory.ejemplo1.models.Rectangle;
import ejercicio16Factory.ejemplo1.models.Squere;

public class ShapeFactory {

    /**
     * Use getShapeMethod  to get object of type shape
     */
    public IShape getShape(String typeShape) {
        if (typeShape == null)
            return null;
        if (typeShape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (typeShape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (typeShape.equalsIgnoreCase("SQUERE")) {
            return new Squere();
        }
        return null;
    }

}
