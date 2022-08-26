package Activities789;

import java.util.Scanner;

public class ReversedString {
    /*
        Escribe el código que devuelva una cadena al revés.
        Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sText;
        System.out.println("Please, enter a text: ");
        sText = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(sText);
        sText = reversedString.reverse().toString();

        System.out.println(sText);
    }
}
