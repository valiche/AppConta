package PrjContas;

public class ContaPoupanca extends Conta {
    private static float taxa; //repete o static
   
    public ContaPoupanca(int cod) {
        super(cod);
    }

    public static void setTaxa(float taxaP){
        if(taxaP >=0){
            taxa = taxaP;
        }
    }

    public float getTaxa(){
        return taxa;
    }

    @Override
    public void setSaque(float saque) {
        if (saque + taxa <= saldo) {
            saldo = saldo - saque - taxa;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    } 
    
    public String exibirDados(){
        return "Conta Poupança, taxa: "  +taxa + " | " + super.exibirDados();
    }
}