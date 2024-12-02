public class DiscontinuousTester2 extends DiscontinuousFunctionGrapher {
    @Override
    public boolean exclude(double xValue) {
        return xValue == 0;
    }

    @Override
    public double yValue(double x) {
        return 1 / x;
    }

    @Override
    public Coordinate xyStart() {
        return new Coordinate(-3, -3);
    }
    @Override
    public double xRange() {
        return 6;
    }
    @Override
    public double yRange() {
        return 6;
    }
    @Override
    public double xIncrement() {
        return 0.2;
    }

    public static void main(String[] args) {
        DiscontinuousTester2 tester = new DiscontinuousTester2();
        tester.drawGraph(0, 0, 500, 500);
    }
}
