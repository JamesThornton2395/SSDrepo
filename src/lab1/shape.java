public abstract class shape {
    public abstract int shape();

    public abstract int getArea();

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

