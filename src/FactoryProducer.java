public class FactoryProducer {
    public static AbstractFactoryCreator getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        else if(factoryType.equalsIgnoreCase("colour"))
            return new ColourFactory();
        return null;
    }
}
