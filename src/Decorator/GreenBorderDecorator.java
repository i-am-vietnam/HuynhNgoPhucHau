package Decorator;

public class GreenBorderDecorator extends ShapeDecorator{
    public GreenBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        applyGreenBorder();
    }

    private void applyGreenBorder() {
        System.out.println("Vẽ viền xanh");
    }
}
