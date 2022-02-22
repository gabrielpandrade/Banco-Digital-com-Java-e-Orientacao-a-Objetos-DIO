package projetobanco.contas;

import projetobanco.clientes.Cliente;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int Sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //Construtor

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = Sequencial++;
        this.cliente = cliente;
    }

    //Getters

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //Métodos da Interface

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato(){
        imprimirAtributos();
    }

    //Métodos da Classe

    public void imprimirAtributos(){
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: R$%.2f%n", this.saldo);
    }
}
