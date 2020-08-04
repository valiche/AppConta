package PrjContas;

public class ContaEspecial extends Conta {
    float limite;
   
    public ContaEspecial(int cod, float limite) {
        super(cod);
        this.limite = limite;
    }

    @Override
    public void setSaque(float saque) {
        if (saque <= saldo + limite) {
            saldo = saldo - saque;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    public String exibirDados(){
        return "Conta Especial, limite: " + limite +" | " + super.exibirDados();
    }

    @Override
    public String toString() {
        return exibirDados();
    }
}