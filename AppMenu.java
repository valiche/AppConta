package PrjContas;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Conta conta = null;
        int cod, op;
        float taxaP = 5, limite, valor;
        ContaPoupanca.setTaxa(taxaP);
        ArrayList<Conta> contas = new ArrayList<>();
        boolean busca = false;

        do {
            System.out.println(
                    "Menu:\n 1- Nova conta corrente \n 2- Nova conta poupança \n 3-Nova conta especial \n 4-Saldo \n 5-Saque \n 6-Deposito \n 7-Sair \nOpção: ");
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Nova conta. Digite o número da conta corrente:");
                    cod = in.nextInt();
                    conta = new ContaCorrente(cod);
                    contas.add(conta);
                    break;
                case 2:
                    System.out.println("Nova conta. Digite o número da conta poupança:");
                    cod = in.nextInt();
                    conta = new ContaPoupanca(cod);
                    contas.add(conta);
                    break;
                case 3:
                    System.out.println("Nova conta. Digite o número da conta especial:");
                    cod = in.nextInt();
                    System.out.println("Qual será o limite?");
                    limite = in.nextFloat();
                    conta = new ContaEspecial(cod, limite);
                    contas.add(conta);
                    break;
                case 4:
                    System.out.println("Digite o número da conta:");
                    cod = in.nextInt();
                    busca = false;
                    for (Conta contac : contas) {
                        if (contac.getCod() == cod) {
                            busca = true;
                            System.out.println(contac.exibirDados());
                            break;
                        }
                    }
                    if (busca == false) { //ou if (!achou)
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Digite o número da conta:");
                    cod = in.nextInt();
                    busca = false;
                    for (Conta contac : contas) {
                        if (contac.getCod() == cod) {
                            busca = true;
                            System.out.printf("Saldo = %.2f | Selecione valor para saque:", contac.getSaldo());
                            valor = in.nextFloat();
                            contac.setSaque(valor);
                            System.out.println("Saldo atual = " + contac.getSaldo());
                            break;
                        }
                    }
                    if (busca == false) { //ou if (!achou)
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 6:
                    System.out.println("Digite o número da conta:");
                    cod = in.nextInt();
                    busca = false;
                    for (Conta contac : contas) {
                        busca = true;
                        if (contac.getCod() == cod) {
                            System.out.printf("Saldo = %.2f | Qual o valor do depósito?", contac.getSaldo());
                            valor = in.nextFloat();
                            contac.setDeposito(valor);
                            System.out.println("Saldo atual = " + contac.getSaldo());
                            break;
                        }
                    }
                    if (!busca) {
                        System.out.println("Conta não encontrada.");
                    }
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