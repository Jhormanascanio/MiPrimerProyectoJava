import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingresa el primer numero ");
        int num1 = scanner.nextInt();
    
        System.out.println(" Ingresa el segundo numero ");
        int num2 = scanner.nextInt();
        if (num1 >num2){
            int suma = num1 + num2;
            int diferencia = num1 - num2;
            System.out.println( " la suma de los dod numeros es:" + suma );
            System.out.println( " L diferencio entere los dos numeros es: " + diferencia);
        } else {
            if (num2!= 0);{
                int producto = num1 * num2;
                double division = (double) num1 / num2;
                System.out.println(" El producto de los dos numeros es: " + producto);
                System.out.println( " El divisor de el primero entre el segundo es; " + division);
            }else;{
                System.out.println( " No se puede realizas la division , ya que el segundo es cero ");
                        

        scanner.close();

    }
}
