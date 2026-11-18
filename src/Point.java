

public class Point {
    private final double x;
    private final double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        }
    
    public static final Point ORIGIN = new Point(0, 0);

        // Let other classes read the private x and y fields.
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
Point a = new Point(3, 4);
Point b = new Point(1, 2);

}


