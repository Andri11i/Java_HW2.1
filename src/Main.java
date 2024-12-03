public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 3),
                new Square(4),
                new Circle(2),
                new Square(6)
        };


        double totalArea = calculateTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }


    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}