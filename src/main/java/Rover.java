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
            switch (c) {
                case 'L':
                    orientation = orientation.left();
                    break;
                case 'R':
                    orientation = orientation.right();
                    break;
                case 'M':
                    position = position.shift(orientation, range);
                    break;
            }
        }
        return new Status(position, orientation);
    }
}
