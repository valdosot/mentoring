import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    private MarsRover marsRover;
    private int initial_position_x;
    private int initial_position_y;

    @BeforeEach
    void setUp() {
        marsRover = new MarsRover();
        initial_position_x = 1;
        initial_position_y = 1;
    }

    @Test
    void posX_Plus_One_Test() {
        int movement_route_x = 1;
        int movement_route_y = 0;

        int wished_target_position_x = 2;
        int wished_target_position_y = 1;

        String[][] surface = marsRover.marsSurface(initial_position_x, initial_position_y, movement_route_x, movement_route_y);

        Assertions.assertEquals("I", surface[initial_position_x - 1][initial_position_y - 1].trim());
        Assertions.assertEquals("D", surface[wished_target_position_x - 1][wished_target_position_y - 1].trim());
    }

    @Test
    void posX_Minus_One_Test() {
        int movement_route_x = -1;
        int movement_route_y = 0;

        int wished_target_position_x = 4;
        int wished_target_position_y = 1;

        String[][] surface = marsRover.marsSurface(initial_position_x, initial_position_y, movement_route_x, movement_route_y);

        Assertions.assertEquals("I", surface[initial_position_x - 1][initial_position_y - 1].trim());
        Assertions.assertEquals("D", surface[wished_target_position_x - 1][wished_target_position_y - 1].trim());
    }

    @Test
    void posY_Plus_One_Test() {
        int movement_route_x = 0;
        int movement_route_y = 1;

        int wished_target_position_x = 1;
        int wished_target_position_y = 2;

        String[][] surface = marsRover.marsSurface(initial_position_x, initial_position_y, movement_route_x, movement_route_y);

        Assertions.assertEquals("I", surface[initial_position_x - 1][initial_position_y - 1].trim());
        Assertions.assertEquals("D", surface[wished_target_position_x - 1][wished_target_position_y - 1].trim());
    }
}
