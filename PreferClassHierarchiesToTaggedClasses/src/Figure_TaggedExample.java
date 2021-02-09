public class Figure_TaggedExample {

    enum Shape {RECTANGLE, CIRCLE};

    //tag field - the shape of this figure
    Shape shape;

    double length;
    double width;

    double radius;

    //Constructor for Circle
    Figure_TaggedExample(double radius){
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    //Constructor for Rectangle
    Figure_TaggedExample(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        switch (shape){
            case CIRCLE: return Math.PI * (radius * radius);
            case RECTANGLE: return (length * width);
            default:throw  new AssertionError(shape);
        }
    }

}
