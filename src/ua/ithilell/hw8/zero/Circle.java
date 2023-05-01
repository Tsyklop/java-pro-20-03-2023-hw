package ua.ithilell.hw8.zero;

public class Circle implements Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * (this.radius * this.radius));
    }

}
