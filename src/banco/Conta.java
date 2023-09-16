package banco;

import java.util.Objects;

public class Conta {

    Pessoa titular;
    int agecia;
    int numero;
    double saldo;

    Conta(){

    }
    Conta(Pessoa titular, int agecia, int numero){

        Objects.requireNonNull(titular);

        this.titular = titular;
        this.agecia = agecia;
        this.numero = numero;

    };



    void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
        saldo = saldo + valor;

    }

    void sacar(double valor){

        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }

        if(saldo - valor < 0){
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo = saldo - valor;
    }

    void sacar(double valor, double taxaSaque){
       sacar(valor + taxaSaque);
    }

}
