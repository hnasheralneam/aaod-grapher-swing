public class Coordinate {
    double x, y;
    boolean drawFrom, drawTo;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
        drawFrom = true;
        drawTo = true;
    }

    public Coordinate(double x, double y, boolean drawFrom, boolean drawTo) {
        this.x = x;
        this.y = y;
        this.drawFrom = drawFrom;
        this.drawTo = drawTo;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean drawTo() {
        return drawTo;
    }

    public boolean drawFrom() {
        return drawFrom;
    }
}
