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
        for (char c : commands.toCharArray()) {
            if (c == 'L') {
                orientation = orientation.left();
            } else if (c == 'R') {
                orientation = orientation.right();
            } else if (c == 'M') {
                position = position.shift(orientation, range);
            }
        }
        return new Status(position, orientation);
    }
}
