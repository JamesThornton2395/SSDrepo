public class circle extends shape {
    private int radius;

    public circle(int radius) {
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
        return 0;
    }

    @Override
    public int getArea() {
        int area = (int) (Math.PI * radius * radius);
        return area;
    }
}
