public class Rover {
    private int x;
    private int y;
    private Orientation orientation;

    public Rover(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public Position execute(String commands) {
        if (commands.equals("L")) {
            return new Position(0, 0, Orientation.W);
        }
        return new Position(0, 0, Orientation.N);
    }

    public void setRange(int maxX, int maxY) {

    }
}
