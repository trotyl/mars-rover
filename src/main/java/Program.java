public class Program {
    private final RoverFactory factory;

    public Program(RoverFactory factory) {
        this.factory = factory;
    }

    public String run(String input) {
        String[] lines = input.split(String.format("%n"));

        String statusLine = lines[1];
        String[] statusTokens = statusLine.split(" ");
        int x = Integer.parseInt(statusTokens[0]);
        int y = Integer.parseInt(statusTokens[1]);
        Orientation orientation = Orientation.valueOf(statusTokens[2]);

        Rover rover = factory.create(x, y, orientation);

        String actionLine = lines[2];
        Position position = rover.execute(actionLine);

        return position.toString();
    }
}
