import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Seu Barriga";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao=0;
        double valor=0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua Opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case (1):
                    System.out.printf("SEU SALDO É: %,.2f \n", saldo);
                    break;

                case (2):
                    System.out.println("QUAL O VALOR QUE DESEJA TRANSFERIR?");
                    valor = leitura.nextDouble();
                    if (valor > saldo){
                        System.out.println("VOCE ESTA POBRE DEMAIS PARA ISTO");
                        break;
                    }
                    saldo -= valor;
                    break;

                case (3):
                    System.out.println("QUAL O VALOR QUE DESEJA RECEBER?");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    break;

                default:
                    System.out.println("BOBAO ESCREVEU OPCAO INVALIDA");
            }


        }

    }
}
