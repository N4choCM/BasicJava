package Activities789;

public class Array1D {
    /*
        Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    */

    public static void main(String[] args) {

        String[] textsArray = {"This is the first text. ", "This is the second text. ", "This is the third text. "};

        for (String sText : textsArray) {
            System.out.print(sText);
        }
    }
}
