package projetobanco.main;

import projetobanco.clientes.Cliente;
import projetobanco.contas.Conta;
import projetobanco.contas.ContaCorrente;
import projetobanco.contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<Conta>();

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");

        Conta cc = new ContaCorrente(gabriel);
        Conta cp = new ContaPoupanca(gabriel);

        contas.add(cc);
        contas.add(cp);

        Banco banco = new Banco("ASUV", contas);

        banco.imprimirContas();
    }
}
