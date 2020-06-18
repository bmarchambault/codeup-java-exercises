package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable box1 = new Rectangle(4, 5);
        System.out.println(box1.getArea() + "rectangle");
        System.out.println(box1.getPerimeter() + "rectangle");
//        System.out.println(box1.getLength());//inheritance only flows one way.
//        System.out.println(Quadrilateral.getLength);//doesn't work because getLength is not static so it belongs to the class and not an instance of Quadrilateral

        Measurable box2 = new Square(5);
        System.out.println(box2.getArea() + "square");
        System.out.println(box2.getPerimeter() + "square");
    }
}
