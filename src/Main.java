import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco conta = null;
        while (true) {
            String menu = ("""
                    ----Menu----
                    1. Criar conta [CP - Poupança | CC - Corrente]
                    2. Fechar conta
                    3. Depositar
                    4. Sacar
                    5. Saldo
                    6. Pagamento Mensalidade
                    0. Sair
                    """);
            System.out.println(menu);
            System.out.println("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do Dono: ");
                    String dono = scanner.nextLine();

                    System.out.println("Tipo da conta (CP ou CC)");
                    try {
                        String tipoString = scanner.nextLine();
                        TipoConta tipo = TipoConta.valueOf(tipoString.toUpperCase());

                        Random random = new Random();
                        int numConta = 1000 + random.nextInt(9000);

                        conta = new ContaBanco(numConta, tipo, dono);
                        conta.abrirConta();
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERRO: O tipo de conta informado é inválido. Por favor, use 'CP' ou 'CC'.");

                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (conta != null) {
                        if (opcao == 2) {
                            conta.fecharConta();
                        } else if (opcao == 3) {
                            System.out.println("Valor para deposito: ");
                            double deposito = scanner.nextDouble();
                            scanner.nextLine();
                            conta.depositar(deposito);
                        } else if (opcao == 4) {
                            System.out.println("Valor para saque: ");
                            double saque = scanner.nextDouble();
                            scanner.nextLine();
                            conta.sacar(saque);
                        }else if (opcao == 5){
                            conta.saldoConta();

                        }else{
                            conta.pagarMensal();

                        }
                    } else {
                        System.out.println("Nenhuma conta foi criada ainda. Crie uma conta primeiro.");
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}