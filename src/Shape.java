public interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Shape:: Rectangle draw()");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Shape:: Circle draw()");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Shape:: Square draw()");
    }
}