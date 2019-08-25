package STG.FactoryShape;

 class ShapeFactory {

    Shape getShape(String shapeType){

        if ("CIRCLE".equals(shapeType)){
            return new Circle();
        }else if("SQUARE".equals(shapeType)) {
            return new Square();

        }else if("RECTACGLE".equals(shapeType)) {
            return  new Rectangle();
        }else if("".equals(shapeType)) {

            return  new EmptyInput();
        }else{
            return  new NoShape();
        }
    }
}
