public class FunctionGrapherTester3 extends FunctionGrapher {
    @Override
    public double xIncrement() {
        return .1;
    }

    @Override
    public double yValue(double x) {
        return 1 / x;
    }

    @Override
    public double xValue(int pointNum) {
        return pointNum * xIncrement() + xyStart().getX();
    }

    @Override
    public Coordinate xyStart() {
        return new Coordinate(0, 0);
    }

    @Override
    public double xRange() {
        return 20;
    }

    @Override
    public double yRange() {
        return 2;
    }

    @Override
    public Coordinate getPoint(int pointNum) {
        if (xValue(pointNum) <= xRange()) return new Coordinate(xValue(pointNum), yValue(xValue(pointNum)));
        return null;
    }

    public static void main(String[] args) {
        FunctionGrapherTester3 tester = new FunctionGrapherTester3();
        tester.drawGraph(0, 0, 500, 500);
    }
}
