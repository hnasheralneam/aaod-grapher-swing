public class ParametricTester2 extends ParametricGrapher {
    @Override
    public double tInterval() {
        return 0.05 * Math.PI;
    }

    @Override
    public double tStart() {
        return 0;
    }

    @Override
    public double tEnd() {
        return (2 * Math.PI);
    }

    @Override
    public double xValue(double t) {
        return 3 * Math.cos(t);
    }

    @Override
    public double yValue(double t) {
        return .5 * Math.sin(t);
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

    public static void main(String[] args) {
        ParametricTester2 tester = new ParametricTester2();
        tester.drawGraph(0, 0, 500, 500);
    }
}
