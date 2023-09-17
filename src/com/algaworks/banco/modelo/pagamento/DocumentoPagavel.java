package com.algaworks.banco.modelo.pagamento;

public interface DocumentoPagavel  {

    double getValorTotal();
    boolean estapago();
    void quitarPagamento();
    default void imprimirRecibo(){

        System.out.println("RECIBO");
        System.out.println("Valor total: "+ getValorTotal());
        System.out.println("Pago: "+ estapago());

    }


}
