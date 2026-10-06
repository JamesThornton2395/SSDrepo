public class ellipse extends rectangle{
    private int radius1;
    private int radius2;

    public ellipse(int radius1, int radius2) {
        super(radius1, radius2, 0);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public int shape() {
        return getSides();
    }

    @Override
    public double getArea() {
        return Math.PI * radius1 * radius2;
    }
}
