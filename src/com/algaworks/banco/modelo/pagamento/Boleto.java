package com.algaworks.banco.modelo.pagamento;

import com.algaworks.banco.modelo.Pessoa;

public class Boleto implements DocumentoPagavel, DocumentoEstornavel {
    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;

    }

    private Pessoa beneficiario;
    private double valor;
    private boolean pago;

    @Override
    public double getValorTotal() {
        return valor;
    }

    @Override
    public boolean estapago() {
        return pago;
    }

    @Override
    public void estornarPagamento() {
        pago = false;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }


}
