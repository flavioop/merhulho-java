package com.algaworks.banco.modelo.atm;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.pagamento.DocumentoEstornavel;
import com.algaworks.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
    public void impressaoSaldo(Conta conta) {

        System.out.println("Conta: " + conta.getAgecia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());

    }

    public void pagar(DocumentoPagavel documento, Conta conta) {
        if (documento.estapago()) {
            throw new IllegalArgumentException("Documento já está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();

    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {

        if (!documento.estapago()) {
            throw new IllegalArgumentException("Documento não está pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}


