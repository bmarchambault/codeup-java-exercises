package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
//    More Shapes - abstract and interface exercises
//
//Remove the code from the body of your Rectangle and Square classes./
// /    so commenting these out.
//    =======================================
//    protected double length;
//    protected double width;
//
//    public Rectangle (double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getLength() { return length; }
//
//    public void setLength(double length) { this.length = length; }
//
//    public double getWidth() { return width; }
//
//    public void setWidth(double width) { this.width = width; }
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return ((length * 2) + (width * 2));
//    }
////=========================
//}
