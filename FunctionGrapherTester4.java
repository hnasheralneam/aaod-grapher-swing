public class FunctionGrapherTester4 extends FunctionGrapher {
    @Override
    public double xIncrement() {
        return .1;
    }

    @Override
    public double yValue(double x) {
        return .6 * Math.pow(x, 3) + x - 1;
    }

    @Override
    public Coordinate xyStart() {
        return new Coordinate(-5, -5);
    }

    @Override
    public double xRange() {
        return 10;
    }

    @Override
    public double yRange() {
        return 10;
    }

    @Override
    public Coordinate getPoint(int pointNum) {
        if (xValue(pointNum) <= xRange()) return new Coordinate(xValue(pointNum), yValue(xValue(pointNum)));
        return null;
    }

    public static void main(String[] args) {
        FunctionGrapherTester4 tester = new FunctionGrapherTester4();
        tester.drawGraph(0, 0, 500, 500);
    }
}
