public abstract class XYGrapher extends GoodDrawGraph {
    @Override
    abstract public double xRange();
    @Override
    abstract public double yRange();
    @Override
    abstract public Coordinate getPoint(int pointNum);
}