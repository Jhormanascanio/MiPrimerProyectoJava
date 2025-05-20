import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int num1= scanner.nextInt();
        if(num1>0 && num1<10){
        System.out.println("su numero es de una cifra");
    }else if(num1>9 && num1<100){
        System.out.println("su numero es de dos cifras");

    }else if (num1>99 && num1<1000) {
        System.out.println("su numero es de tres cifras");

    }else{
        System.out.println("error");
        
    }




    }
    
}
