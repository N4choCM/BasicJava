package Activities789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Files {
    /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        dado en "fileOut".
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the original file: ");
        String fileIn = scanner.nextLine();
        System.out.println("Please, enter the target file: ");
        String fileOut = scanner.nextLine();
        copy(fileIn, fileOut);
    }

    private static void copy(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
