import java.util.Scanner;

public class EjecucionPersonas {
    public static void main(String[] args) {
        //12345678 -- Z
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca número de NIF");
        String entrada = teclado.nextLine();
        //RECUPERAMOS EL NUMERO DE DNI
        int numeroDni = Integer.parseInt(entrada);
        String letra = HerramientasPersonas.getLetraNIF(numeroDni);
        System.out.println("Su letra de NIF es " + letra);
    }
}
