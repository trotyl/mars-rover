import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProgramTest {

    @Test
    public void should_have_proper_result_with_single_rover() {
        String input = String.format("5 5%n1 2 N%nLMLMLMLMM");

        Program program = new Program();
        String output = program.run(input);

        assertThat(output, is("1 3 N"));
    }
}
