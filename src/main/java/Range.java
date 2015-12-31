public class Range {
    private final int x;
    private final int y;

    public Range(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position cover(int x, int y) {
        if (x > this.x) {
            x = this.x;
        } else if (x < 0) {
            x = 0;
        }

        if (y > this.y) {
            y = this.y;
        } else if (y < 0) {
            y = 0;
        }

        return new Position(x, y);
    }
}
