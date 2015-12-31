public class Rover {
    private Position position;
    private Orientation orientation;
    private final Range range;

    public Rover(Position position, Orientation n, Range range) {

        this.position = position;
        orientation = n;
        this.range = range;
    }

    public Status execute(String commands) {
        if (commands.equals("L")) {
            orientation = orientation.left();
        } else if (commands.equals("R")) {
            orientation = orientation.right();
        } else if (commands.equals("M")) {
            position = position.shift(orientation, range);
        }
        return new Status(position, orientation);
    }
}
