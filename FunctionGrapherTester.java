public class FunctionGrapherTester extends FunctionGrapher {
    @Override
    public double xIncrement() {
        return .1;
    }

    @Override
    public double yValue(double x) {
        return Math.sin(x);
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

    public static void main(String[] args) {
        FunctionGrapherTester tester = new FunctionGrapherTester();
        tester.drawGraph(0, 0, 500, 500);
    }
}
