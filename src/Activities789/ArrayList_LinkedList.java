package Activities789;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {
    /*
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
    */

    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Nacho");
        namesList.add("Laura");
        namesList.add("Ana");
        namesList.add("Ernesto");

        LinkedList<String> linkedlist = new LinkedList<String>();

        for (int i = 0; i < namesList.size(); i++) {
            linkedlist.add(i, namesList.get(i));
        }

        System.out.println("Array Elements:");
        for (String element : namesList) {
            System.out.println(element);
        }

        System.out.println("LinkedListElements:");
        for (String element : linkedlist) {
            System.out.print(element);
        }
    }
}
