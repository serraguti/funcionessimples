public class HerramientasPersonas {
    public static String getLetraNIF(int numeroDni){
        //12345678
        //( nº DNI - ((nº DNI / 23) * 23))
        int resultado = (numeroDni - ((numeroDni / 23) * 23));
        String letra = "";
        if (resultado == 0){
            letra = "T";
        }else if (resultado == 1){
            letra = "R";
        }else if (resultado == 2){
            letra = "W";
        }else if (resultado == 3){
            letra = "A";
        }else if (resultado == 4){
            letra = "G";
        }else if (resultado == 5){
            letra = "M";
        }else if (resultado == 6){
            letra = "Y";
        }else if (resultado == 7){
            letra = "F";
        }else if (resultado == 8){
            letra = "P";
        }else if (resultado == 9){
            letra = "D";
        }else if (resultado == 10){
            letra = "X";
        }else if (resultado == 11){
            letra = "B";
        }else if (resultado == 12){
            letra = "N";
        }else if (resultado == 13){
            letra = "J";
        }else if (resultado == 14){
            letra = "Z";
        }else if (resultado == 15){
            letra = "S";
        }else if (resultado == 16){
            letra = "Q";
        }else if (resultado == 17){
            letra = "V";
        }else if (resultado == 18){
            letra = "H";
        }else if (resultado == 19){
            letra = "L";
        }else if (resultado == 20){
            letra = "C";
        }else if (resultado == 21){
            letra = "K";
        }else if (resultado == 22){
            letra = "E";
        }else if (resultado == 23){
            letra = "T";
        }
        return letra;
    }
}
