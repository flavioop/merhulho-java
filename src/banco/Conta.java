package banco;

import java.util.Objects;

public class Conta {

    private Pessoa titular;
    private int agecia;
    private int numero;
    private double saldo;

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

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgecia() {
        return agecia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }


}
