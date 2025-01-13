public class HerramientasPersonas {
    public static String getLetraNIF(int numeroDni){
        int resultado = (numeroDni - ((numeroDni / 23) * 23));
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra = secuencia.charAt(resultado);
        String letraConvertida =
            String.valueOf(letra);
        return letraConvertida;
    }
}
