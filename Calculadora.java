import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos los números
        System.out.print("Introduce el primer número positivo:");
        int A = sc.nextInt();
        System.out.print("Introduce el segundo numero positivo:");
        int B = sc.nextInt();

        if ((A >= 0) && (B >=0)) {              //Comprobamos que son positivos y pedimos la operación
            System.out.print("Introduce la operación a realizar (/,*,+,-): ");
            String opera = sc.next();
            //realizamos la operación correspondiente
            switch (opera) {
                case "/":
                    int division = A / B;
                    System.out.print("El resultado es " + division);
                    break;
                case "*":
                    int multiplica = A * B;
                    System.out.print("El resultado es " + multiplica);
                    break;
                case "+":
                    int suma = A + B;
                    System.out.print("El resultado es " + suma);
                    break;
                case "-":
                    int resta = A - B;
                    System.out.print("El resultado es " + resta);
                    break;
                default:
                    System.out.println("Operador incorrecto");
            }

            // En caso de que uno de los numeros no fuese positivo, imprimimos el mensaje correspondiente según cuál sea el negativo
        } else if (0 > A){
            System.out.println("El primer número no es positivo");

        } else if (0 > B){
            System.out.println("El segundo número no es positivo");

        } else {
            System.out.println("Los números no son positivos");
        }
    }
}

