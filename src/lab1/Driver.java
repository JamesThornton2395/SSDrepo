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
        circle circle1 = new circle(6);
        circle circle2 = new circle(8);
        circle circle3 = new circle(9);
        circle circle4 = new circle(10);
        circle circle5 = new circle(11);
        circle circle6 = new circle(12);

        System.out.println(circle0.getArea());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());
        System.out.println(circle4.getArea());
        System.out.println(circle5.getArea());
        System.out.println(circle6.getArea());

        ellipse ellipse0 = new ellipse(4, 5);
        ellipse ellipse1 = new ellipse(6, 7);
        ellipse ellipse2 = new ellipse(8, 9);
        ellipse ellipse3 = new ellipse(10, 11);
        ellipse ellipse4 = new ellipse(12, 13);
        ellipse ellipse5 = new ellipse(14, 15);
        ellipse ellipse6 = new ellipse(16, 17);

        System.out.println(ellipse0.getArea());
        System.out.println(ellipse1.getArea());
        System.out.println(ellipse2.getArea());
        System.out.println(ellipse3.getArea());
        System.out.println(ellipse4.getArea());
        System.out.println(ellipse5.getArea());
        System.out.println(ellipse6.getArea());
    }
}