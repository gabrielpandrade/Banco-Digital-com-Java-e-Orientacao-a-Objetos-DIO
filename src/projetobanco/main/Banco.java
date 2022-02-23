package projetobanco.main;

import projetobanco.contas.Conta;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimirContas(){
        for(int i=0;i<contas.size();i++){
            Conta conta = contas.get(i);
            System.out.printf("%d° Conta: %n", i+1);
            conta.imprimirAtributos();
        }
    }
}
