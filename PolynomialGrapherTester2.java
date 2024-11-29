public class PolynomialGrapherTester2 extends PolynomialGrapher {
    @Override
    public Coordinate xyStart() {
        return new Coordinate(-4, -2);
    }
    @Override
    public double xRange() {
        return 8;
    }
    @Override
    public double yRange() {
        return 16;
    }
    @Override
    public double xIncrement() {
        return 0.1;
    }
    @Override
    public double[] coefficients() {
        return new double[]{1, -3, -4, 12};
    }


    @Override
    public Coordinate getPoint(int pointNum) {
        if (xValue(pointNum) <= xRange()) return new Coordinate(xValue(pointNum), yValue(xValue(pointNum)));
        return null;
    }


    @Override
    public double yValue(double x) {
        double y = 0;
        for (int i = 0; i < coefficients().length; i++) {
            y += coefficients()[i] * Math.pow(x, i);
        }
        return y;
    }
    @Override
    public double xValue(int pointNum) {
        return pointNum * xIncrement() + xyStart().getX();
    }


    public static void main(String[] args) {
        PolynomialGrapherTester2 tester = new PolynomialGrapherTester2();
        tester.drawGraph(0, 0, 500, 500);
    }
}
