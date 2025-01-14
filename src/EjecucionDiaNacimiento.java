import java.util.Scanner;

public class EjecucionDiaNacimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el día de nacimiento");
        String entrada = teclado.nextLine();
        int dia = Integer.parseInt(entrada);
        System.out.println("Introduzca el mes de nacimiento");
        entrada = teclado.nextLine();
        int mes = Integer.parseInt(entrada);
        System.out.println("Introduzca el año de nacimiento");
        entrada = teclado.nextLine();
        int anyo = Integer.parseInt(entrada);
        String diaSemana = 
            HerramientasPersonas.getDiaNacimiento(dia, mes, anyo);
        System.out.println("El día de nacimiento es: "
            + diaSemana);
    }
}
