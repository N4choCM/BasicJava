package Activities789;

import java.util.ArrayList;

public class ArrayList_Loop {
    /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
        y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        el primer "for" de relleno.
    */

    public static void main(String[] args) {

        ArrayList<Integer> numsList = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            numsList.add(i);

            for (int j = 0; j < numsList.size(); j++) {

                if (numsList.get(j) % 2 == 0) {
                    numsList.remove(j);
                }
            }
        }

        System.out.println(numsList);
    }

}
