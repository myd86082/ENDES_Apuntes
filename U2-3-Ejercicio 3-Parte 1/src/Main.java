import java.util.Scanner;

public class Main {

    public static int calcularNumero(int posicion) {
        int resultado = 0;
        int numero = 0;
        int numero2 = 1;

        if (posicion == 1) {
            return numero;
        } else if (posicion == 2) {
            return numero2;
        } else {
            for (int i = 3; i <= posicion; i++) {
                resultado = numero + numero2;
                numero = numero2;
                numero2 = resultado;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicion = 0;
        int resultado = 0;

        do {
            System.out.println("Introduce una posicion: ");
            posicion = sc.nextInt();
            sc.nextLine();
        } while (posicion <= 0);

        resultado = calcularNumero(posicion);
        System.out.println("El numero de la posicion " + posicion + " es : " + resultado);
    }
}
