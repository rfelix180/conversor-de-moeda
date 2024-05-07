import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha a conversão desejada:");
            System.out.println("1 - Real para Dólar");
            System.out.println("2 - Dólar para Real");
            System.out.println("3 - Real para Euro");
            System.out.println("4 - Euro para Real");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                break; // Sai do loop e do programa
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            String de = "", para = "", moedaDestino = "";

            switch (opcao) {
                case 1:
                    de = "BRL";
                    para = "USD";
                    moedaDestino = "Dólares";
                    break;
                case 2:
                    de = "USD";
                    para = "BRL";
                    moedaDestino = "Reais";
                    break;
                case 3:
                    de = "BRL";
                    para = "EUR";
                    moedaDestino = "Euros";
                    break;
                case 4:
                    de = "EUR";
                    para = "BRL";
                    moedaDestino = "Reais";
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    continue; // Volta ao início do loop
            }

            double valorConvertido = ConversorMoedas.converter(de, para, valor);
            System.out.println(valor + " " + de + " = " + valorConvertido + " " + moedaDestino);
        }

        System.out.println("Programa encerrado.");
    }
}