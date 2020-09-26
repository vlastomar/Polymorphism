package ShapesPack;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height);
        this.setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public Double getWidth() {
        return this.width;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * (this.height + this.width));
    }

    @Override
    public void calculateArea() {
        setArea(this.height * this.width);
    }
}
