public class HerramientasPersonas {

    public static String getDiaNacimiento(int dia, int mes, int anyo){
        //COMPROBAMOS ENERO Y FEBRERO
        if (mes == 1){
            mes = 13;
            anyo--;
        }else if (mes == 2){
            mes = 14;
            anyo--;
        }
        //ALMACENAMOS EN VARIABLES DIFERENTES CADA OPERACION MATEMATICA
        int op1 = ((mes + 1) * 3) / 5;
        int op2 = anyo / 4;
        int op3 = anyo / 100;
        int op4 = anyo / 400;
        //Sumar el dia, 
        //el doble del mes, el año, el resultado de la operación 1
        //, el resultado de la operación 2, 
        //menos el resultado de la operación 3 más la operación 4 más 2.
        int op5 = dia + (mes * 2) + anyo + op1 + op2 - op3 + op4 + 2;
        int op6 = op5 / 7;
        int resultado = op5 - (op6 * 7);
        String diaSemana = "";
        if (resultado == 0){
            diaSemana = "SABADO";
        }else if (resultado == 1){
            diaSemana = "DOMINGO";
        }else if (resultado == 2){
            diaSemana = "LUNES";
        }else if (resultado == 3){
            diaSemana = "MARTES";
        }else if (resultado == 4){
            diaSemana = "MIERCOLES";
        }else if (resultado == 5){
            diaSemana = "JUEVES";
        }else if (resultado == 6){
            diaSemana = "VIERNES";
        }
        return diaSemana;
    }

    public static String getLetraNIF(int numeroDni){
        int resultado = (numeroDni - ((numeroDni / 23) * 23));
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra = secuencia.charAt(resultado);
        String letraConvertida =
            String.valueOf(letra);
        return letraConvertida;
    }

    //QUISIERA UN METODO QUE RECIBA UN NIF/DNI
    //Y NOS DEVUELVA SI ES VALIDO O NO
    public static boolean validarNIF(String nif){
        int longitud = nif.length() - 1;
        //RECUPERAR EL ULTIMO CARACTER
        char ultimaLetra = nif.charAt(longitud);
        //ELIMINAMOS EL ULTIMO CARACTER
        String soloNumeros = 
            nif.substring(0, longitud);
        //NECESITAMOS CONVERTIR LOS TIPOS
        int numeroDni = Integer.parseInt(soloNumeros);
        //CONVERTIMOS LA LETRA A STRING PARA COMPARAR
        String letraComparacion = 
            String.valueOf(ultimaLetra);
        //LLAMAMOS AL METODO QUE NOS DEVUELVE UNA LETRA
        String resultado = getLetraNIF(numeroDni);
        return resultado.equals(letraComparacion);
    }
}
