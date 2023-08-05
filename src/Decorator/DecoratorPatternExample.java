package Decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redBorderCircle = new RedBorderDecorator(new Circle());
        Shape greenBorderRedBorderCircle = new GreenBorderDecorator(new RedBorderDecorator(new Circle()));

        System.out.println("Hình tròn cơ bản:");
        circle.draw();

        System.out.println("\nHình tròn có viền đỏ:");
        redBorderCircle.draw();

        System.out.println("\nHình tròn có viền xanh và viền đỏ:");
        greenBorderRedBorderCircle.draw();
    }
}
