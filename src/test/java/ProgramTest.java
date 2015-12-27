import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProgramTest {
    private Program program;

    @Before
    public void setUp() {
        Rover rover = mock(Rover.class);
        when(rover.execute("LMLMLMLMM")).thenReturn(new Position(1, 3, Orientation.N));
        when(rover.execute("MMRMMRMRRM")).thenReturn(new Position(5, 1, Orientation.E));

        RoverFactory factory = mock(RoverFactory.class);
        when(factory.create(anyInt(), anyInt(), any(Orientation.class))).thenReturn(rover);

        program = new Program(factory);
    }

    @Test
    public void should_have_proper_result_with_single_rover() {
        String input = String.format("5 5%n1 2 N%nLMLMLMLMM");

        String output = program.run(input);

        assertThat(output, is("1 3 N"));
    }

    @Test
    public void should_have_proper_result_with_another_single_rover() {
        String input = String.format("5 5%n3 3 E%nMMRMMRMRRM");

        String output = program.run(input);

        assertThat(output, is("5 1 E"));
    }

    @Test
    public void should_have_proper_result_with_multi_rovers() {
        String input = String.format("5 5%n1 2 N%nLMLMLMLMM%n3 3 E%nMMRMMRMRRM");

        String output = program.run(input);

        assertThat(output, is(String.format("1 3 N%n5 1 E")));
    }
}
