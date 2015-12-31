public class RoverFactory {
    public Rover create(int x, int y, Orientation orientation) {
        return new Rover(new Position(x, y), orientation, new Range(5, 5));
    }
}
