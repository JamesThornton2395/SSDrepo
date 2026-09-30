public class shape {
    public abstract class Shape {
        private int sides;

        public Shape(int sides) {
            this.sides = sides;
        }

        public int getSides() {
            return sides;
        }

        public abstract int getArea();
    }
}

