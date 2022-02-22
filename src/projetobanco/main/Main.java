package projetobanco.main;

import projetobanco.clientes.Cliente;
import projetobanco.contas.Conta;
import projetobanco.contas.ContaCorrente;
import projetobanco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");

        Conta cc = new ContaCorrente(gabriel);
        Conta cp = new ContaPoupanca(gabriel);

        cc.depositar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
