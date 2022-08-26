package Activities789;

public class Array2D {
    /*
        Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento
        en ambas dimensiones.
    */

    public static void main(String[] args) {

        int[][] arrayNums = {
                {10, 20, 30, 40, 50},
                {5, 10, 15, 20, 25}
        };

        for (int i = 0; i < arrayNums.length; i++) {

            for (int j = 0; j < arrayNums[i].length; j++) {
                System.out.println("Row: " + (i + 1) + " | Column: " + (j + 1) +
                        "\nThe value is: " + arrayNums[i][j] + "\n");
            }
        }
    }
}
