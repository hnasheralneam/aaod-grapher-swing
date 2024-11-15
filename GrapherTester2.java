public class GrapherTester2 extends XYGrapher {
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
            case 0 -> new Coordinate(0, 1.5);
            case 1 -> new Coordinate(0.35, 0.35);
            case 2 -> new Coordinate(1.5, 0.35);
            case 3 -> new Coordinate(0.55, -0.15);
            case 4 -> new Coordinate(0.9, -1.5);
            case 5 -> new Coordinate(0, -0.45);
            case 6 -> new Coordinate(-0.9, -1.5);
            case 7 -> new Coordinate(-0.55, -0.15);
            case 8 -> new Coordinate(-1.5, 0.35);
            case 9 -> new Coordinate(-0.35, 0.35);
            case 10 -> new Coordinate(0, 1.5);
            default -> null;
        };
    }
}
