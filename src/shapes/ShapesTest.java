package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5,3);
        double perimeter = myShape.getPerimeter();
        System.out.println(perimeter);

        Measurable myShape2 = new Square(5,3);
        double area = myShape2.getArea();
        System.out.println(area);

