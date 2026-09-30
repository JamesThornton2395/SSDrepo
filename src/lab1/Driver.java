public class Driver {
    public static void main(String[] args) {
        rectangle rectangle0 = new rectangle(5, 15);
        rectangle rectangle1 = new rectangle(8, 10);
        rectangle rectangle2 = new rectangle(3, 17);
        rectangle rectangle3 = new rectangle(5, 19);
        rectangle rectangle4 = new rectangle(9, 15);
        rectangle rectangle5 = new rectangle(2, 10);
        rectangle rectangle6 = new rectangle(1, 10);

        System.out.println(rectangle0.getArea());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle3.getArea());
        System.out.println(rectangle4.getArea());
        System.out.println(rectangle5.getArea());
        System.out.println(rectangle6.getArea());

        circle circle0 = new circle(4);

        System.out.println(circle0.getArea());
    }
}