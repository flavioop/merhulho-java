package com.algaworks.banco.modelo;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(Pessoa titular, int agencia, int numero){
        super(titular, agencia, numero);

    }

    public void creditarRendimentos(double percentualJuros){

        double valorRendimento = getSaldo() * percentualJuros / 100;
        depositar(valorRendimento);
    }

}
