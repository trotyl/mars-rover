public class RoverFactory {
    public Rover create(int x, int y, Orientation orientation) {
        return new Rover(x, y, orientation);
    }
}
