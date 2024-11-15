public class GrapherTester1 extends XYGrapher {
    @Override
    public Coordinate xyStart() {
        return new Coordinate(-2, -2);
    }

    @Override
    public double xRange() {
        return 4;
    }

    @Override
    public double yRange() {
        return 4;
    }

    @Override
    public Coordinate getPoint(int pointNum) {
        return switch (pointNum) {
            case 0 -> new Coordinate(-1, -1);
            case 1 -> new Coordinate(1, -1);
            case 2 -> new Coordinate(1, 1);
            case 3 -> new Coordinate(-1, 1);
            case 4 -> new Coordinate(-1, -1);
            default -> null;
        };
    }
}
