import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    private MarsRover marsRover;
    private int initialPositionX;
    private int initialPositionY;

    @BeforeEach
    void setUp() {
        marsRover = new MarsRover(4, 4);
        initialPositionX = 1;
        initialPositionY = 1;
    }

    @Test
    void posXPlusOneTest() {
        int movementRouteX = 1;
        int movementRouteY = 0;

        int wishedTargetPositionX = 2;
        int wishedTargetPositionY = 1;

        String[][] surface = marsRover.marsSurface(initialPositionX, initialPositionY, movementRouteX, movementRouteY);

        Assertions.assertEquals("I", surface[initialPositionX - 1][initialPositionY - 1].trim());
        Assertions.assertEquals("D", surface[wishedTargetPositionX - 1][wishedTargetPositionY - 1].trim());
    }

    @Test
    void posXMinusOneTest() {
        int movementRouteX = -1;
        int movementRouteY = 0;

        int wishedTargetPositionX = 4;
        int wishedTargetPositionY = 1;

        String[][] surface = marsRover.marsSurface(initialPositionX, initialPositionY, movementRouteX, movementRouteY);

        Assertions.assertEquals("I", surface[initialPositionX - 1][initialPositionY - 1].trim());
        Assertions.assertEquals("D", surface[wishedTargetPositionX - 1][wishedTargetPositionY - 1].trim());
    }

    @Test
    void posYPlusOneTest() {
        int movementRouteX = 0;
        int movementRouteY = 1;

        int wishedTargetPositionX = 1;
        int wishedTargetPositionY = 2;

        String[][] surface = marsRover.marsSurface(initialPositionX, initialPositionY, movementRouteX, movementRouteY);

        Assertions.assertEquals("I", surface[initialPositionX - 1][initialPositionY - 1].trim());
        Assertions.assertEquals("D", surface[wishedTargetPositionX - 1][wishedTargetPositionY - 1].trim());
    }

    @Test
    void posYMinusOneTest() {
        int movementRouteX = 0;
        int movementRouteY = -1;

        int wishedTargetPositionX = 1;
        int wishedTargetPositionY = 4;

        String[][] surface = marsRover.marsSurface(initialPositionX, initialPositionY, movementRouteX, movementRouteY);

        Assertions.assertEquals("I", surface[initialPositionX - 1][initialPositionY - 1].trim());
        Assertions.assertEquals("D", surface[wishedTargetPositionX - 1][wishedTargetPositionY - 1].trim());
    }
}
