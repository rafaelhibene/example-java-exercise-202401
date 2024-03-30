import java.util.Scanner;
public class exercicioTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        double temperatura, media, resultado;
        media = 0;
        for (i = 1; i <= 12; i++) {
            System.out.print("Digite a  temperatura " + i + " (entre 4 e 10): ");
            temperatura = scanner.nextDouble();
            
            if (temperatura >= 4 && temperatura <= 10) {
                media = media + temperatura;
            } else {
                System.out.println("A temperatura deve estar entre 4 e 10 graus celsius");
                i = i - 1;
            }
        }

            resultado = media / 12;
            String resultadoFormatado = String.format("%.1f", resultado);

            System.out.print("A média de hoje das temperaturas é: " + resultadoFormatado + "º C");

        scanner.close();
    }
}


