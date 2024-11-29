public class PolynomialGrapherTester extends PolynomialGrapher {
    @Override
    public Coordinate xyStart() {
        return new Coordinate(0, 0);
    }
    @Override
    public double xRange() {
        return 6;
    }
    @Override
    public double yRange() {
        return 10;
    }
    @Override
    public double xIncrement() {
        return 0.2;
    }
    @Override
    public double[] coefficients() {
        return new double[]{4.8, -1.2, .2};
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
        PolynomialGrapherTester tester = new PolynomialGrapherTester();
        tester.drawGraph(0, 0, 500, 500);
    }
}
