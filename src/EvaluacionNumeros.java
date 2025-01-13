public class EvaluacionNumeros {

    public static void evaluarTresNumeros(int num1, int num2, int num3){
        int mayor, menor, intermedio;
        if (num1 >= num2 && num1 >= num3){
            mayor = num1;
        }else if (num2 >= num1 && num2 >= num3){
            mayor = num2;
        }else {
            mayor = num3;
        }

        if (num1 <= num2 && num1 <= num3){
            menor = num1;
        }else if (num2 <= num1 && num2 <= num3){
            menor = num2;
        }else{
            menor = num3;
        }

        int suma = num1 + num2 + num3;
        intermedio = suma - mayor - menor;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Intermedio: " + intermedio);
    }

    public static int mayorDosNumeros(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    
    public static int menorDosNumeros(int num1, int num2){
        if (num1 < num2) {
            return num1;
        }else{
            return num2;
        }
    }
}
