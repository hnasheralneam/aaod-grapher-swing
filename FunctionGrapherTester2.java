public class FunctionGrapherTester2 extends FunctionGrapher {
    @Override
    public double xIncrement() {
        return .1;
    }

    @Override
    public double yValue(double x) {
        return Math.cos(x);
    }

    @Override
    public double xValue(int pointNum) {
        return pointNum * xIncrement() + xyStart().getX();
    }

    @Override
    public Coordinate xyStart() {
        return new Coordinate(0, -1);
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
        FunctionGrapherTester2 tester = new FunctionGrapherTester2();
        tester.drawGraph(0, 0, 500, 500);
    }
}
