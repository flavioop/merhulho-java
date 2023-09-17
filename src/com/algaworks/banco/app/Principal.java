package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da silva");
        titular1.setDocumento("1231231313");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("22222236666511");

        ContaInvestimento minhaContaIvestimento = new ContaInvestimento(titular1,123,987);
        /*Conta minhaConta = new Conta(titular1,123,987);
        Conta suaConta = new Conta(titular2, 222, 333);*/
        ContaEspecial contaEspecial = new ContaEspecial(titular1, 222, 333, 1000);
       /* minhaConta.titular = titular1;
        minhaConta.agecia = 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 15.000;*/



        CaixaEletronico caixaEletronico = new CaixaEletronico();


        /*suaConta.setTitular(titular2);
        suaConta.setAgecia (222);
        suaConta.setNumero = (333);
        //suaConta.saldo = 30.000;*/

        contaEspecial.depositar(15_000);
        contaEspecial.sacar(1_000);


        minhaContaIvestimento.depositar(15_000);
        minhaContaIvestimento.sacar(1_000);
        minhaContaIvestimento.creditarRendimentos(0.8);
        minhaContaIvestimento.debitarTarifaMensal();


        contaEspecial.depositar(30.000);
        contaEspecial.depositar(15.000);

        contaEspecial.sacar(0.000, 10);
        contaEspecial.debitarTarifaMensal();

        caixaEletronico.impressaoSaldo(minhaContaIvestimento);

        /*System.out.println("Titular conta investimento: " + minhaContaIvestimento.getTitular().getNome());
        System.out.println("Titular conta investimento: " + minhaContaIvestimento.getSaldo());

        System.out.println("Titular minha conta: " + minhaConta.getTitular().getNome());
        System.out.println("Titular minha conta: " + minhaConta.getSaldo());

        System.out.println("Titular sua conta: " + suaConta.getTitular().getNome());
        System.out.println("Titular sua conta: " + suaConta.getSaldo());

        System.out.println("Titular sua conta Especial: " + contaEspecial.getTitular().getNome());
        System.out.println("Titular sua conta Especial: " + contaEspecial.getSaldo());*/

    }
}
