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
        this.width = width;
        this.height =height;
    }

    @Override
    public int shape() {
        return 4;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
