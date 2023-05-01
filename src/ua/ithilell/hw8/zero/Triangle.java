package ua.ithilell.hw8.zero;

public class Triangle implements Figure {

    private int left;
    private int right;
    private int bottom;

    public Triangle(int left, int right, int bottom) {
        this.left = left;
        this.right = right;
        this.bottom = bottom;
    }

    @Override
    public int area() {
        double pp = (left + right + bottom) / 2.0;  // полупериметр
        return (int) Math.sqrt(pp * (pp - left) * (pp - right) * (pp - bottom)); // прямо по формуле Герона из вики
    }

}
