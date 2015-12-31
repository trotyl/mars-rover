public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y ;
    }

    public Position shift(Orientation orientation, Range range) {
        Vector vector = orientation.vector();
        int newX = x + vector.x;
        int newY = y + vector.y;

        return range.cover(newX, newY);
    }
}
