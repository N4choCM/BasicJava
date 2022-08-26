package Activities789;

import java.util.Scanner;

public class DivisionByZero {
    /*
        Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
        mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter two numbers: ");
        System.out.println("Number 1: ");
        int a = scanner.nextInt();
        System.out.print("Number 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println(Dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("ERROR: You cannot divide by zero.");
        } finally {
            System.out.println("Activity finished!");
        }
    }

    private static int Dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
