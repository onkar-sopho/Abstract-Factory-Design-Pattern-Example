public class Client {
    public static void main(String[] args) {

        // Creating Shape factory using the AbstractFactory
        AbstractFactoryCreator shapeFactory = FactoryProducer.getFactory("shape");

        // Creating different products (shapes) using the Shape factory
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");

        // Calling the draw methods of shapes
        rectangle.draw();
        circle.draw();
        square.draw();

        /************************************************************************/

        // Creating Colour factory using the AbstractFactory
        AbstractFactoryCreator colourFactory = FactoryProducer.getFactory("colour");

        // Creating different products (colours) using the Colour factory
        Colour red = colourFactory.getColour("red");
        Colour green = colourFactory.getColour("green");
        Colour blue = colourFactory.getColour("blue");

        // Calling the fill methods of colours
        red.fill();
        green.fill();
        blue.fill();
    }
}
