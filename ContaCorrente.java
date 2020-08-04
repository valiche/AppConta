package PrjContas;

public class ContaCorrente extends Conta {

    public ContaCorrente(int cod){
        super(cod);
    }
    
    public ContaCorrente(int cod, float saldo) {
        super(cod, saldo);
    }

    @Override
    public void setSaque(float saque) {
        if (saque <= saldo) {
            saldo = saldo - saque;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void setDeposito(float dep) {
        saldo = saldo + dep - 0.10f;
    }

    public String exibirDados(){
        return "Conta corrente | " + super.exibirDados();
    }
}