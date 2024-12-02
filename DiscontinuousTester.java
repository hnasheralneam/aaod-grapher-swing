public class DiscontinuousTester extends DiscontinuousFunctionGrapher {
    @Override
    public boolean exclude(double xValue) {
        return xValue == 1;
    }
    
    @Override
    public double yValue(double x) {
        return (Math.pow(x, 2) - 1) * (x - 1);
    }

    @Override
    public Coordinate xyStart() {
        return new Coordinate(0, 0);
    }
    @Override
    public double xRange() {
        return 3;
    }
    @Override
    public double yRange() {
        return 5;
    }
    @Override
    public double xIncrement() {
        return 0.2;
    }

    public static void main(String[] args) {
        DiscontinuousTester tester = new DiscontinuousTester();
        tester.drawGraph(0, 0, 500, 500);
    }
}
