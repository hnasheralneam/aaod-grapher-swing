public abstract class FunctionGrapher extends XYGrapher {
    abstract public double xIncrement();
    abstract public double yValue(double x);
    abstract public double xValue(int pointNum);
}