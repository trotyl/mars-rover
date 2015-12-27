public class Position {
    private final int x;
    private final int y;
    private final Orientation orientation;

    public Position(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + orientation;
    }
}
