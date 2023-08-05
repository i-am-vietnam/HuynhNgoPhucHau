package Decorator;

public class RedBorderDecorator extends ShapeDecorator{
    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        applyRedBorder();
    }

    private void applyRedBorder() {
        System.out.println("Vẽ viền đỏ");
    }
}
