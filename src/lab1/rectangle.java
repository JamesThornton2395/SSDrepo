public class rectangle extends shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height =height;
    }

    protected rectangle(int width, int height, int sides) {
        super(sides);
        this.width = width;
        this.height =height;
    }

    @Override
    public int shape() {
        return getSides();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
