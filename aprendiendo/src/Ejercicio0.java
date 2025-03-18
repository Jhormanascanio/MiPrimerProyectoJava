import java.util.Scanner;
public class Ejercicio0 { 

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Ingresa un numero");
        int num = input.nextInt();
        boolean esPerfecto = false;
        if (num>1){
            int sumDivisores = 1;
            for (int i = 2 ; i<Math.sqrt(num); i++){
                if (num % i == 0){
                    sumDivisores += i;
                    if (i != num /i){
                        sumDivisores += num /i;

                    }
                }

            }
            System.out.println(" El numero " + num + " tiene " + sumDivisores + " divisores ");
            esPerfecto = (sumDivisores == num);
            System.out.println(" El numero es perfecto ? " +esPerfecto);

        }
        input.close();
    }
    
    
}
