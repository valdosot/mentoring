import java.util.Arrays;

public class MarsRover {
    public String[][] marsSurface(int posIni_x, int posIni_y, int posDes_x, int posDes_y) {
        String[][] surface = new String[4][4];
        //Se rellena la matriz que representa la superficie
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                surface[x][y] = " º";
            }
        }

        //Se marca la posición inicial I
        surface[posIni_x - 1][posIni_y - 1] = " I";

        //Se calcula donde será la posición de destino x
        int dest_x = (posIni_x + posDes_x) - 1;
        if(dest_x == 4) dest_x = 1;
        if(dest_x == -1) dest_x = 3;

        //Se calcula donde será la posición de destino y
        int dest_y = (posIni_y + posDes_y) - 1;
        if(dest_y == 4) dest_y = 1;
        if(dest_y == -1) dest_y = 3;

        //Se marca la posición de destino D
        surface[dest_x][dest_y] = " D";

        //Se prepara el print para visualizar la matriz que representa la superficie
        String[] arrY = new String[4];
        for (int j = 0; j < 4; j++) {
            arrY[j] = "Y" + (j + 1);
        }
        System.out.println("    " + Arrays.toString(arrY).substring(1, 15));

        int i = 1;
        for (String x[] : surface) {
            System.out.println("X" + i++ + " " + Arrays.toString(x));
        }
        return surface;
    }
}
