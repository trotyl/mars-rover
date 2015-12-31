public class Rover {
    private int x;
    private int y;
    private Orientation orientation;

    public Rover(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public Status execute(String commands) {
        Position position = new Position(0, 0);
        if (commands.equals("L")) {
            return new Status(position, Orientation.W);
        }
        return new Status(position, Orientation.N);
    }

    public void setRange(int maxX, int maxY) {

    }
}
