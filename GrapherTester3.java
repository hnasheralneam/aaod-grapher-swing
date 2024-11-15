public class GrapherTester3 extends XYGrapher {
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
            case 0 -> new Coordinate(.5, 0);
            case 1 -> new Coordinate(1.5, 0);
            case 2 -> new Coordinate(1, 1.5);
            case 3 -> new Coordinate(.5, 0, false, true);

            case 4 -> new Coordinate(.7, .2);
            case 5 -> new Coordinate(1.3, .2);
            case 6 -> new Coordinate(1, 1.3);
            case 7 -> new Coordinate(.7, .2);
            default -> null;
        };
    }
}
