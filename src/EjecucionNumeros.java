import java.util.Scanner;

public class EjecucionNumeros {
    public static void main(String[] args) {
        //CREAMOS EL OBJETO TECLADO
        Scanner teclado = new Scanner(System.in);
        //MENSAJES PARA PEDIR DATOS
        System.out.println("Introduzca el número 1");
        //CAPTURAMOS LO QUE EL USUARIO HA ESCRITO
        String entrada = teclado.nextLine();
        //CAPTURAMOS EL PRIMER NUMERO
        int numero1 = Integer.parseInt(entrada);
        System.out.println("Introduzca número 2");
        entrada = teclado.nextLine();
        int numero2 = Integer.parseInt(entrada);
        int mayor = EvaluacionNumeros.mayorDosNumeros(numero1, numero2);
        int menor = EvaluacionNumeros.menorDosNumeros(numero1, numero2);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Introduzca número 3");
        entrada = teclado.nextLine();
        int numero3 = Integer.parseInt(entrada);
        EvaluacionNumeros.evaluarTresNumeros(numero1, numero2, numero3);
    }
}
