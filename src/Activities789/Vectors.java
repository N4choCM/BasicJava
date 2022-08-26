package Activities789;

import java.util.Vector;

public class Vectors {
    /*
        Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final.
    */

    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add("Data no. 1");
        vector.add("Data no. 2");
        vector.add("Data no. 3");
        vector.add("Data no. 4");
        vector.add("Data no. 5");

        System.out.println(vector);

        vector.remove(1);
        vector.remove(1);

        System.out.println(vector);

        /*
            Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
            1000 elementos para ser añadidos al mismo.
        */

        System.out.println("Every single time we overflow the established limit, the memory gets duplicated." +
                "\nTherefore, a lot of memory is wasted. For example, if the original memory limit of the vector " +
                "\nwas 25 and we introduce 26 elements, the memory is going to be set automatically to 50 elements." +
                "\nThis means we are gonna have 24 unused indexes in the vector.");
    }
}
