public class Rover {
    private Position position;
    private Orientation orientation;

    public Rover(int x, int y, Orientation orientation, Range range) {
        this.position = new Position(x, y);
        this.orientation = orientation;
    }

    public Status execute(String commands) {
        if (commands.equals("L")) {
            orientation = Orientation.W;
        }
        return new Status(position, orientation);
    }
}
