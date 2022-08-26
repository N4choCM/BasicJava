package Activity2;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        System.out.println("El precio final de su número, IVA incluido, es de: " + calculatesVat());
    }

    public static double calculatesVat(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número: ");

        int iNum = scanner.nextInt();

        double dIva = iNum * 0.21;

        double dResult = iNum + dIva;

        return dResult;
    }
}
