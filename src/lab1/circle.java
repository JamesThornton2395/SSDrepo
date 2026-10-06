public class circle extends shape {
    private int radius;

    public circle(int radius) {
        super(0);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int shape() {
        return getSides();
    }

    @Override
    public double getArea() {
        int area = (int) (Math.PI * radius * radius);
        return area;
    }
}
