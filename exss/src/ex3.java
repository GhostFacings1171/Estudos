import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes
        final double CONSUMO_CARRO = 10.5; // km/l

        // Entrada de dados
        System.out.println("=== Calculadora de Consumo de Combustível ===");
        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoHoras = scanner.nextDouble();

        System.out.print("Digite a velocidade média em km/h: ");
        double velocidadeMedia = scanner.nextDouble();

        // Cálculos
        double distancia = tempoHoras * velocidadeMedia;
        double litrosGastos = distancia / CONSUMO_CARRO;

        // Saída dos resultados
        System.out.println("\n=== Resultados da Viagem ===");
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Litros de combustível gastos: %.2f L%n", litrosGastos);
        System.out.printf("Consumo médio do carro: %.1f km/l%n", CONSUMO_CARRO);

        scanner.close();
    }
}