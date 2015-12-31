
public class Status {
    public final Position position;
    public final Orientation orientation;

    public Status(Position position, Orientation orientation) {
        this.position = position;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return position.toString() + " " + orientation.toString();
    }
}
