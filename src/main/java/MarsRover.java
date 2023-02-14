import java.util.Arrays;

public class MarsRover {
    private final String[][] surface;
    private final int sizeX;
    private final int sizeY;

    public MarsRover(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        surface = new String[sizeX][sizeY];
    }

    public String[][] marsSurface(int posIniX, int posIniY, int posDesX, int posDesY) {

        buildSurface();
        markInitialPosition(posIniX, posIniY);
        markFinalPosition(posIniX, posIniY, posDesX, posDesY);
        printMatrix();
        return surface;
    }

    private void buildSurface() {
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                this.surface[x][y] = " º";
            }
        }
    }

    private void markInitialPosition(int posIniX, int posIniY) {
        surface[posIniX - 1][posIniY - 1] = " I";
    }

    private void markFinalPosition(int posIniX, int posIniY, int posDesX, int posDesY) {
        int destX = getDestX(posIniX, posDesX);
        int destY = getDestY(posIniY, posDesY);
        surface[destX][destY] = " D";
    }

    private int getDestX(int posIniX, int posDesX) {
        int destX = (posIniX + posDesX) - 1;
        if (destX == sizeX) destX = 1;
        if (destX == -1) destX = sizeX - 1;
        return destX;
    }

    private int getDestY(int posIniY, int posDesY) {
        int destY = (posIniY + posDesY) - 1;
        if (destY == sizeY) destY = 1;
        if (destY == -1) destY = sizeY - 1;
        return destY;
    }

    private void printMatrix() {
        String[] arrY = new String[sizeY];
        for (int j = 0; j < sizeY; j++) {
            arrY[j] = "Y" + (j + 1);
        }
        System.out.println("   " + Arrays.toString(arrY));

        int i = 1;
        for (var x : surface) System.out.println("X" + i++ + " " + Arrays.toString(x));
    }
}
