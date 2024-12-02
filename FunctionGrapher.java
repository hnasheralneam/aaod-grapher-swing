public abstract class FunctionGrapher extends XYGrapher {
    abstract public double xIncrement();
    abstract public double yValue(double x);

    public double xValue(int pointNum) {
        return pointNum * xIncrement() + xyStart().getX();
    }

    @Override
    public Coordinate getPoint(int pointNum) {
        if (xValue(pointNum) <= xRange()) return new Coordinate(xValue(pointNum), yValue(xValue(pointNum)));
        return null;
    }
}