import static java.lang.String.format;

public class Program {
    private final RoverFactory factory;

    public Program(RoverFactory factory) {
        this.factory = factory;
    }

    public String run(String input) {
        String[] lines = input.split(format("%n"));
        StringBuilder builder = new StringBuilder();

        String rangeLine = lines[0];
        String[] rangeTokens = rangeLine.split(" ");
        Range range = new Range(Integer.parseInt(rangeTokens[0]), Integer.parseInt(rangeTokens[1]));

        int line = 1;
        while (line < lines.length) {
            if (line > 1) {
                builder.append(format("%n"));
            }

            String statusLine = lines[line];
            String[] statusTokens = statusLine.split(" ");
            int x = Integer.parseInt(statusTokens[0]);
            int y = Integer.parseInt(statusTokens[1]);
            Orientation orientation = Orientation.valueOf(statusTokens[2]);

            Rover rover = factory.create(x, y, orientation, range);

            String actionLine = lines[line + 1];
            Status status = rover.execute(actionLine);

            builder.append(status.toString());
            line += 2;
        }

        return builder.toString();
    }
}
