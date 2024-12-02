abstract public class ParametricGrapher extends XYGrapher {
    abstract public double tInterval();
    abstract public double tStart();
    abstract public double tEnd();

    @Override
    public Coordinate getPoint(int pointNum) {
        double t = tStart() + pointNum * tInterval();
        if (t < tStart() || t > tEnd()) {
            return null;
        }
        return new Coordinate(xValue(t), yValue(t));
    }
    abstract public double xValue(double pointNum);
    abstract public double yValue(double pointNum);
}
