package shapes;

public class Circle {
    private double radius;
//    private double PI = Math.PI;


    public Circle (double radius){
        this.radius = radius;
    }

    public double getArea(){
     return Math.pow(radius, 2) * Math.PI;
    }

    public double getCircumference () {
        return 2 * Math.PI * radius;
    }

}



