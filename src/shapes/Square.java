package shapes;

//class Square extends Rectangle {
class Square extends Quadrilateral implements Measurable{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        this.length = width;
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
        return width * 4;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}




   //    More Shapes - abstract and interface exercises
    //
//Remove the code from the body of your Rectangle and Square classes.
//so commenting this out:
//    ========================================
////private double side;//** SEE NOTE BELOW
//    public Square (double side){
//        super (side, side);
////        this.side = side;//** SEE NOTE BELOW
//    }
//
////to use side here you need to define side in the constructor (SEE **)
//        public double getArea(){
//            return width * width;
//        }
//
//        public double getPerimeter() {
//            return width * 4;
//        }


////THIS IS NOT OVERRIDING:
//public double getArea(){
//            return length * width;
//}
    //public double getArea(){
//            return super.getLength() * super.getWidth();
//}
//}
// =============================================================
