import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
    int num1 = scanner.nextInt();
    if (num1>0) {
        System.out.println("el numero es positivo");

    }else if (num1<0) {
        System.out.println("el numero es negativo");
        
    }else
    {System.out.println("el numero es nulo =0");
    

    }
    }
    
}