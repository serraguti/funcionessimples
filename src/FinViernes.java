import java.util.Scanner;

public class FinViernes {
    //psvm
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        //CAPTURAMOS EL String numérico que el usuario ha introducido
        String dato = teclado.nextLine();
        //CONVERTIMOS EL TEXTO A NUMERO
        int numero = Integer.parseInt(dato);
        //LLAMAMOS A EVALUAR NUMERO
        String respuesta = evaluarNumero(numero);
        System.out.println(respuesta);
    }

    public static String evaluarNumero(int numero){
        if (numero > 0){
            return "POSITIVO: " + numero;
        }else if (numero < 0){
            return "NEGATIVO: " + numero;
        }else{
            return "CERO: " + numero;
        }
    }
}
