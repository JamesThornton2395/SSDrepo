public class rectangle extends shape {
    abstract class Rectangle{
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

        Rectangle (int width, int height) {
            this.width = width;
            this.height =height;
        }
    }
}
