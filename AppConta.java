package PrjContas;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(12345, 30);
        System.out.println(cc.exibirDados());
        cc.setDeposito(100);
        cc.setSaque(10);
        cc.setDeposito(50);
        System.out.println("Saldo atual = " + cc.getSaldo());
        ContaPoupanca cp = new ContaPoupanca(123450);
        ContaPoupanca.setTaxa(5);
        System.out.println(cp.exibirDados());
        cp.setDeposito(15);
        cp.setSaque(20);
        System.out.println("Saldo atual = " + cp.getSaldo());
        ContaPoupanca cp2 = new ContaPoupanca(22220);
        System.out.println(cp2.exibirDados());
        cp2.setDeposito(1.5f);
        cp2.setSaque(2.0f);
        System.out.println("Saldo atual = " + cp2.getSaldo());
        ContaEspecial ce = new ContaEspecial(12349, 30);
        System.out.println(ce);
        ce.setDeposito(100);
        ce.setSaque(210);
        System.out.println("Saldo atual = " + ce.getSaldo());
    }
}