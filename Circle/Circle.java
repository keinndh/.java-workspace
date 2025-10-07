public class Circle {
    private int radius;
    private double perimeter;
    private double area;
    
    public int getRadius() { 
        return radius;
    }
    
    public void setRadius(int theRadius) {
        radius = theRadius;
    }
    
    public void calculateArea(double area) {
        area = 3.14 * (radius * radius);
    }
    
    public void calculatePerimeter(double perimeter) {
        perimeter = 2 * 3.14 * radius;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
 
}
