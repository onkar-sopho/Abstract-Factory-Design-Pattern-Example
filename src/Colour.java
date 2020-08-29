public interface Colour {
    void fill();
}

class Red implements Colour {
    @Override
    public void fill() {
        System.out.println("Filling with RED colour....");
    }
}

class Green implements Colour {
    @Override
    public void fill() {
        System.out.println("Filling with GREEN colour....");
    }
}

class Blue implements Colour {
    @Override
    public void fill() {
        System.out.println("Filling with BLUE colour....");
    }
}
