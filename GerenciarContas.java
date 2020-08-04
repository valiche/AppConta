package PrjContas;

import java.util.ArrayList;

public class GerenciarContas {
    private ArrayList<Conta> listacontas;

    public GerenciarContas() {
        listacontas = new ArrayList<>();
    }

    public void novaConta(Conta conta) {
        listacontas.add(conta);
    }

    public String getInfo(int cod) {
        for (Conta contac : listacontas) {
            if (contac.getCod() == cod) {
                return contac.exibirDados();
            }
        }
        return "Conta não encontrada.";
    }

    public String efetSaque(int cod, float valor) {
        for (Conta contac : listacontas) {
            if (contac.getCod() == cod) {
                if (valor <= contac.getSaldo()) {
                    contac.setSaque(valor);
                    return "Saque efetuado. Saldo atual = " + contac.getSaldo();

                } else {
                    return "Saque não efetuado. Saldo insuficiente = " + contac.getSaldo();
                }
            }
        }
        return "Conta não encontrada.";

    }

    public String efetDeposito(int cod, float valor) {
        for (Conta contac : listacontas) {
            if (contac.getCod() == cod && valor > 0) {
                contac.setDeposito(valor);
                return "Depósito efetuado. Saldo atual = " + contac.getSaldo();
            }
        }
        return "Conta não encontrada.";
    }

}