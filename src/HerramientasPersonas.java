public class HerramientasPersonas {
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
