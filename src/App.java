public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Correcto!!!");
        mostrarSaludo("Paco");
        mostrarSaludo("Lucia");
        int numero = recuperarAnyo();
        System.out.println(numero);
        int valor1 = numeroDoble(7);
        int valor2 = numeroDoble(14);
        System.out.println(valor1);
        System.out.println(valor2);
        int valorSuma = sumarNumeros(8, 9);
        System.out.println("la suma de 8 + 9 es " + valorSuma);
        comprobarParImpar(7);
        comprobarParImpar(88);
        String resultado = evaluarNumero(88);
        String resultado2 = evaluarNumero(-98);
        System.out.println(resultado);
        System.out.println(resultado2);

        String textoNumero = "12345";
        //QUEREMOS GUARDAR EN UN NUMERO DICHO TEXTO
        //PARA CONVERTIR UN TIPO DE DATO String A UN PRIMITIVO
        // int, double, float...
        // Se utiliza el nombre de la clase y el método parse necesario
        // Son métodos static
        // int: Integer
        // float: Float
        // boolean: Boolean
        int datoNumero = Integer.parseInt(textoNumero);
        //CONVERTIR EL TEXTO A DECIMAL
        float miFloat = Float.parseFloat(textoNumero);
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

    public static void comprobarParImpar(int numero){
        //COMPROBAMOS EL TIPO DE NUMERO
        if (numero % 2 == 0){
            System.out.println("El número " + numero + " es PAR");
        }else{
            System.out.println("El número " + numero + " es IMPAR");
        }
    }

    public static int sumarNumeros(int num1, int num2){
        int sumar = num1 + num2;
        return sumar;
    }

    public static int numeroDoble(int numero){
        return numero * 2;
    }

    //METODO void QUE MUESTRE UN SALUDO
    public static void mostrarSaludo(String nombre) {
        //INSTRUCCIONES
        System.out.println("Bienvenido/a a " + nombre); 
    }

    public static int recuperarAnyo(){
        //INSTRUCCIONES
        System.out.println("Me estoy ejecutando!!!!");
        return 2025;
    }



}
