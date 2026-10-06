public abstract class shape {
    private int sides;

    protected shape(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public abstract int shape();

    public abstract double getArea();
}
