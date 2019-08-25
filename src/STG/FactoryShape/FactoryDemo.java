package STG.FactoryShape;

public class FactoryDemo {


    public static void main(String[] agrs) {


    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shape1 = shapeFactory.getShape("CIRCLE");

    shape1.drawShape();

        Shape shape2 = shapeFactory.getShape("SQUARE");

        shape2.drawShape();

        Shape shape3 = shapeFactory.getShape("");

        shape3.drawShape();

        Shape shape4 = shapeFactory.getShape("new shape");

        shape4.drawShape();

        Shape shape5= shapeFactory.getShape("");

        shape5.drawShape();
}



}
