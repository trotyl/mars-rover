public class Rover {
    private Position position;
    private Orientation orientation;

    public Rover(int x, int y, Orientation orientation, Range range) {
        this.position = new Position(x, y);
        this.orientation = orientation;
    }

    public Status execute(String commands) {
        if (commands.equals("L")) {
            orientation = orientation.left();
        } else if (commands.equals("R")) {
            orientation = orientation.right();
        }
        return new Status(position, orientation);
    }
}
