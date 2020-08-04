package PrjContas;

public abstract class Conta { //classe não instancia objetos, só serve de superclass
    protected int cod;
    protected float saldo;

    public Conta(int cod, float saldo) {
        this.cod = cod;
        this.saldo = saldo;
    }

    public Conta(int cod) {
        this.cod = cod;
        saldo =0;
    }

    public String exibirDados() {
        return "Número da Conta: " + cod + " | Saldo: " + saldo;
    }

    public void setDeposito(float dep) {
        saldo = saldo + dep;
    }

    public void setSaque(float saque) {
        saldo = saldo - saque;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}