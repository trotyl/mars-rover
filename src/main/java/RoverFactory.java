public class RoverFactory {
    public Rover create(int x, int y, Orientation orientation, Range range) {
        return new Rover(new Position(x, y), orientation, range);
    }
}
