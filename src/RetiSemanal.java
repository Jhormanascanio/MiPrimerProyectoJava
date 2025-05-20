public class RetiSemanal {
        public static void main(String[] args) {
            
            double saldo = 1000.0;
            
            double retiroPorSemana = 200.0;
            
            int semanas = 4;
            
            for (int i = 1; i <= semanas; i++) {
                saldo -= retiroPorSemana;  
                System.out.println("Semana " + i + ": Se retiraron $200.00, saldo restante: $" + String.format("%.2f", saldo));
            }
            
            System.out.println("Saldo final después de " + semanas + " semanas: $" + String.format("%.2f", saldo));
        }
    }
    