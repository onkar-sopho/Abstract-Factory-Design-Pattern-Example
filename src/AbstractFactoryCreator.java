public abstract class AbstractFactoryCreator {
    protected abstract Shape getShape(String shape);
    protected abstract Colour getColour(String colour);
}

class ShapeFactory extends AbstractFactoryCreator {

    @Override
    protected Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(shape.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shape.equalsIgnoreCase("square"))
            return new Square();
        return null;
    }

    @Override
    protected Colour getColour(String colour) {
        return null;
    }
}

class ColourFactory extends AbstractFactoryCreator {

    @Override
    protected Shape getShape(String shape) {
        return null;
    }

    @Override
    protected Colour getColour(String colour) {
        if(colour.equalsIgnoreCase("red"))
            return new Red();
        else if(colour.equalsIgnoreCase("green"))
            return new Green();
        else if(colour.equalsIgnoreCase("blue"))
            return new Blue();
        return null;
    }
}
