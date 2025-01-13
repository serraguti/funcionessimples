//AGREGAMOS Scanner PARA TRABAJAR CON TECLADO
import java.util.Scanner;

public class InicioLunes {
    public static void main(String[] args) {
        //CREAMOS UN NUEVO TECLADO PARA PEDIR DATOS AL USUARIO
        Scanner teclado = new Scanner(System.in);
        //MOSTRAMOS UN MENSAJE AL USUARIO PARA PEDIR UN NUMERO
        System.out.println("Introduzca un número");
        //CAPTURAMOS LO QUE EL USUARIO HA ESCRITO
        String entrada = teclado.nextLine();
        //DECLARAMOS UN NUMERO Y GUARDAMOS EN SU INTERIOR
        //EL VALOR QUE EL USUARIO HA ESCRITO (entrada)
        //"12345" Integer.parse...
        int numero = Integer.parseInt(entrada);
        //SI ESTAMOS EN LA PROPIA CLASE, SIMPLEMENTE 
        //ESCRIBIMOS EL NOMBRE DEL METODO
        // String respuesta = evaluarNumero(numero);
        String respuesta = "";
        if (numero > 0){
            respuesta = "POSITIVO";
        }else if (numero == 0){
            respuesta = "CERO";
        }else{
            respuesta = "NEGATIVO";
        }
        System.out.println(respuesta);
    }

    //VAMOS A CREAR UNA FUNCION/METODO QUE RECIBIRA UN NUMERO
    //Y NOS DEVOLVERA UN TEXTO: POSITIVO, NEGATIVO, CERO
    public static String evaluarNumero(int num){
        if (num > 0){
            return "POSITIVO";
        }else if (num == 0){
            return "CERO";
        }else{
            return "NEGATIVO";
        }
    }


}
