
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Que cadena quieres comparar? ");
        String cadena = leer.nextLine();
        System.out.println("============================");
        if (esPalindromo(cadena)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        System.out.println("============================");

    }

    static boolean esPalindromo(String cadena) {
        cadena = cadena.replace(" ", "").toLowerCase();
        StringBuilder cadenaInvertida = new StringBuilder();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadena.equals(cadenaInvertida.toString());
    }
}
