import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverTest {
    @Test
    public void should_produce_00N_for_empty_command_start_from_00N_in_range_55() {
        Rover rover = new Rover(0, 0, Orientation.N, new Range(5, 5));
        Status status = rover.execute("");

        assertThat(status.toString(), is("0 0 N"));
    }

    @Test
    public void should_produce_00W_for_command_L_start_from_00N_in_range_55() {
        Rover rover = new Rover(0, 0, Orientation.N, new Range(5, 5));
        Status status = rover.execute("L");

        assertThat(status.toString(), is("0 0 W"));
    }

    @Test
    public void should_produce_00S_for_command_L_start_from_00W_in_range_55() {
        Rover rover = new Rover(0, 0, Orientation.W, new Range(5, 5));
        Status status = rover.execute("L");

        assertThat(status.toString(), is("0 0 S"));
    }

    @Test
    public void should_produce_00E_for_command_R_start_from_00N_in_range_55() {
        Rover rover = new Rover(0, 0, Orientation.N, new Range(5, 5));
        Status status = rover.execute("R");

        assertThat(status.toString(), is("0 0 E"));
    }


    @Test
    public void should_produce_00S_for_command_R_start_from_00E_in_range_55() {
        Rover rover = new Rover(0, 0, Orientation.E, new Range(5, 5));
        Status status = rover.execute("R");

        assertThat(status.toString(), is("0 0 S"));
    }

}
