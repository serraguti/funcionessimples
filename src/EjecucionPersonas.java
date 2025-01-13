import java.util.Scanner;

public class EjecucionPersonas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca número de NIF");
        String entrada = teclado.nextLine();
        //RECUPERAMOS EL NUMERO DE DNI
        int numeroDni = Integer.parseInt(entrada);
        String letra = HerramientasPersonas.getLetraNIF(numeroDni);
        System.out.println("Su letra de NIF es " + letra);
        System.out.println("Introduzca un DNI completo");
        String dni = teclado.nextLine();
        boolean respuesta = 
            HerramientasPersonas.validarNIF(dni);
        System.out.println("El dni " + dni 
        + " es correcto: " + respuesta);
    }
}
