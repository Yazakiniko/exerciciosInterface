import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double reais = 500; // Saldo inicial
        double depoI = 0;   // Depósito inicial (caso seja feito um depósito inicial)
        double chequeEsp = 0; // Valor do cheque especial

        // Solicitar o nome, senha e número da conta
        System.out.println("Digite seu nome: ");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        System.out.println("Digite sua senha:");
        String senha = s.nextLine();   
        System.out.println("Digite o numero da sua conta bancária: ");
        int numConta = s.nextInt();

        // Perguntar se o usuário deseja realizar um depósito para possibilitar o cheque especial
        System.out.println("Deseja realizar um deposito para possibilitar o cheque especial? Y/N");
        String awns = s.nextLine();  // Consumir a quebra de linha restante após o nextInt()

        if(awns.equals("Y")){
            if(reais <= 500){
                depoI = 50;   // Depósito inicial de R$50
                reais += depoI;  // Atualiza o saldo com o depósito inicial
                System.out.println("Depósito inicial de R$50 realizado. Novo saldo: " + reais);
            } else {
                chequeEsp = reais * 0.5;  // 50% do saldo como cheque especial
                System.out.println("Cheque especial aprovado! Valor: " + chequeEsp);
            }
        } 

        // Exibir as opções para o usuário
        System.out.println("Bem-vindo " + nome + ", o que deseja realizar?");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar se a conta está usando cheque especial");

        // Receber a escolha do usuário
        int escolha = s.nextInt();

        // Processar a escolha do usuário
        switch (escolha) {
            case 1:
                System.out.println("Seu saldo é de: " + consultarSaldo(depoI, reais));
                break;

            case 2:
                // Exibir cheque especial se houver
                if (chequeEsp > 0) {
                    System.out.println("Cheque especial disponível: " + chequeEsp);
                } else {
                    System.out.println("Você não tem cheque especial.");
                }
                break;

            case 3:
                System.out.println("Digite o valor para depósito:");
                double deposito = s.nextDouble();
                reais += deposito; // Atualizando o saldo
                System.out.println("Depósito realizado! Novo saldo: " + reais);

                // Atualizando cheque especial se o valor do depósito for superior a R$500
                if (deposito > 500) {
                    chequeEsp = deposito * 0.5; // 50% do novo depósito como cheque especial
                    System.out.println("Cheque especial atualizado! Valor: " + chequeEsp);
                }
                break;

            case 4:
                System.out.println("Digite o valor para saque:");
                double saque = s.nextDouble();
                if (reais + chequeEsp >= saque) { // Verificando se há saldo ou cheque especial suficiente
                    reais -= saque; // Atualizando o saldo
                    System.out.println("Saque realizado! Novo saldo: " + reais);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                break;

            case 5:
                System.out.println("Digite o valor do boleto:");
                double boleto = s.nextDouble();
                if (reais + chequeEsp >= boleto) { // Verificando se há saldo ou cheque especial suficiente
                    reais -= boleto; // Atualizando o saldo
                    System.out.println("Boleto pago! Novo saldo: " + reais);
                } else {
                    System.out.println("Saldo insuficiente para pagar o boleto.");
                }
                break;
            
            case 6:
                System.out.println("Verificando se a conta está usando cheque especial...");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    // Método para consultar o saldo
    public static double consultarSaldo(double depoI, double reais){
        return depoI + reais;
    }
}
