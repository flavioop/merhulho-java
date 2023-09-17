package com.algaworks.banco.modelo;

public class CaixaEletronico {
    public void impressaoSaldo(Conta conta){

        System.out.println("Conta: " + conta.getAgecia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());

    }

}
