package PrjContas;

import java.util.Scanner;

public class AppMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod, op;
        float taxaP = 5, limite, valor;
        ContaPoupanca.setTaxa(taxaP);
        GerenciarContas contas = new GerenciarContas(); // substitui: ArrayList<Conta> contas = new ArrayList<>();

        do {
            System.out.println(
                    "Menu:\n 1- Nova conta corrente \n 2- Nova conta poupança \n 3-Nova conta especial \n 4-Saldo \n 5-Saque \n 6-Deposito \n 7-Sair \nOpção: ");
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Nova conta. Digite o número da conta corrente:");
                    cod = in.nextInt();
                    contas.novaConta(new ContaCorrente(cod)); // passou a ser no Gerenciar
                    break;
                case 2:
                    System.out.println("Nova conta. Digite o número da conta poupança:");
                    cod = in.nextInt();
                    contas.novaConta(new ContaPoupanca(cod)); // não necessita variável conta
                    break;
                case 3:
                    System.out.println("Nova conta. Digite o número da conta especial:");
                    cod = in.nextInt();
                    System.out.println("Qual será o limite?");
                    limite = in.nextFloat();
                    contas.novaConta(new ContaEspecial(cod, limite));
                    break;
                case 4:
                    System.out.println("Digite o número da conta:");
                    cod = in.nextInt();
                    System.out.println(contas.getInfo(cod));
                    break;
                case 5:
                    System.out.println("Digite o número da conta:");
                    cod = in.nextInt();
                    System.out.println("Valor saque:");
                    valor = in.nextFloat();
                    System.out.println(contas.efetSaque(cod, valor));
                    break;
                case 6:
                    System.out.println("Digite o número da conta:");
                    cod = in.nextInt();
                    System.out.println("Valor depósito:");
                    valor = in.nextFloat();
                    System.out.println(contas.efetDeposito(cod, valor));
    
                    break;
                case 7:
                    System.out.println("Sessão encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 7);
        in.close();
    }
}