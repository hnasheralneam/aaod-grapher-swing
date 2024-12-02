public abstract class DiscontinuousFunctionGrapher extends FunctionGrapher {
    public Coordinate xyCoordinate() {
        return new Coordinate(0, 0);
    }

    public boolean exclude(double xValue) {
        return false;
    }
    
    @Override
    public Coordinate getPoint(int pointNum) {
        double x = xValue(pointNum);
        if (exclude(x)) return new Coordinate(x, 0, false, false);
        return super.getPoint(pointNum);
    }
}
